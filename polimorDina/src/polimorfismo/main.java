package polimorfismo;

/**
 *
 * @author angel
 */
public class main {

    public static void main(String[] args) {
        cuadrado cua = new cuadrado(7,0,0);
        circulo cir = new circulo (3,0,0);
        hexagono hex = new hexagono(7,0,5);
        pentagono pen = new pentagono(7,0,5);
        paralelogramo par=new paralelogramo (5,6,0);
        rectangulo rec = new rectangulo(7,3,0);
        rombo rom = new rombo (3,6,0);
        trapecio tra = new trapecio(7,0,5);
        triangulo tri = new triangulo(7,4,0);
        cua.area();
        cir.area();
        hex.area();
        pen.area();
        par.area();
        rec.area();
        rom.area();
        tra.area();
        tri.area();
        
        cua.perimetro();
        cir.perimetro();
        hex.perimetro();
        pen.perimetro();
        par.perimetro();
        rec.perimetro();
        rom.perimetro();
        tra.perimetro();
        tri.perimetro();
    }
}
