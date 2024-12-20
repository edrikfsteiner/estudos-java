package tributario;

import java.util.Timer;
import java.util.TimerTask;

public class Governo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Imposto impostoRenda = new ImpostoRenda(2000, 0.2, 300);
        Imposto impostoRenda2 = new ImpostoRenda(4000, 0.2, 300);
        ImpostoConsumo impostoConsumo = new ImpostoConsumo(1000, 0.1);

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                impostoRenda.setAliquota(impostoRenda.getAliquota() * 1.2);
                impostoRenda2.setAliquota(impostoRenda2.getAliquota() * 1.2);
                impostoConsumo.setAliquota(impostoConsumo.getAliquota() * 1.2);

                System.out.println("---------------------------------------");
                System.out.println("Imposto de Renda: R$" + impostoRenda.calcularImposto());
                System.out.println("Imposto de Renda: R$" + impostoRenda2.calcularImposto());
                System.out.println("Imposto de Consumo com desconto: R$" + impostoConsumo.calcularImposto(50));
                System.out.println("Imposto de Consumo com desconto e adicional: R$" + impostoConsumo.calcularImposto(50, 30));
                System.out.println("---------------------------------------");
            }
        }, 0, 2000);
    }
}