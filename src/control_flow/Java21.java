package control_flow;

public class Java21 {
    public static void main(String[] args) {
        int a = 5;
        if (a % 2 == 0) {
            System.out.println("a la so chan.");
        } else {
            System.out.println("a la so le.");
        }
//        for(int i = 0;i<100;i++){
//            if(i%5==0){
//                System.out.println(i);
//            }
//        }
//        int i = 100;
//        while (i>=0){
//            System.out.println(i);
//            i--;
//        }
//        for (;;){
//            System.out.println(i);
//            i+=100;
//        }

        int i = 9;
        do {
            System.out.println(i);
            i--;
        }while (i>=0);

    }
}
