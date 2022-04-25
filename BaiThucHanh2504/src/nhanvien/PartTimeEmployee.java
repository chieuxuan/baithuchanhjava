package nhanvien;
import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    public int songaylamviec;
    public float luong;
    public void ngaycong() {
        System.out.println("nhap so ngay lam viec: ");
        Scanner scanner = new Scanner(System.in);
        songaylamviec = scanner.nextInt();
    }
    public void tienluong() {
        luong = songaylamviec * 50000;
        System.out.println("so tien luong la: " + luong);
    }
}
