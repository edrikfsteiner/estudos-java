package tributario;

public class ImpostoRenda extends Imposto implements ImpostoInterface {
    private double deducao;

    public ImpostoRenda(double valor, double aliquota, double deducao) {
        super(valor, aliquota);
        this.deducao = deducao;
    }

    public double getDeducao() {
        return deducao;
    }

    public void setDeducao(double deducao) {
        this.deducao = deducao;
    }

    @Override
    public double calcularImposto() {
        double calculo = getValor() * getAliquota() - getDeducao();

        if (getValor() >= 4000) {
            super.setAliquota(getAliquota() * 1.5);
            return calculo;
        }

        return calculo;
    }
}