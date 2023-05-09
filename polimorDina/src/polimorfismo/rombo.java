package polimorfismo;
/**
 *
 * @author angel
 */
public class rombo extends figura{
    public rombo (double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del rombo es->"+(lado*base)/2);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del rombo es->"+(lado*2)+(base*2));
    }
}
