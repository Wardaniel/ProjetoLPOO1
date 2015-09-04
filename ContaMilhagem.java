
public class ContaMilhagem {
	private IdentificadorConta identificador;
	//private Cliente cliente; @todo Cliente
	private int saldo = 0;
	private boolean ativa = true;
	
	/*public ContaMilhagem(IdentificadorConta identificador, Cliente cliente){
		@todo Cliente
	}
	*/
	
	public void creditar(int valor){
		if((this.ativa = true) && (valor >= 0)){
			this.saldo += valor;
		}else{
			debitar(valor * -1);
		}
	}
	
	public IdentificadorConta getIdentificador() {
		if(this.ativa == true){
			return identificador;
		}
		else{
			System.out.println("Esta conta nao esta mais ativa.");
			return null;
		}
	}

	public int getSaldo() {
		return saldo;
	}

	public void debitar(int valor){
		if( (this.ativa == true) && (valor >= 0) && (this.saldo >= valor) ){
			this.saldo -= valor;
		}else if ( (this.ativa == true) && (valor >= 0) && (this.saldo < valor) ) {
			
			System.out.println("Nao ha saldo o suficiente para debitar"
					+ " R$" + valor + ",00");

		}else{
			creditar(valor * -1);
		}
	}
	
	public void transferir(int valor, ContaMilhagem conta){
		if ((this.ativa == true) && (valor >= 0)){
			debitar(valor);
			conta.creditar(valor);
		}
		else{
			System.out.println("Voce tentou transferir um valor negativo.");
		}
	}
	
	public void desativar(){
		this.saldo = 0;
		this.ativa = false;
	}
	
	public void reativar(){
		this.ativa = true;
	}
	
}
