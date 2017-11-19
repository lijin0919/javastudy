import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class MemberDao {
	Scanner input = new Scanner(System.in);
	List<Member> memberList = new ArrayList<Member>();
	
	public void menu(){
		System.out.println("*************************欢迎进入超市会员管理系统*************************");
		System.out.println("1.积分累计       2.积分兑换       3.查询剩余积分       4.修改密码       5.开卡       6.退出");
		System.out.println("*******************************************************************");
		System.out.print("请选择：");
	}
	
	public void start(){
		do{
			menu();
			int choose = input.nextInt();
			switch(choose){
				case 1:
					if (saveScore()) {
						System.out.println("积分累计成功！");
					} else {
						System.out.println("积分累计失败！");
					}
					continue;
				case 2:
					if (minusScore()) {
						System.out.println("积分兑换成功！");
					} else {
						System.out.println("积分兑换失败！");
					}
					continue;
				case 3:
					showScore();
					continue;
				case 4:
					if (changePwd()) {
						System.out.println("密码修改成功！");
					} else {
						System.out.println("密码修改失败！");
					}
					continue;
				case 5:
					register();
					continue;
				case 6:
					System.out.println("感谢您的使用，欢迎下次使用！");
					break;
				default:
					System.out.println("您的操作有误，请重新选择：");
					continue;
			}
			break;
		}while(true);	
	}
	
	//查询会员是否存在,会员密码不区分大小写
	public Member hasMember(Member member){
		if(member.getPassword()!=null){
			for (int i = 0; i < memberList.size(); i++) {
				if(memberList.get(i).getCardId()==member.getCardId() && memberList.get(i).getPassword().equalsIgnoreCase(member.getPassword())){
					return memberList.get(i);
				}
			}
		}else{
			for (int i = 0; i < memberList.size(); i++) {
				if(memberList.get(i).getCardId()==member.getCardId()){
					return memberList.get(i);
				}
			}
		}
		return null;
	}
	
	//修改会员密码
	public boolean changePwd(){
		Member member=new Member();
		System.out.print("请输入您的会员卡号：");
		member.setCardId(input.nextInt());
		System.out.print("请输入您的会员卡密码：");
		member.setPassword(input.next());
		if((member=hasMember(member))!=null){
			System.out.print("请输入新的会员密码：");
			//新的会员密码不能小于6位
			String pwd;
			boolean flag = true;
			do{
				pwd = input.next();
				if(pwd.length()<6){
					System.out.print("会员密码不能小于6位，请重新输入会员密码：");
					flag = false;
				}else{
					flag = true;
					member.setPassword(pwd);
				}
			}while(!flag);
			return true;
		}else{
			System.out.println("您输入的会员卡号或密码错误,无法修改密码！");
		}
		return false;
	}
	
	//积分累计
	public boolean saveScore(){
		Member member=new Member();
		System.out.print("请输入您的会员卡号：");
		member.setCardId(input.nextInt());
		System.out.print("请输入您的会员卡密码：");
		member.setPassword(input.next());
		if((member=hasMember(member))!=null){
			System.out.print("请输入您此次消费金额（消费1元累计1积分）：");
			int score=input.nextInt();
			member.setScore(member.getScore()+score);
			return true;
		}else{
			System.out.println("您输入的会员卡号或密码错误，无法积累积分！");
		}
		return false;
	}
	
	//积分兑换
	public boolean minusScore(){
		Member member=new Member();
		System.out.print("请输入您的会员卡号：");
		member.setCardId(input.nextInt());
		System.out.print("请输入您的会员卡密码：");
		member.setPassword(input.next());
		if((member=hasMember(member))!=null){
			System.out.print("请输入您需要兑换使用的积分（100积分抵用0.1元，不足100的积分不做抵用）：");
			int score=input.nextInt();
			if(score<=member.getScore()){
				member.setScore(member.getScore()-score);
				System.out.println("您的消费金额中使用会员积分抵消"+score/100*0.1+"元");
				return true;
			}else{
				System.out.println("抱歉，您的积分不够，无法抵用消费金额.");
			}
		}else{
			System.out.println("您输入的会员卡号或密码错误，无法完成积分兑换！");
		}
		return false;
	}
	
	//生成随机卡号
	public int createId(){
		boolean flag=true;
		Random random = new Random();
		int id=random.nextInt(99999999);
		for(Member member:memberList){
			if(member.getCardId()==id){
				id=random.nextInt(99999999);
			}
		}
		return id;
	}
	
	//开卡
	public void register(){
		Member member=new Member();
		System.out.print("请输入注册姓名：");
		member.setName(input.next());
		//会员卡号随机生成
		member.setCardId(this.createId());
		System.out.print("请输入注册密码：");
		//会员密码不能小于6位
		String pwd;
		boolean flag = true;
		do{
			pwd = input.next();
			if(pwd.length()<6){
				System.out.print("会员密码不能小于6位，请重新输入注册密码：");
				flag = false;
			}else{
				flag = true;
				member.setPassword(pwd);
			}
		}while(!flag);
		member.setScore(100);
		
		//增加会员开卡日期
		Date date = new Date();
		String registDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
		member.setRegistDate(registDate);
		
		memberList.add(member);
		System.out.println("恭喜，开通会员卡成功，系统赠送您100积分！您的会员卡号为："+member.getCardId());
	}
	
	//查询积分
	public void showScore(){
		Member member=new Member();
		System.out.print("请输入您的会员卡号：");
		member.setCardId(input.nextInt());
		System.out.print("请输入您的会员卡密码：");
		member.setPassword(input.next());
		if((member=hasMember(member))!=null){
			System.out.println("姓名\t会员卡号\t剩余积分\t开卡日期");
			System.out.println(member.getName()+"\t\t"+member.getCardId()+"\t\t"+member.getScore()+"\t\t"+member.getRegistDate());	
		}else{
			System.out.println("您输入的会员卡号或密码错误，无法查询积分！");
		}
	}
}
