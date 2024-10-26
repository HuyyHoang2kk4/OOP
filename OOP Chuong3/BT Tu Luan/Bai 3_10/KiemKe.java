import java.util.ArrayList;
import java.util.Scanner;

public class KiemKe {
    private ArrayList<PhuongTienGT> danhSachPhuongTien = new ArrayList<>();

    public void nhapDangKyPhuongTien() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
            "Chon loại phuong tien \n" +
            "1. O to" +
            "2.Xe May" +
            "3.Xe Tai"
        );

        int loaiPhuongTien = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Mo Hinh: ");
        String moHinh = scanner.nextLine();
        System.out.print("Nam san xuat: ");
        int namSanXuat = scanner.nextInt();
        System.out.print("Gia ban: ");
        double giaBan = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Mau xe: ");
        String mau = scanner.nextLine();

        switch (loaiPhuongTien) {
            case 1:
                System.out.println("So cho ngoi :");
                int soChoNgoi = scanner.nextInt();
                System.out.println("Kieu dong co");
                String kieuDongCo = scanner.nextLine();
                danhSachPhuongTien.add(new OTo(moHinh, namSanXuat, giaBan, mau, soChoNgoi, kieuDongCo));
                break;
            
            case 2:
                System.out.println("Cong suat");
                double congSuat = scanner.nextDouble();
                danhSachPhuongTien.add(new XeMay(moHinh , namSanXuat , giaBan , mau ,congSuat));
                break;

            case 3:
                System.out.println("Trong tai :");
                double trongTai = scanner.nextDouble();
                danhSachPhuongTien.add(new XeTai(moHinh , namSanXuat , giaBan , mau, trongTai));
                break;
            default:
                System.out.println("Phuong tien chon khong hop le");
                break;
        }

    }

    public void timPhuongTienTheoMoHinh(String moHinh) {
        for(PhuongTienGT phuongTien : danhSachPhuongTien ) {
            if(phuongTien.getMoHinh().equals(moHinh)){
                phuongTien.hienThiThongTin();
            }
        }
    }

    public void timPhuongTienTheoMau(String mau) {
        for (PhuongTienGT phuongTien : danhSachPhuongTien) {
            if (phuongTien.getMau().equals(mau)) {
                phuongTien.hienThiThongTin();
            }
        }
    }

    public void ketThuc() {
        System.out.println("ket thuc chuong trinh");
    }
    
}
