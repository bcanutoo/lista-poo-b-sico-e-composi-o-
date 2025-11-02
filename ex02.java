public class Quadrado {
    double lado;

    public Quadrado(double ladoQuadrado) {
        lado = ladoQuadrado;
    }

    public double area() {
        return lado * lado; 
    }

    public double perimetro() {
        return lado * 4; 
    }
}
