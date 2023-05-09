package polimorfismo;
/**
 *
 * @author angel
 */
public class figuras {
    public static double area(double lado){
        return (lado*lado);
    }
    public static double area (double lado1, double lado2){
        return (lado1*lado2);
    }
    public static double area (float radio){
        return (3.141516*radio*radio);
    }
    public static double area (float lado, double apotema){
        return ((lado*6)*(apotema/2));
    }
    public static double area (float lado, float apotema){
        return ((lado*5)*(apotema/2));
    }
    public static double area (double base1, double base2, double altura){
        return (((base1+base2)/2)*altura);
    }
    public static double area (double altura, float base){
        return (base*(altura/2));
    }
    public static double area (float lado1, float lado2, float diagonal1, float diagonal2){
        return ((diagonal1*diagonal2)/2);
    }
    public static double perimetro (double lado1, double lado2, double lado3, double lado4){
        return (lado1+lado2+lado3+lado4);
    }
    public static double perimetro (double radio){
        return ((radio+2)*3.141516);
    }
    public static double perimetro (float lado){
        return (lado*5);
    }
    public static double perimetro (double lado1, double lado2){
        return (lado1*6);
    }
}
