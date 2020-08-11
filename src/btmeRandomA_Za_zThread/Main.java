package btmeRandomA_Za_zThread;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        ThreadOne threadOne = new ThreadOne(sharedData);
        ThreadTwo threadTwo = new ThreadTwo(sharedData);

        threadOne.start();
        threadTwo.start();
    }
}
