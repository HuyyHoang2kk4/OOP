// Hãy xây dựng lớp SinhVien trong ngôn ngữ lập trình Java với các thuộc tính riêng (private) bao gồm:

// Số báo danh
// Họ và tên sinh viên
// Địa chỉ
// Môn học
// Điểm thi học kỳ I và II
// Yêu cầu:

// a) Viết các phương thức truy cập (getter và setter) cho các thuộc tính của lớp SinhVien và viết phương thức tạo lập cho lớp này.

// b) Viết chương trình chính để tạo ra danh sách sinh viên và hiển thị thực đơn với các lựa chọn sau:

// Nhập vào thông tin về sinh viên.
// Xem thông tin về sinh viên.
// Tìm sinh viên theo điểm thi.
// Kết thúc chương trình.
// c) Viết các hàm thành phần của lớp để thực hiện các nhiệm vụ trên.


public class Bai3_9 {
    private String sbd;
    private String hoTen;
    private String diaChi;
    private String monHoc;
    private double diemThiHK1;
    private double diemThiHK2;

    public Bai3_9(String sbd , String hoTen , String diaChi , String monHoc , double diemThiHK1 , double diemThiHK2) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.monHoc = monHoc;
        this.diemThiHK1 = diemThiHK1 ;
        this.diemThiHK2 = diemThiHK2;
    }
    //getter setter
    public String getsbd() {
        return sbd;
    }

    public void setsbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public double getDiemThiHK1() {
        return diemThiHK1;
    }

    public void setDiemThiHK1(double diemThiHK1) {
        this.diemThiHK1 = diemThiHK1;
    }

    public double getDiemThiHK2() {
        return diemThiHK2;
    }
    //Viet chuong trinh tao sinh vien
    public void hienThiThongTinSV() {
        System.out.println("Số báo danh: " + sbd);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Môn học: " + monHoc);
        System.out.println("Điểm thi HK1: " + diemThiHK1);
        System.out.println("Điểm thi HK2: " + diemThiHK2);
    }


}




