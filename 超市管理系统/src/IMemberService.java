public interface IMemberService {

    void showMenu();//显示菜单
    Card openCard();//开卡

    void saveCard(Card card);

    Card login(String name,String pwd);//登录

    void saveScore(Card card,int a);//存储积分
}
