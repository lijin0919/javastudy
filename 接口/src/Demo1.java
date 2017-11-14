public interface Demo1 {
    /*
    系统自动为接口的成员变量增加public static final
     */
    String NAME = "卡卡西";

    /*
    普通方法只能是public抽象方法
     */
    void say();

    /*
    java8允许有默认方法
    系统自动public
     */
    default void qianniao(){
        System.out.println("体术奥义：千年杀");
    }

    /*
    java8允许类方法
    自动public
     */
    static void tianzhao(){
        System.out.println("天照");
    }
}
