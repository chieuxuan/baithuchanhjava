package sinhvien;
import java.util.Scanner;

public class onlineStudent extends student {
    public String classname;
    public void nhap() {
        System.out.println("nhap ten lop: ");
        Scanner scanner = new Scanner(System.in);
        classname = scanner.nextLine();
    }
}
