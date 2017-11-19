public class StringTest {
    public static void main(String[] args) {
        String s = new String("abcdefg");
        System.out.println(s.charAt(3));

        String s1 = new String("abc");
        String s2 = new String("abcd");
        String s3 = new String("abcde");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));

        String s4 = "aabbcc";
        System.out.println(s4.endsWith("cc"));

        String s5 = "adadacbcdefg";
        System.out.println(s5.indexOf('c'));
        System.out.println(s5.startsWith("ad"));
        System.out.println(s5.toUpperCase());
    }
}
