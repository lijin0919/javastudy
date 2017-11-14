import java.util.HashMap;
import java.util.Map;

/*
保存映射关系数据
key不允许重复
key-value单向一对一
所有key组成一个set集合
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a",11);
        map.put("b",22);
        map.put("c",33);
        System.out.println(map.put("c",99));//返回被覆盖的value
        System.out.println(map.containsKey("a"));//是否包含指定key
        System.out.println(map.containsValue(33));//是否包含value

        map.keySet().forEach(a -> System.out.println(a));
    }
}
