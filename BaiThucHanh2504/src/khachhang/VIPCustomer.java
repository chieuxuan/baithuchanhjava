package khachhang;
import java.util.Scanner;
import sinhvien.person;

public class VIPCustomer extends person{
    public String hoten;
    public float sotiendamua;
    private void nhap() {
        System.out.println("nhap ho ten: ");
        Scanner scanner = new Scanner(System.in);
        hoten = scanner.nextLine();
        System.out.println("nhap so tien da mua: ");
        sotiendamua = scanner.nextInt();
    }
}
