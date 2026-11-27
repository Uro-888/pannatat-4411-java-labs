package udomsilp.pannatat.lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsCalculator {
        public static void main(String[] args) {
            if (args.length != 3) {
                System.err.println("Error: Invalid number of arguments. Please provide exactly three arguments");
            return;}
            Double principle = Double.parseDouble(args[0]);
            Double rate = Double.parseDouble(args[1]);
            int numyear = Integer.parseInt(args[2]);
            if (principle < 0 || rate < 0 || numyear < 0) {
                System.err.println("Error: The principal, rate, and years must not be negative");
            }
            Double totalamount = principle*(Math.pow(1+rate/100,numyear));
            
            BigDecimal roundprinciple = BigDecimal.valueOf(principle).setScale(2,RoundingMode.HALF_UP);
            BigDecimal roundtotalamount = BigDecimal.valueOf(totalamount).setScale(2,RoundingMode.HALF_UP);
            
            
            
            System.out.println("Principle: "+roundprinciple+" Baht");
            System.out.println("Amount after "+ numyear +" years: "+roundtotalamount+" Baht");
        }
}
