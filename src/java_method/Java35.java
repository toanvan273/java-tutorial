package java_method;

import java.util.Arrays;
import java.util.Scanner;

public class Java35 {
    public static int[] nhapMang(int n, Scanner scanner) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static String[] tachXau(String str){
        String[] res = str.split(" ");
        return res;
    }
    public static void suatTunggiatri(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;
        int n1 = 5, n2 = 10, n3 = 11;
        Scanner scanner = new Scanner(System.in);
//        arr1 = nhapMang(n1, scanner);
//        arr2 = nhapMang(n2, scanner);
//        arr3 = nhapMang(n3, scanner);
       String t = "Khi nao may ao giao sat nen sang pho hoi cua hang";
       String[] strs = tachXau(t);
        suatTunggiatri(strs);
//        System.out.println(Arrays.toString(strs));
    }
}
