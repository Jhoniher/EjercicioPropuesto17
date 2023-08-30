
package ejerciciopropuesto17;

import java.util.Scanner;

public class EjercicioPropuesto17 {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double radio, area, circunferencia;
        System.out.println("Ingrese el radio del circulo: ");
        radio=entrada.nextDouble(); //Se ingresa el radio del circulo
        area=Math.PI*Math.pow(radio,2); //Se calcula el area
        circunferencia=2*Math.PI*radio; //Se calcula la circunferencia
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia es: "+circunferencia);
    }
    
}
