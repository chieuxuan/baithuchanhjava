package sinhvien;
import java.util.Scanner;

public class student extends person {
   public boolean gioitinh;
   public String quequan;
   public int namsinh;
   public void nhap() {
       System.out.println("nhap nam sinh: ");
       Scanner scanner = new Scanner(System.in);
       namsinh = scanner.nextInt();
   }
   public void xuat() {
       int tuoi = 2022 - namsinh;
       System.out.println(+ tuoi);
   }
}

