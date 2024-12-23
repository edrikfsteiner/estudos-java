package biologia;

public abstract class Mamifero implements AnimalAndar {
    @Override
    public void comer() {
        System.out.println("Mamífero está comendo");
    }

    public abstract void andar();
}