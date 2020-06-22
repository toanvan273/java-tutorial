package baitapinterface;

public class HinhTru2 implements HinhHoc {
    protected String ten;
    protected float banKinh;
    protected float chieuCao;
    public HinhTru2(float banKinh,float chieuCao){
        super();
        this.ten="===== Hinh Tru 2 ======";
        this.banKinh=banKinh;
        this.chieuCao=chieuCao;
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
    public float tinhTheTich() {
        return tinhDienTich()*chieuCao;
    }

    @Override
    public void xuatThongTin() {
        System.out.println(ten);
        System.out.println("Chu vi: "+tinhChuVi());
        System.out.println("Dien tich: "+tinhDienTich());
        System.out.println("The tich: "+tinhTheTich());
    }
}
