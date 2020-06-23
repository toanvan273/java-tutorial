package baitapDaopattern2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SinhVienImpl implements SinhVienDAO{
    ArrayList<SinhVien> SvArr = new ArrayList<SinhVien>();
    public static void saveToFile(List<SinhVien> data) throws IOException{
    }
    @Override
    public ArrayList<SinhVien> getAllSinhvien() {
        return SvArr;
    }

    @Override
    public Optional<SinhVien> getSinhvien(String ID) {
        return SvArr.stream().filter(s -> s.getID().equals(ID)).findFirst();
    }

    @Override
    public void addSinhvien(SinhVien s) {
       SvArr.add(s);
    }

    @Override
    public void updateSinhvien(SinhVien s) {
        SinhVien oldSinhVien = getSinhvien(s.getID()).get();
        oldSinhVien.setName(s.getName());
        oldSinhVien.setScore(s.getScore());
    }

    @Override
    public void deleteSinhvien(SinhVien s) {
        SvArr.remove(s);
    }
}
