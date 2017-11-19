public class DoWhileTest {
    public static void main(String[] args) {
        //定义变量count
        int count = 1;
        int sum = 0;
        //执行do while循环
        do {
            System.out.println(count);
            //循环迭代语句
            sum = sum+1;
            count++;

            //循环条件紧跟while关键字
        }while (count<10);
        System.out.println("循环结束");
    }
}
