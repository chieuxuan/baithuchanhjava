package sinhvien;
import java.util.Scanner;
public class person {
    private int ID;
    private String name;
    private void nhap () {
        System.out.println("nhap ID = ");
        Scanner scanner = new Scanner(System.in);
        ID = scanner.nextInt();
        System.out.println("nhap name = ");
        name = scanner.nextLine();
    }
    private void xuat() {
        System.out.println("ID la : " + ID);
        System.out.println("Ten sinh vien la : " + name);
    }
}