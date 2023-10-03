import java.util.*;

public class App {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a=sc.nextDouble();
        System.out.println((-2<=a && a<=3) || (6<=a && a<=9));
        
    }
}