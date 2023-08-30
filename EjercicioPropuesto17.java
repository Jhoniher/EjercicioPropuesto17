
package ejerciciopropuesto17;

import java.util.Scanner;

public class EjercicioPropuesto17 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double radio, area, circunferencia;
        System.out.println("Ingrese el radio del circulo: ");
        radio=entrada.nextDouble();
        area=Math.PI*Math.pow(radio,2);
        circunferencia=2*Math.PI*radio;
    }
    
}
