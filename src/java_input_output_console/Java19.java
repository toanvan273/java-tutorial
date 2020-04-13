package java_input_output_console;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Java19 {
    public static void main(String[] args) throws IOException {
        Scanner scanner =
                new Scanner(Paths.get("D:\\fileinfo-my-account.txt"));
//        String inputInteget ;
        PrintWriter print = new PrintWriter("fileinfo-my-account.txt", StandardCharsets.UTF_8);
        PrintWriter printTruong = new PrintWriter("KQ.Truong",StandardCharsets.UTF_8);
        while (scanner.hasNext()){
            String wordLine = scanner.next();
            print.println(wordLine);
            printTruong.println(wordLine);
            System.out.println(wordLine);
        }
//        scanner.nextLine(); //
//        boolean lineData = scanner.hasNext();
//        System.out.println("Second line data: "+ lineData);
        print.close();
        printTruong.close();
        scanner.close();

    }
}
