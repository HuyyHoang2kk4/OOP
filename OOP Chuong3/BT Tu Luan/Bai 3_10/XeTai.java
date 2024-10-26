// package Bai 3.10;

public class XeTai extends PhuongTienGT {
    private double trongTai;

    public XeTai(String moHinh, int namSanXuat, double giaBan, String mau, double trongTai) {
        super(moHinh, namSanXuat, giaBan, mau);
        this.trongTai = trongTai;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Trong tai: " + trongTai + " tan");
    }
}
