package java_exercise_p1;

public class Java1 {
    public static void startGraph(int x, int y) {
        String X = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                X = j == y - 1 ? X + " * \n" : X + " * ";
            }
        }
        System.out.println(X);
    }

    public static void emplyGrap(int x, int y) {
        String Y = "";
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j == y - 1) {
                    Y = Y + " * \n";
                } else if (j == 0) {
                    Y = Y + "* ";
                } else {
                    if (i == 0 || i == x - 1) {
                        Y = Y + " * ";
                    } else {
                        Y = Y + "   ";
                    }
                }
            }
        }
        System.out.println(Y);
    }

    public static void heighScreen(int k) {
        int tick = k - 1;
        String intTree = "";
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= i; j++) {
                if(j==i){
//                    intTree=intTree+j+"\n";
                    System.out.println(j);
                }else{
                    System.out.print(j);
//                    intTree=intTree+j;
//                    System.out.println(intTree);
                }

            }
        }
        System.out.println(intTree);
    }

    static void vuiNha(int x) {
        int k = x - 1;
        String A = "";
        for (int i = 1; i < x; i++) {
            A = A + i;
        }
        StringBuilder B = new StringBuilder();
        B.append(A).reverse().toString();
        String Z = A + x + B;
        System.out.println(A);
    }

    public static void main(String[] args) {
//        emplyGrap(10, 10);
        heighScreen(4);
    }
}
