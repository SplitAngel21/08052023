package polimorfismo;
/**
 *
 * @author angel
 */
public class cuadrado extends figura{
    public cuadrado(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del cuadrado es->"+lado*lado);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del cuadrado es->"+lado*4);
    }
}
