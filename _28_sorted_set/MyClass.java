package _28_sorted_set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyClass {
    public static void main(String[] args) {
        /*
        implementation của SortedSet như sau:
            TreeSet
         */
        TreeSet sortedSet = new TreeSet();
//      add(): thêm phần tử.
        sortedSet.add("a");
        sortedSet.add("c");
        sortedSet.add("b");
//      remove(): xóa phần tử.
//        sortedSet.remove("c");
//      first(): lấy phần tử đầu tiên.
        System.out.println(sortedSet.first());
//      last(): lấy phần tử cuối cùng.
        System.out.println("----");
        System.out.println(sortedSet.last());
//      duyệt các phần tử.
        System.out.println("----");
        Iterator iterator = sortedSet.iterator();
        while (iterator.hasNext()){
            System.out.println((String) iterator.next());
        }
//      descendingIterator(): sắp xếp giảm dần.
        System.out.println("----");
        Iterator iterator1 = sortedSet.descendingIterator();
        while (iterator1.hasNext()){
            System.out.println((String) iterator1.next());
        }
//      headSet(): lấy các phần tử từ đầu SortedSet đến phần tử cho trước
        SortedSet headSet = sortedSet.headSet("c");
        System.out.println("----");
        Iterator iterator2 = headSet.iterator();
        while (iterator2.hasNext()){
            System.out.println((String) iterator2.next());
        }
//      tailSet(): lấy các phần tử từ phần tử cho trước đến phần tử cuối SortedSet
        SortedSet tailSet = sortedSet.tailSet("b");
        System.out.println("----");
        Iterator iterator3 = tailSet.iterator();
        while (iterator3.hasNext()){
            System.out.println((String) iterator3.next());
        }
    }
}
