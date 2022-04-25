package khachhang;
import java.util.Scanner;
import sinhvien.person;

public class Customer extends person{
    public int solanmuahang;
    private void nhap() {
        System.out.println("nhap so lan mua hang: ");
        Scanner scanner = new Scanner(System.in);
        solanmuahang = scanner.nextInt();
    }
}
