import java.util.ArrayList;

public class Motor {
    int potencia;
    boolean ligado;

    public Motor(int potencia) {
        if (potencia < 0) System.out.println("Potência inválida!");
        this.potencia = potencia;
        this.ligado = false;
    }
}
class Carro {
    String modelo;
    Motor motor;

    public Carro(String modelo, Motor m) {
        this.modelo = modelo;
        this.motor = m;
    }

    void darPartida() {
        motor.ligado = true;
    }

    void parar() {
        motor.ligado = false;
    }
}
public class PrincipalCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Fiat", new Motor(100)));
        carros.add(new Carro("Ford", new Motor(200)));
        carros.add(new Carro("BMW", new Motor(300)));
        carros.add(new Carro("Gol", new Motor(90)));

        carros.get(0).darPartida();
        carros.get(2).parar();

        for (Carro c : carros) {
            System.out.println(c.modelo + " -> Potência: " + c.motor.potencia + ", Ligado: " + c.motor.ligado);
        }
    }
}
