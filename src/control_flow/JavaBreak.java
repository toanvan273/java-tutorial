package control_flow;

public class JavaBreak {
    public static void main(String[] args) {
//        int count = 0;
//        int i = 99;
//        for(int j=0;j<10;j++){
//            count = 0;
//            for(;;){
//                if(i%5==0){
//                    System.out.println(i);
//                    count++;
//                }
//                if(count==5) {
//                    System.out.println("Break j = "+j);
//                    break;
//                }
//                i++;
//            }
//            if(j==3) break;
//        }
        for (int i = 0; i < 50; i++) {
            if (i % 5 == 0 || i % 2 == 0 || i % 3 == 0) continue;
            System.out.println(i);
        }
    }
}
