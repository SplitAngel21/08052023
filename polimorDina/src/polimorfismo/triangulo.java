package polimorfismo;
/**
 *
 * @author angel
 */
public class triangulo extends figura{
    public triangulo(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del triangulo es->"+(base*lado)/2);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del triangulo es->"+3*lado);
    }
}
