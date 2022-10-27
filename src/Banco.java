
public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IConta c1 = new ContaCorrente("123A");
		
		IConta c2 = new ContaPoupanca("321A");
		
		c1.realizarDeposito(100f);
		c2.realizarDeposito(100f);
		System.out.println(c1.consultarSaldo());
		System.out.println(c2.consultarSaldo());
		System.out.println(c1);
		System.out.println(c2);
	}

}
