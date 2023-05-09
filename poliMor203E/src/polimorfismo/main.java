package polimorfismo;
/**
 *
 * @author angel
 */
public class main {
    public static void main(String[]args){
        System.out.println("El area del cuadrado es->"+figuras.area(3.0));
        System.out.println("El perimetro del cuadrado es->"+figuras.perimetro(3, 3, 3, 3));
        System.out.println("El area del circulo es->"+figuras.area(3));
        System.out.println("El perimetro del circulo es->"+figuras.perimetro(3));
        System.out.println("El area del rectangulo es->"+figuras.area(5.0, 2.0));
        System.out.println("El perimetro del rectangulo es->"+figuras.perimetro(5, 2, 5, 2));
        System.out.println("El area del hexagono es->"+figuras.area(6, 7.0));
        System.out.println("El perimetro del hexagono es->"+figuras.perimetro(6, 6));
        System.out.println("El area del pentagono es->"+figuras.area(6, 7));
        System.out.println("El perimetro del pentagono es->"+figuras.perimetro(6));
        System.out.println("El area del paralelogramo es->"+figuras.area(4.0, 5));
        System.out.println("El perimetro del paralelogramo es->"+figuras.perimetro(5, 7, 6, 4 ));
        System.out.println("El area del trapecio es->"+figuras.area(12,13, 5));
        System.out.println("El perimetro del trapecio es->"+figuras.perimetro(3, 3, 12, 13));
        System.out.println("El area del triangulo es->"+figuras.area(12.0, 2));
        System.out.println("El perimetro del triangulo es->"+figuras.perimetro(0, 2, 2, 2));
        System.out.println("El area del rombo es->"+figuras.area(3, 3, 4, 5));
        System.out.println("El perimetro del rombo es->"+figuras.perimetro(3, 3, 3, 3));
    }
}
