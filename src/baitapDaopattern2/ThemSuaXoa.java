package baitapDaopattern2;

import java.util.ArrayList;

public class ThemSuaXoa {
    public static void main(String[] args) {
        ArrayList listHS = new ArrayList();
        String t1 = "Truong Van Toan";
        listHS.add(t1);
        String t2 = "Nguyen Van Hung";
        listHS.add(t2);
        String t3 = "Expo shoks";
        listHS.add(t3);
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i)); // lấy ra từng đối tượng theo chỉ số
        }
        // chèn thêm 1 đối tượng vào 1 vị trí bất kỳ của ArrayList
        listHS.add(1,"Mint Mint");

        // Sửa 1 đối tượng nào đó
        listHS.set(1,"Nguyen Hoang Anh");

        // Xóa 1 phần tử bất kỳ tại vị trí index
        listHS.remove(2);
        System.out.println(listHS.size());
        // Xóa toàn bộ các phần tử
        listHS.clear();
        for (int i = 0; i < listHS.size(); i++) {
            System.out.println(listHS.get(i)); // lấy ra từng đối tượng theo chỉ số
        }
    }
}
