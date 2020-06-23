package baitapDaopattern2;

import java.util.ArrayList;
import java.util.Optional;

public interface SinhVienDAO {
    public ArrayList<SinhVien> getAllSinhvien();
    public Optional<SinhVien> getSinhvien(String ID);
    public void addSinhvien(SinhVien s);
    public void updateSinhvien(SinhVien s);
    public void deleteSinhvien(SinhVien s);
}
