package polimorfismo;
/**
 *
 * @author angel
 */
public class trapecio extends figura{
    public trapecio(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del trapecio es->"+((lado+base)/2)*apotema);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del trapecio es->"+lado+base+(apotema*2));
    }
}
