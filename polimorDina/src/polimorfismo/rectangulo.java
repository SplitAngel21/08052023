package polimorfismo;
/**
 *
 * @author angel
 */
public class rectangulo extends figura{
    public rectangulo(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del rectangulo es->"+lado*base);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del rectangulo es->"+(lado*2)+(base*2));
    }
}
