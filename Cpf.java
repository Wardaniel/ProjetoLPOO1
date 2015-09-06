package teste;


public class Cpf {
private String cpf;

public Cpf (String cpf){
	setCpf(cpf);
}
public void setCpf(String cpf){
	if(cpf != null){
	this.cpf=cpf;
	}
	else{
		System.out.println("Cpf invalido");
	}
}

public String getCpf(){
	return cpf;
}
	
}
