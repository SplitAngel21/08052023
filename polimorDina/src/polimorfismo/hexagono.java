package polimorfismo;
/**
 *
 * @author angel
 */
public class hexagono extends figura{
    public hexagono(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del hexagono es->"+((lado*6)*(apotema/2)));
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del hexagono es->"+6*lado);
    }
}
