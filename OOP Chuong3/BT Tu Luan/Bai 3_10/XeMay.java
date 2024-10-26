// package Bai 3.10;

public class XeMay extends PhuongTienGT {
    private double congSuat;

    public XeMay(String moHinh, int namSanXuat, double giaBan, String mau, double congSuat) {
        super(moHinh, namSanXuat, giaBan, mau);
        this.congSuat = congSuat;
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.println("Cong suat : " + congSuat + "km/h");
    }

    
    
}
