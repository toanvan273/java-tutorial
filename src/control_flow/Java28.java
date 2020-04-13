package control_flow;

public class Java28 {
    public static void main(String[] args) {
        int count = 0;
        int i = 99;
        for(;;){
            if(i%5==0){
                System.out.println(i);
                count++;
            }
            if(count==50) break;
            i++;
        }
    }
}
