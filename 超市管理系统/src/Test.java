import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        IMemberService iMemberService = new MemberServiceImpl();
        iMemberService.showMenu();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a){
            case 1:
                Card card = iMemberService.openCard();
                iMemberService.saveCard(card);
                break;
        }
    }
}
