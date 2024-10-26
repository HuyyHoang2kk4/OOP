public class PhuongTienGT {
    private String moHinh;
    private int namSanXuat;
    private double giaBan;
    private String mau;

    public PhuongTienGT(String moHinh, int namSanXuat, double giaBan, String mau) {
        this.moHinh = moHinh;
        this.namSanXuat = namSanXuat;
        this.giaBan = giaBan;
        this.mau = mau;
    }

    public String getMoHinh() {
        return moHinh;
    }

    public String getMau() {
        return mau;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void hienThiThongTin() {
        System.out.println("Mô hình: " + moHinh);
        System.out.println("Năm sản xuất: " + namSanXuat);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Màu: " + mau);
    }
}