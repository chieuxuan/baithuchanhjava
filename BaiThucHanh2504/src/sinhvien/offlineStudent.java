package sinhvien;
import java.util.Scanner;

public class offlineStudent extends student {
    public int sosinhvien;
    public void nhap() {
        System.out.println("nhap so sinh vien: ");
        Scanner scanner = new Scanner(System.in);
        sosinhvien = scanner.nextInt();
    }
    public void xuat() {
        System.out.println("So sinh vien di hoc tro lai la: " + sosinhvien);
    }
}
