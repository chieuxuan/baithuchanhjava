package phuongtien;

public class TaxiCar implements Car{
    public void Move() {
        System.out.println("taxi di chuyen");
    }
    public void Stop() {
        System.out.println("taxi dung lai");
    }
    public void TurnRight() {
        System.out.println("taxi re phai");
    }
    public void TurnLeft() {
        System.out.println("taxi re trai");
    }
    public void Reverse() {
        System.out.println("taxi quay dau xe");
    }
}
