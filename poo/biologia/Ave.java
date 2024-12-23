package biologia;

public abstract class Ave implements AnimalVoar {
    @Override
    public void comer() {
        System.out.println("Ave está comendo");
    }

    public abstract void voar();
}