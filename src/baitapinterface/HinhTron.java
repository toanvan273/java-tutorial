package baitapinterface;

public abstract class HinhTron implements HinhHoc {
    protected float banKinh;
    public HinhTron(float banKinh){
        this.banKinh=banKinh;
    }
    @Override
    public float tinhChuVi() {
        return 2*PI*banKinh;
    }

    @Override
    public float tinhDienTich() {
        return PI*banKinh*banKinh;
    }




    @Override
    public void xuatThongTin() {
        System.out.println("Chu vi: "+this.tinhChuVi());
        System.out.println("Dien tich: "+this.tinhDienTich());
    }
}
