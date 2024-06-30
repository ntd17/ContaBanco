
import lombok.Data;
import java.util.Date;

@Data
public class Transacao {
    private Conta origem;
    private Conta destino;
    private double valor;
    private Date dataTransacao;
}

