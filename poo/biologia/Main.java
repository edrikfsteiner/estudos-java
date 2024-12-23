package biologia;

public class Main {
    public static void main(String[] args) {
        AnimalAndar loboAndar = new Lobo();
        Mamifero loboMamifero = new Lobo();
        Lobo lobo = new Lobo();
        AnimalVoar aguiaVoar = new Aguia();
        Ave aguiaAve = new Aguia();
        Aguia aguia = new Aguia();

        System.out.println("Lobo:");
        loboAndar.comer();
        loboMamifero.som();
        lobo.andar();

        System.out.println("\nÁguia:");
        aguiaVoar.comer();
        aguiaAve.som();
        aguia.voar();
    }
}
