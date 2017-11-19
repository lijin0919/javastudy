public class 包装类常用方法 {
    public static void main(String[] args) {
        String string = "99";

        int a = Integer.parseInt(string);
        int b = new Integer(string);
        String string2 = String.valueOf(100);
        String string3 = String.valueOf(true);
        System.out.println(string3);
    }
}
