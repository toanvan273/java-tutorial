package docghifileFileInputStreamFileOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class   Main {
    public static void main(String[] args) {
//        File file =new File("test1.txt");
//        if(file.isFile()){
////            file.delete();
//            System.out.println("File :"+file.getAbsolutePath());
//        }else {
//            System.out.println("not found");
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        DataInputStream inputStream = new DataInputStream(System.in);
//        System.out.println("Nhap N: ");
//        String N = "v";
//        try {
//            N = inputStream.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Integer.parseInt(N));

        //=== doc du lieu tu file
//        FileInputStream fileInputStream = null;
//        FileOutputStream fileOutputStream = null;
//        try {
//             fileInputStream = new FileInputStream("test.txt");
//             fileOutputStream = new FileOutputStream("test_cp.txt");
//            int ch = fileInputStream.read();
//            System.out.println("ch +"+ch);
//            while ((ch)!= -1){
//                System.out.println((char) ch);
//                fileOutputStream.write(ch);
//                break;
//            }
//        } catch (FileNotFoundException e) {
////            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,e);
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if(fileInputStream != null){
//                try {
//                    fileInputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(fileOutputStream != null){
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        //=== FileReader
//        FileReader reader = null;
//        FileWriter writer = null;
//        try {
//             reader = new FileReader("test.txt");
//             writer = new FileWriter("test_cp2.txt");
//            int ch;
//            while ((ch = reader.read()) != -1){
//                System.out.println((char) ch);
//                writer.write(ch);
//            }
//            reader.read();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //====
//        String str = "Hello World";
//        byte[] bObj = str.getBytes();
//        ByteArrayInputStream inputByte = new ByteArrayInputStream(bObj);
//        System.out.println(inputByte);
        // ====
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream =  null;
        try{
            fileInputStream = new FileInputStream("test.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedInputStream.available();
        }catch (Exception e){

        }finally {

        }
    }
}
