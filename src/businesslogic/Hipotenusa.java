
package businesslogic;

// Class Hipotenusa

public class Hipotenusa {
public double lado1;
public double lado2;
public double hipotenusa;

public double CalcularHip(double lado1,double lado2){
    hipotenusa = Math.sqrt(Math.pow(lado1,2))+(Math.pow(lado2,2));
    return hipotenusa;
    }
    
}

