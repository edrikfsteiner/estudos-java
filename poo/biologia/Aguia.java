package biologia;

public class Aguia extends Ave {
    @Override
    public void som() {
        System.out.println("[grito de águia]");
    }

    @Override
    public void voar() {
        System.out.println("Águia voando");
    }
}