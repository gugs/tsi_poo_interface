
public interface IConta {

	final float TAXA_ADMINISTRATIVA = 0.01f;
	
	public boolean realizarSaque(float quantia);
	
	public Float consultarSaldo();
	
	public boolean realizarTransferencia(float quantia, IConta destino);
	
	public boolean realizarDeposito(float quantia);
	
}
