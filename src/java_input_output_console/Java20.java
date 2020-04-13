package java_input_output_console;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Java20 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter("fileinfo-my-account.txt", StandardCharsets.UTF_8);
        printWriter.append("Thong tin cu dau mat roi");
        printWriter.close();
    }
}
