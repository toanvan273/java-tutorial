package baitapinterface;

public class HinhTru extends HinhTron {
    protected float chieuCao;

    public HinhTru(float banKinh, float chieuCao) {
        super(banKinh);
        this.chieuCao=chieuCao;
    }

    @Override
    public float tinhTheTich() {
        float dienTich = this.tinhDienTich();
        return chieuCao*dienTich;
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("The tich: "+this.tinhTheTich());
    }
}
