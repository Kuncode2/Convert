import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        try (Scanner con = new Scanner(System.in)) {
            System.out.println("In kilometer: ");
            double km = con.nextDouble();
            double miles = (0.6213*km);
            System.out.println("In miles"+miles);
        }


    }
        
    
    
}
