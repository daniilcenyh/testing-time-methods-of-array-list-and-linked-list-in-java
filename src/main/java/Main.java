import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST: LinkedList");
        var linkedList = new LinkedList<Integer>();
        var linkedListTimeTest = new LinkedListMethodTimeTesting(linkedList, 0, 10000);
        System.out.println(linkedListTimeTest.testMethodAdd(1000));
        System.out.println(linkedListTimeTest.testMethodGet(1000));
        System.out.println(linkedListTimeTest.testMethodDelete(1000));

        System.out.println("TEST: ArrayList");

        var arrayList = new ArrayList<Integer>();
        var arrayListTimeTest = new ArrayListMethodTimeTesting(arrayList, 0, 10000);
        System.out.println(arrayListTimeTest.testMethodAdd(1000));
        System.out.println(linkedListTimeTest.testMethodGet(1000));
        System.out.println(linkedListTimeTest.testMethodDelete(1000));
    }
}
