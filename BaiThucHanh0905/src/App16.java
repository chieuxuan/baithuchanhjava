import java.util.ArrayList;
public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");
        System.out.println("Cac phan tu co trong arrLisstString la: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
        System.out.print("\n");
        arrListString.set(2,"Python");
        arrListString.remove(1);
        System.out.println("Cac phan tu co trong arrLisstString la: ");
        for(int i=0; i < arrListString.size(); i++){
            System.out.println(arrListString.get(i) + "\t");
        }
    }
}