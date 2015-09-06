package teste;


public class Cliente {
Cpf cpf;
String nome;
int idade;
double renda;
int sexo;
 public Cliente(Cpf cpf,String nome,int idade,double renda, int sexo){
	 this.cpf = cpf;
	 this.nome=nome;
	 this.idade=idade;
	 this.renda=renda;
	 this.sexo=sexo;
 }


public String getPrimeiroNome(){
	int espaço = nome.indexOf(" ");
	String pNome = nome.substring(0, espaço);
	return pNome;
			}
public String getUltimoNome(){
	int espaço = nome.lastIndexOf(" ");
	String uNome = nome.substring(espaço+1);
	return uNome;
			}


}
