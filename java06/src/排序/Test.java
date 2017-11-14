package 排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setNumber(5);
        Student student2 = new Student();
        student2.setNumber(2);
        Student student3 = new Student();
        student3.setNumber(1);
        Student student4 = new Student();
        student4.setNumber(4);

        ArrayList list = new ArrayList();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        System.out.println("排序前");
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student.getNumber());
        }


        System.out.println("排序后");
        Collections.sort(list);
        iterator = list.iterator();

        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student.getNumber());
        }

        int index = Collections.binarySearch(list,student3);
//        System.out.println(index);
    }
}
