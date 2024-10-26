import java.util.Scanner;

public class PhanSo {
    private int tuSo1;
    private int mauSo1;

    private int tuSo2;
    private int mauSo2;

    private PhanSo(int tuSo, int mauSo) {
        this.tuSo1 = tuSo;
        this.mauSo1 = mauSo;
        toiGianPhanSo1();
    }
    public PhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PS thu 1 : \n");
        System.out.print("TS thu 1: ");
        tuSo1 = scanner.nextInt();
        System.out.print("MS thu 1: ");
        mauSo1 = scanner.nextInt();
        if (mauSo1 == 0) {
            throw new ArithmeticException("MS = 0 (khong thoa man)");
        }

        System.out.println("PS thu 2 : \n");
        System.out.print("TS thu 2: ");
        tuSo2 = scanner.nextInt();
        System.out.print("MS thu 2: ");
        mauSo2 = scanner.nextInt();
        if (mauSo2 == 0) {
            throw new ArithmeticException("MS = 0 (khong thoa man)");
        }

        toiGianPhanSo1();
        toiGianPhanSo2();
    }

    private int ucln(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void toiGianPhanSo1() {
        int ucln = ucln(tuSo1, mauSo1);
        tuSo1 = tuSo1 / ucln;
        mauSo1 = mauSo1 / ucln;
    }

    private void toiGianPhanSo2() {
        int ucln = ucln(tuSo2, mauSo2);
        tuSo2 = tuSo2 / ucln;
        mauSo2 = mauSo2 / ucln;
    }

    public PhanSo cong() {
        int tu = tuSo1 * mauSo2 + tuSo2 * mauSo1;
        int mau = mauSo1 * mauSo2;
        return new PhanSo(tu, mau);
    }

    public PhanSo tru() {
        int tu = tuSo1 * mauSo2 - tuSo2 * mauSo1;
        int mau = mauSo1 * mauSo2;
        return new PhanSo(tu, mau);
    }

    public PhanSo nhan() {
        int tu = tuSo1 * tuSo2;
        int mau = mauSo1 * mauSo2;
        return new PhanSo(tu, mau);
    }

    public PhanSo chia() {
        if (tuSo2 == 0) {
            throw new ArithmeticException("Cannot divide by zero (tuSo2 = 0)");
        }
        int tu = tuSo1 * mauSo2;
        int mau = mauSo1 * tuSo2;
        return new PhanSo(tu, mau);
    }

    public void hienThiPhanSo1() {
        System.out.println("Phân số 1: " + tuSo1 + "/" + mauSo1);
    }

    public void hienThiPhanSo2() {
        System.out.println("Phân số 2: " + tuSo2 + "/" + mauSo2);
    }

    public void hienThi() {
        System.out.println("Phân số: " + tuSo1 + "/" + mauSo1);
    }

    public static void main(String[] args) {
        PhanSo ps = new PhanSo();

        ps.hienThiPhanSo1();
        ps.hienThiPhanSo2();

        System.out.println("Cộng: ");
        ps.cong().hienThi();

        System.out.println("Trừ: ");
        ps.tru().hienThi();

        System.out.println("Nhân: ");
        ps.nhan().hienThi();

        System.out.println("Chia: ");
        ps.chia().hienThi();
    }
}
