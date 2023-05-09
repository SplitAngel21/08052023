package polimorfismo;

/**
 *
 * @author angel
 */
public class main {

    public static void main(String[] args) {
        figura cua = new figura(3, 0, 0, figura.tipo.CUADRADO);
        figura cir = new figura(3, 0, 0, figura.tipo.CIRCULO);
        figura hex = new figura(6, 0, 3, figura.tipo.HEXAGONO);
        figura par = new figura(4, 7, 0, figura.tipo.PARALELOGRAMO);
        figura pen = new figura(5, 0, 3, figura.tipo.PENTAGONO);
        figura rec = new figura(6, 7, 0, figura.tipo.RECTANGULO);
        figura rom = new figura(3, 7, 0, figura.tipo.ROMBO);
        figura tra = new figura(4, 5, 6, figura.tipo.TRAPECIO);
        figura tri = new figura(5, 7, 0, figura.tipo.TRIANGULO);
        System.out.println("El area del cuadrado es->" + cua.area());
        System.out.println("El area del circulo es->" + cir.area());
        System.out.println("El area del hexagono es->" + hex.area());
        System.out.println("El area del paralelogramo es->" + par.area());
        System.out.println("El area del pentagono es->" + pen.area());
        System.out.println("El area del rectangulo es->" + rec.area());
        System.out.println("El area del rombo es->" + rom.area());
        System.out.println("El area del trapecio es->" + tra.area());
        System.out.println("El area del triangulo es->" + tri.area());
        System.out.println("El perimetro del cuadrado es->" + cua.perimetro());
        System.out.println("El perimetro del circulo es->" + cir.perimetro());
        System.out.println("El perimetro del hexagono es->" + hex.perimetro());
        System.out.println("El perimetro del paralelogramo es->" + par.perimetro());
        System.out.println("El perimetro del pentagono es->" + pen.perimetro());
        System.out.println("El perimetro del rectangulo es->" + rec.perimetro());
        System.out.println("El perimetro del rombo es->" + rom.perimetro());
        System.out.println("El perimetro del trapecio es->" + tra.perimetro());
        System.out.println("El perimetro del triangulo es->" + tri.perimetro());

    }
}
