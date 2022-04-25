import sinhvien.student;
import nhanvien.FullTimeEployee;
import nhanvien.PartTimeEmployee;
import sinhvien.offlineStudent;
import dongvat.Tiger;
import phuongtien.TaxiCar;
public class App {
    public static void main(String[] args) throws Exception {
       student st = new student();
       st.nhap();
       st.xuat();
       FullTimeEployee fte = new FullTimeEployee();
       fte.nhap();
       PartTimeEmployee pte = new PartTimeEmployee();
       pte.tienluong();
       pte.ngaycong();
       offlineStudent ofls = new offlineStudent();
       ofls.nhap();
       ofls.xuat();
       Tiger tg = new Tiger();
       tg.sleep();
       tg.Eat();
       tg.walk();
       tg.run();
       tg.Eat();
       TaxiCar tc = new TaxiCar();
       tc.Move();
       tc.Reverse();
       tc.Stop();
       tc.TurnLeft();
       tc.TurnRight();
    }
}
