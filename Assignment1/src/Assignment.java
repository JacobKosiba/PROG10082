import java.math.RoundingMode;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter IIA: ");
        double IIA = input.nextDouble(); // Declares IIA

        System.out.println("Enter AIR: ");
        double AIR = input.nextDouble(); //Declares Air

        System.out.println("Enter amount of Years: ");
        int Years = input.nextInt(); //Declares Years

        double MIR = AIR / 1200;

        double FIA = IIA * Math.pow(1+MIR, 12 * Years);


        System.out.println("Future invest amount is calculated: " + String.format("%.4f",FIA ));

        int FIAI = (int) FIA;
        System.out.println("After conversion to integer FIAI is: " + FIAI);

        char[]digits = String.valueOf(FIAI).toCharArray();
        for (int i = 0; i< digits.length; i++){
            System.out.println("digit" + (i + 1) + "=" + digits[i]);


        }



    }
}

