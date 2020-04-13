package java_array;

import java.util.Arrays;

/*
Mang 2 chiều trong Java:
- Định nghĩa, khai báo, khởi tạo
- Truy xuất phần tử mảng
- Sử dụng foreach với mảng 2 chiều
- Mảng zigzag
 */
public class Java35 {
    public static void main(String[] args) {
    // tổng quát: kiểu[][] tên mảng;

        int[][] arr = new int[4][3];
    /* chỉ số bất kỳ phải bắt đầu 0 -> langth-1 */
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[arr.length-1][arr[0].length-1] = -99;
        boolean[][] booleans = new boolean[9][9];

        String[][] strings = new String[2][2];

        int[][] arr2 = {
                {1,2,4,3,3,4},
                {1,1,1,1,1,6},
                {4,4,4,4,4,4},
        };
//        for(String[] S:strings){
//            for(String x:S){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[0].length; j++) {
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        for(int[] x:arr2){
//            for(int y:x){
//                System.out.print(y+" ");
//            }
//            System.out.println();
//        }
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j< arr[0].length;j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

        int[][] arr3=new int[10][];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = new int[i+1];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("So cot cua hang thu "+i+": "+ Arrays.toString(arr3[i]) );
        }
    }
}
