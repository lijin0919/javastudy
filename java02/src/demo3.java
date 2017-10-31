public class demo3 {

    public static void main(String[] args) {
        int[]a = new int[10];
        a[0] = 5;
        int[] b = a;
        b[0] = 16;
        System.out.println(a[0]);



        int[] a1 = {1,2,3,4,5};
        int[] a2 = a1;
        for (int i = 0; i < a2.length; i++) {
            a2[i]++;
        }
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
