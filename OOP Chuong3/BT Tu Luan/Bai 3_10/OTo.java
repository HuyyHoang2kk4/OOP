// package Bai3_10;
public class OTo extends PhuongTienGT {
    private int soChoNgoi;
    private String kieuCoDong;

    public OTo(String moHinh, int namSanXuat, double giaBan, String mau, int soChoNgoi, String kieuCoDong) {
        super(moHinh, namSanXuat, giaBan, mau);
        this.soChoNgoi = soChoNgoi;
        this.kieuCoDong = kieuCoDong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Số chỗ ngồi: " + soChoNgoi);
        System.out.println("Kiểu động cơ: " + kieuCoDong);
    }
}