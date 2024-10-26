// Một công ty được giao nhiệm vụ quản lý các phương tiện giao thông, bao gồm các loại ô tô, xe máy và xe tải. Mỗi phương tiện giao thông cần quản lý các thông tin sau:

// Mô hình
// Năm sản xuất
// Giá bán
// Màu
// Các yêu cầu cụ thể:

// Đối với ô tô: Cần quản lý thêm thông tin về:

// Số chỗ ngồi
// Kiểu động cơ
// Đối với xe máy: Cần quản lý thêm thông tin về:

// Công suất
// Đối với xe tải: Cần quản lý thêm thông tin về:

// Trọng tải
// Các yêu cầu thực hiện:
// a) Hãy xây dựng các lớp XeTai, XeMay, và OTo kế thừa từ lớp PhuongTienGT.

// b) Xây dựng các phương thức để truy cập, hiển thị và kiểm tra các thuộc tính của các lớp.

// c) Phát triển lớp KiemKe để quản lý tất cả các phương tiện (xe máy, ô tô, xe tải), trong đó có hàm chính thực hiện theo thực đơn:

// Nhập đăng ký phương tiện.
// Tìm phương tiện theo mô hình.
// Tìm phương tiện theo màu.
// Kết thúc.
// d) Viết các hàm để thực hiện các nhiệm vụ trên
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