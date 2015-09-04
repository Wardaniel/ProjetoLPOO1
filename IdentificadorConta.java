public class IdentificadorConta {
	private int numero;
	
	public IdentificadorConta(int num){
		this.numero = num;
	}
	
	public int calcularDigitoVerificador(){
		int soma = 0;
		int num = this.numero;
        while (num > 0) {
            soma = soma + (num % 10);
            num = num / 10;
        }
        int digito = soma % 99;
        return digito;
	}
	
	public boolean  verificarValidadeDigito(int a){
		if(a == this.numero){
			System.out.println("Digito valido.");
			return true;
		}else{
			System.out.println("Digito invalido.");
			return false;
		}
	}
}
