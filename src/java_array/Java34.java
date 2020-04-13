package java_array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Java34 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 3, 53, 3, 4, 2, 12, 423, 43, 33};
        String[] names = {"Thanh", "Hoa", "Hung", "Minh", "An", "Song", "Que"};
//        String res = Arrays.toString(names);
//        System.out.println(res);
//        Arrays.sort(arr);
////        Arrays.sort(names);
//        int index = Arrays.binarySearch(names,0,3, "Song");
////        Arrays.sort(names, Comparator.reverseOrder());
////        System.out.println(Arrays.toString(arr));
        String[] name2 = Arrays.copyOf(names, names.length);

        System.out.println("Names :" + Arrays.toString(names));

        System.out.println("Name2 :" + Arrays.toString(name2));

        System.out.println("is names equals name2 ?"+Arrays.equals(names,name2));

        int[] myArr = new int[20];
        Arrays.fill(myArr,77);
        System.out.println(Arrays.toString(myArr));
    }
}
