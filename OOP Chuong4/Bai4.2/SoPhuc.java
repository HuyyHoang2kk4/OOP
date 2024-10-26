
//Xây dựng lớp các số phức C om plex (gồm phần thực và phần ảo) với các phép toán +, *, / và nhập, hiển thị các số phức.

import java.util.Scanner;

public class SoPhuc {
    private int phanThuc1 , phanAo1;
    private int phanThuc2 , phanAo2;
    private int kqPhanThuc , kqPhanAo;

    public SoPhuc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thuc thu nhat \n");
        System.out.println("Phan thuc cua so thu nhat : ");
        phanThuc1 = scanner.nextInt();
        System.out.println("Phan ao cua so thu nhat :");
        phanAo1 = scanner.nextInt();


        System.out.println("Nhap so thuc thu hai \n");
        System.out.println("Phan thuc cua so thu hai : ");
        phanThuc2 = scanner.nextInt();
        System.out.println("Phan ao cua so thu hai :");
        phanAo2 = scanner.nextInt();
        
    }

    public SoPhuc(int phanThuc , int phanAo) {
        this.kqPhanAo = phanAo;
        this.kqPhanThuc = phanThuc;
    }

    public SoPhuc cong() {
        this.kqPhanThuc = phanThuc1 + phanThuc2;
        this.kqPhanAo = phanAo1 + phanAo2;

        return new SoPhuc(kqPhanThuc, kqPhanAo);
    }

    public SoPhuc tru() {
        this.kqPhanThuc = phanThuc1 - phanThuc2;
        this.kqPhanAo = phanAo1 - phanAo2;

        return new SoPhuc(kqPhanThuc, kqPhanAo);
    }

    public SoPhuc nhan() {
        this.kqPhanThuc = phanThuc1 * phanThuc2;
        this.kqPhanAo = phanAo1 * phanAo2;

        return new SoPhuc(kqPhanThuc, kqPhanAo);
    }

    public void hienThiSoPhucThu1() {
        System.out.println("So phuc thu nhat :" + this.phanThuc1 + "+" + this.phanAo1 +"i");
    }

    public void hienThiSoPhucThu2() {
        System.out.println("So phuc thu nhat :" + this.phanThuc2 + "+" + this.phanAo2 +"i");
    }

    public void hienThiKetQua() {
        if( kqPhanAo ==0) {
            System.out.println("Ket qua la :" + this.kqPhanThuc );
        }else {
            System.out.println("Ket qua la :" + this.kqPhanThuc + "+" + this.kqPhanAo + "i");
        }
    }

    public static void main(String[] args) {
        SoPhuc sp = new SoPhuc();
        
        sp.hienThiSoPhucThu1();
        sp.hienThiSoPhucThu2();

        System.out.println("Phep cong :");
        sp.cong().hienThiKetQua();

        System.out.println("Phep tru :");
        sp.tru().hienThiKetQua();

        System.out.println("Phep nhan :");
        sp.nhan().hienThiKetQua();
    }
}
