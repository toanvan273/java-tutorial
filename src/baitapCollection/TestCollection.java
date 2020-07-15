package baitapCollection;

import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("A1");
//        list.add("A2");
//        list.add("A3");
//
//        // xoa phan tu
//        list.remove(0);
//        list.add("ABC");
//        list.add("A4");
////        list.set(2,"ABC");
//
//        // swrap phan tu
//        String tmp = list.get(2);
//        list.set(2,list.get(3));
//        list.set(3,tmp);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        Vector<String> list2 = new Vector<>();
//        list2.add("bibi");
//        list2.add("hehe");
//        list2.add(0,"ChimcHim");
//        for (int i = 0; i < list2.size(); i++) {
//            System.out.println(list2.get(i));
//        }

        // LinkedList
//        LinkedList<String> list3 = new LinkedList<>();
//        list3.add("AB");
//        list3.add("NN");
//        list3.add("MM");
//
//        list3.addFirst("1");
//        list3.addLast("9");
////        for (int i = 0; i < list3.size(); i++) {
////            System.out.println(list3.get(i));
////        }
//
//        System.out.println(list3.getLast());

        // Phan Sets
        HashMap<String, String> map = new HashMap<>();
        map.put("fullName","Tran Van Toan");
        map.put("class","Lop 7");
        map.put("address", "Hai Duong");
//        System.out.println(map.get("fullName"));

        HashMap<String, StudentX> studentXHashMap = new HashMap<>();
        StudentX st = new StudentX("X1","Tran Van A");
        studentXHashMap.put(st.rollNo, st);
        st = new StudentX("X2","Giang Tran");
        studentXHashMap.put(st.rollNo,st);
        StudentX st2 = studentXHashMap.get("X1");
//        st2.output();
        // --Làm thế nào để tìm tất cả các key đã có trong Map?
        Set<String> keys = map.keySet();
        // --cach duyet cac phan tu trong HashMap
        keys.forEach(key -> {
//            System.out.println(key);
//            System.out.println(map.get(key));
        });
        // --Lam the nao biet tat ca Value trong HashMap
        Collection<StudentX> values = studentXHashMap.values();
//        System.out.println( "values:"+ values);
//        System.out.println(map);
        // Xoa phan tu trong HashMap
        map.remove("class");
        // --Check xem key co ton tai trong HashMap ko
        boolean a = map.containsKey("fullNam");
//        System.out.println(map);

        //Stack - xếp sách
        // Queue - xếp hàng mua vé
        PriorityQueue<String> queue = new PriorityQueue<>();
//        queue.add("A1");
//        queue.offer("A2");
//        queue.add("A3");
//        System.out.println("queue: "+queue.poll()); // A1
//        System.out.println("queue: "+queue.poll());  // A2
//        System.out.println("queue: "+queue.poll());   //A3

        Stack<String> stack = new Stack<>();
        stack.add("B1");
        stack.add("B2");
        stack.add("B3");
//        System.out.println(stack.pop()); // B3
//        System.out.println(stack.pop()); // B2
//        System.out.println(stack.pop()); // B1
        System.out.println(stack);

        //-- Generic: tao Generic ntn
        Controller<StudentX> controller = new Controller<>();
        controller.add(new StudentX("R1","A"));
        controller.add(new StudentX("R2","B"));
        System.out.println(controller.get(0).toString());
    }
}
