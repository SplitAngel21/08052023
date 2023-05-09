package polimorfismo;
/**
 *
 * @author angel
 */
public class circulo extends figura{
    public circulo (double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del circulo es->"+lado*3.141516);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del circulo es->"+3.141516*lado*lado);
    }
}
