/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureconverter;

/**
 *
 * @author Sonal
 */
public class TemperatureConverter {

    /**
     * @param args the command line arguments
     */
    static double convertCelciusToFahrenheit(double celcius){
        return (celcius * 9/5) + 32;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double start = Double.parseDouble(args[0]);
        double end = Double.parseDouble(args[1]);
        
        for (double i=start;i<=end; ++i){
            System.out.print(i + " in fahrenheit: ");
            System.out.format("%.2f",convertCelciusToFahrenheit(i));
            System.out.println();
        }
        
        
    }
    
}
