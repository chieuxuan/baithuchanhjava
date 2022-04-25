package nhanvien;
import java.util.Scanner;
import sinhvien.person;
public class Employee extends person {
    public int manhanvien;
    public String chucvu;
    public void nhap() {
        System.out.println("nhap ma nhan vien: ");
        Scanner scanner = new Scanner(System.in);
        manhanvien = scanner.nextInt();
    }
}