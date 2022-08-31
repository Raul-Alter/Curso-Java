package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        //(F - 32) * 5 / 9 = C
        final double fator = 5.0 / 9.0;
        final double ajuste = 32;
        
        double fahrenheit = 86;
        double celcius = (fahrenheit - ajuste) * fator;
        
        System.out.println("O resultado é " + celcius + "C");
        
        fahrenheit = 150;
        celcius = (fahrenheit - ajuste) * fator;
        System.out.println("O resultado é " + celcius + "C");
    }
}
