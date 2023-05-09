package polimorfismo;
/**
 *
 * @author angel
 */
public class pentagono extends figura{
    public pentagono(int lado, int base, int apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del pentagono es->"+((lado*5)*(apotema/2)));
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del pentagono es->"+5*lado);
    }
}
