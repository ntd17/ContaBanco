
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
}

