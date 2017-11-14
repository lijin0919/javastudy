import java.util.LinkedList;

/*
List接口的实现类，可以根据索引随机访问集合中的元素
既可以是栈，也可以是队列
内部以链表形式保存集合元素，随机访问能力较差
插入删除效率高
 */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //加入队列尾部
        linkedList.offer("a");
        //栈顶
        linkedList.push("b");
        //队列头
        linkedList.offerFirst("c");

        //访问不删除栈顶元素
        System.out.println(linkedList.peekFirst());
        //访问不删除队列最后一个元素
        System.out.println(linkedList.peekLast());
        //栈顶元素弹出
        System.out.println(linkedList.pop());
        //删除队列最后一个元素
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
    }
}
