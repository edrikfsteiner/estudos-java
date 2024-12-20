package tributario;

public class ImpostoConsumo extends Imposto implements ImpostoInterface {
    public ImpostoConsumo(double valor, double aliquota) {
        super(valor, aliquota);
    }

    @Override
    public double calcularImposto() {
        return getValor() * getAliquota();
    }

    public double calcularImposto(double desconto) {
        return calcularImposto() - desconto;
    }

    public double calcularImposto(double desconto, double adicional) {
        return calcularImposto() - desconto + adicional;
    }
}