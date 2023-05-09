package polimorfismo;

/**
 * @author angel
 */
public class figura {

    enum tipo {
        CUADRADO, CIRCULO, HEXAGONO, PARALELOGRAMO, PENTAGONO, RECTANGULO, ROMBO, TRAPECIO, TRIANGULO
    }
    double lado;
    double base;
    double apotema;
    tipo nombreFigura;

    public figura(double lado, double base, double apotema, tipo nombreFigura) {
        this.lado = lado;
        this.base = base;
        this.apotema = apotema;
        this.nombreFigura = nombreFigura;
    }

    public double area() {
        double area = 0;
        switch (nombreFigura) {
            case CUADRADO:
                area = lado * lado;
                break;
            case CIRCULO:
                area = 3.141516 * lado * lado;
                break;
            case HEXAGONO:
                area=(lado*6)*(apotema/2);
                break;
            case PARALELOGRAMO:
                area=lado*base;
                break;
            case PENTAGONO:
                area=(lado*5)*(apotema/2);
                break;
            case RECTANGULO:
                area=lado*base;
                break;
            case ROMBO:
                area=(lado*base)/2;
                break;
            case TRAPECIO:
                area=((lado+base)/2)*apotema;
                break;
            case TRIANGULO:
                area=(lado*base)/2;
        }
        return area;
    }
    public double perimetro() {
        double perimetro = 0;
        switch (nombreFigura) {
            case CUADRADO:
                perimetro = lado * 4;
                break;
            case CIRCULO:
                perimetro = 3.141516 * lado * lado;
                break;
            case HEXAGONO:
                perimetro=(lado*6);
                break;
            case PARALELOGRAMO:
                perimetro=lado*4;
                break;
            case PENTAGONO:
                perimetro=(lado*5);
                break;
            case RECTANGULO:
                perimetro=lado*2+base*2;
                break;
            case ROMBO:
                perimetro=(lado*2)+(base*2);
                break;
            case TRAPECIO:
                perimetro=((lado*2+base*2))+apotema;
                break;
            case TRIANGULO:
                perimetro=(lado*3);
        }
        return perimetro;
    }

}
