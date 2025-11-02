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
class PrincipalQuadrado {
    public static void main(String[] args) {

        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(5.5);
        Quadrado q3 = new Quadrado(7);

        System.out.println("Área Q1: " + q1.area());
        System.out.println("Perímetro Q1: " + q1.perimetro());

        System.out.println("Área Q2: " + q2.area());
        System.out.println("Perímetro Q2: " + q2.perimetro());

        System.out.println("Área Q3: " + q3.area());
        System.out.println("Perímetro Q3: " + q3.perimetro());
    }
}
