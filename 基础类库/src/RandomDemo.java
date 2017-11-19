import java.util.Random;

public class RandomDemo {
    /*
    生成伪随机数
     */
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextDouble());
        Random random1 = new Random(10);

        System.out.println(random1.nextInt());

        Random random2 = new Random(10);

        System.out.println(random2.nextInt());

        Random random3 = new Random(100);

        System.out.println(random3.nextInt());
    }
}
