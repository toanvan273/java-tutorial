package java_exercise_p1;

import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        int h =6;
        Scanner scanner = new Scanner(System.in);
//        h = scanner.nextInt();
        int x, output;

        for(int i = 1;i<= h; i++){
            for(int j = 0; j<= 2*h; j++){
                x = j-h;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;
                System.out.printf("%3d", output);
//                if(output > 0){
//                    System.out.printf("%3d", output);
//                } else{
//                    System.out.printf("   ");
//                }
            }
            System.out.println();
        }

    }
}
