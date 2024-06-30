
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ContaPoupanca extends Conta {
    private double taxaDeJuros;
    
    public void renderJuros() {
        saldo += saldo * taxaDeJuros;
    }
}

