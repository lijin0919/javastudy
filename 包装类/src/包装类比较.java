public class 包装类比较 {
    public static void main(String[] args) {
        System.out.println(new Integer(9) == new Integer(9));

        Integer a = 9;
        Integer b = 9;
        System.out.println(a == b);

        Integer c = 299;
        Integer d = 299;

        System.out.println(c == d);
    }
}
