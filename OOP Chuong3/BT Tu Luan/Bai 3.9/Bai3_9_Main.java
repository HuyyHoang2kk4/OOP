import java.util.ArrayList;
import java.util.Scanner;

public class Bai3_9_Main {
    static ArrayList<Bai3_9> danhSachSinhVien = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChon;

        do {
            hienThiMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            luaChon = scanner.nextInt();
            scanner.nextLine();

            switch (luaChon) {
                case 1:
                    nhapThongTinSinhVien();
                    break;
                case 2:
                    xemThongTinSinhVien();
                    break;
                case 3:
                    timSinhVienTheoDiem();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Hay thu lai");
            }
        } while (luaChon != 4);
    }

    // Hiển thị menu
    public static void hienThiMenu() {
        System.out.println("\n====== Quản Lý Sinh Viên ======");
        System.out.println("1. Nhập thông tin sinh viên");
        System.out.println("2. Xem thông tin sinh viên");
        System.out.println("3. Tìm sinh viên theo điểm");
        System.out.println("4. Kết thúc chương trình");
    }

    // Nhập thông tin sinh viên
    public static void nhapThongTinSinhVien() {
        System.out.print("Nhập số báo danh: ");
        String sbd = scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Nhập môn học: ");
        String monHoc = scanner.nextLine();
        System.out.print("Nhập điểm thi HK1: ");
        double diemThiHK1 = scanner.nextDouble();
        System.out.print("Nhập điểm thi HK2: ");
        double diemThiHK2 = scanner.nextDouble();
        scanner.nextLine(); 
        Bai3_9 sinhVien = new Bai3_9(sbd, hoTen, diaChi, monHoc, diemThiHK1, diemThiHK2);
        danhSachSinhVien.add(sinhVien);
        System.out.println("Đã thêm sinh viên thành công.");
    }

    // Xem thông tin sinh viên
    public static void xemThongTinSinhVien() {
        if (danhSachSinhVien.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Bai3_9 sv : danhSachSinhVien) {
                sv.hienThiThongTinSV();
                System.out.println("---------------------");
            }
        }
    }

    // Tìm sinh viên theo điểm
    public static void timSinhVienTheoDiem() {
        System.out.print("Nhập điểm cần tìm: ");
        double diemTimKiem = scanner.nextDouble();
        boolean found = false;

        for (Bai3_9 sv : danhSachSinhVien) {
            if (sv.getDiemThiHK1() == diemTimKiem || sv.getDiemThiHK2() == diemTimKiem) {
                sv.hienThiThongTinSV();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có điểm phù hợp.");
        }
    }
}
