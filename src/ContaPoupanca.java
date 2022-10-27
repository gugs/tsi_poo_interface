import java.util.Date;
import java.util.Objects;

public class ContaPoupanca implements IConta{

	String numero;
	float saldo;
	Date dataAbertura;
	boolean status;
	
	
	public ContaPoupanca(String numero) {
		this.numero = numero;
		this.saldo = 0f;
		this.dataAbertura = new Date();
		this.status = true;
	}
	
	@Override
	public boolean realizarSaque(float quantia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Float consultarSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public boolean realizarTransferencia(float quantia, IConta destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [numero=" + numero + ", saldo=" + saldo + ", dataAbertura=" + dataAbertura + ", status="
				+ status + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaPoupanca other = (ContaPoupanca) obj;
		return Objects.equals(numero, other.numero);
	}

	@Override
	public boolean realizarDeposito(float quantia) {
		// TODO Auto-generated method stub
		if(quantia > 0 && status) {
			saldo += quantia;
			return true;
		}else
			return false;
	}
	
	

}
