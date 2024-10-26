import java.util.Scanner;

public class Bai3_10_Main {

    public static void main(String[] args) {
        KiemKe kiemKe = new KiemKe();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Dang ky phuong tien");
            System.out.println("2. Tim phuong tien theo mo hinh");
            System.out.println("3. Tim phuong tien theo mau");
            System.out.println("4. ket thuc");
            System.out.print("Chọn chuc nang: ");
            int luaChon = scanner.nextInt();
            scanner.nextLine(); 

            switch (luaChon) {
                case 1:
                    kiemKe.nhapDangKyPhuongTien();
                    break;
                case 2:
                    System.out.print("Mo hinh : ");
                    String moHinh = scanner.nextLine();
                    kiemKe.timPhuongTienTheoMoHinh(moHinh);
                    break;
                case 3:
                    System.out.print("Mau can tim ");
                    String mau = scanner.nextLine();
                    kiemKe.timPhuongTienTheoMau(mau);
                    break;
                case 4:
                    kiemKe.ketThuc();
                    return;
                default:
                    System.out.println("Lua chon k hop le!");
            }
        }
    }
}
