import java.util.Scanner;

public class arvjav {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a temperature:");
        double userTemp = myScanner.nextDouble();
        System.out.print("Please enter whether the temperature given was in \"F\" or \"C\":");
        String tempType = myScanner.next();
        
        if(tempType.equals("F")) {
            double newTemp = (userTemp-32)*5/9;
            System.out.println(newTemp + " Celsius");
        }
        else if(tempType.equals("C")) {
            double newTemp = (userTemp*9)/5+32;
            System.out.println(newTemp + " Fahrenheit");
        }
        else {
            System.out.println("Invalid temperature type!");
        }
        myScanner.close();
    }
}
