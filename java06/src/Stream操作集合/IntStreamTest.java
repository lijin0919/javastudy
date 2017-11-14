package Stream操作集合;

import java.util.stream.IntStream;
//stream
public class IntStreamTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.builder()
                .add(10)
                .add(20)
                .add(30)
                .build();

//        System.out.println(intStream.max().getAsInt());//最大值
//        System.out.println(intStream.min().getAsInt());//最小值
//        System.out.println(intStream.sum());//总和
//        System.out.println(intStream.count());//总数
//        System.out.println(intStream.average());//平均数
//        System.out.println(intStream.allMatch(a -> a>20));//是否所有元素都大于20
//        System.out.println(intStream.anyMatch(a -> a>20));//是否包含任何元素大于20
        IntStream intStream1 = intStream.map(a -> a*2);//映射成新的stream
        intStream1.forEach(System.out::println);//表示引用
    }
}
