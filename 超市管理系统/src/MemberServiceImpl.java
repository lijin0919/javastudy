import java.awt.image.ImageConsumer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MemberServiceImpl implements IMemberService{

    private Scanner scanner;

    public MemberServiceImpl() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void showMenu() {
        System.out.println("*************************欢迎进入超市会员管理系统*************************");
        System.out.println("1.积分累计       2.积分兑换       3.查询剩余积分       4.修改密码       5.开卡       6.退出");
        System.out.println("*******************************************************************");
        System.out.print("请选择：");
    }

    @Override
    public Card openCard() {
        Card card = new Card();
        System.out.println("请输入注册姓名");
        String userName = scanner.next();
        String passWord = scanner.next();
        Date date = new Date();
        int no = makeCardNo();
        card.setCardId(no);
        return card;
    }

    @Override
    public void saveCard(Card card) {

        if(MemberList.cardArrayList == null){
            MemberList.cardArrayList = new ArrayList<>();
        }

        MemberList.cardArrayList.add(card);
    }

    @Override
    public Card login(String name, String pwd) {
        if (MemberList.cardArrayList.size()>0){
            for (Card c:MemberList.cardArrayList
                 ) {
                if (c.getName().equals(name)&&c.getPassword().equals(pwd)){
                    saveScore(c,10);
                    return c;
                }
            }
        }
        return null;
    }

    @Override
    public void saveScore(Card card, int a) {

        card.setScore(card.getScore()+a);
    }

    //生成随机数
    private int makeCardNo(){
        return 0;
    }

}
