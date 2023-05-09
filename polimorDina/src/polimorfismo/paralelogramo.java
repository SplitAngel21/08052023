package polimorfismo;
/**
 *
 * @author angel
 */
public class paralelogramo extends figura{
    public paralelogramo(double lado, double base, double apotema) {
        super(lado, base, apotema);
    }
    @Override
    public void area (){
        System.out.println("El area del paralelogramo es->"+lado*4);
    }
}
