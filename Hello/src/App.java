import java.util.*;

public class App {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a=sc.nextDouble();
        System.out.println((-3<=a && a<=5) || (9<=a && a<=15));
        
    }
}
