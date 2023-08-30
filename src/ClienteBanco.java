public class ClienteBanco {
	
	// Attributes
	public int numConta;
	private int senhaConta;
	private String clienteConta;
	private double saldoConta;
	private boolean statusConta;
	
	//Getters e Setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getSenhaConta() {
		return senhaConta;
	}
	public void setSenhaConta(int senhaConta) {
		this.senhaConta = senhaConta;
	}
	public String getClienteConta() {
		return clienteConta;
	}
	public void setClienteConta(String clienteConta) {
		this.clienteConta = clienteConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public boolean getStatusConta() {
		return statusConta;
	}
	public void setStatusConta(boolean statusConta) {
		this.statusConta = statusConta;
	}
	
	//Constructor
	public ClienteBanco(int numConta,int senhaConta, String clienteConta, double saldoConta) {
		setNumConta(numConta);
		setSenhaConta(senhaConta);
		setClienteConta(clienteConta);
		setSaldoConta(saldoConta);	
		setStatusConta(true);
	}
	
	// Methods
    public void fecharConta() {
    	if(getSaldoConta() > 0) {
    		System.out.println("Não da para fechar uma conta com dinheiro");
    		System.out.println("Saldo restante da conta: " + getSaldoConta());
    	}else if(getSaldoConta() > 0) {
    		System.out.println("Não da para fechar uma conta com saldo negativo");
    	}else {
    		System.out.println("Conta fechada!");
    		setStatusConta(false);
    	}
	}
    public void depositarConta(double valor) {
    	if(getStatusConta() == true) {
    		setSaldoConta(getSaldoConta()+valor); 
    		System.out.println("Saldo novo da conta: " + getSaldoConta());
    	} else {
    		System.out.println("Impossivel depositar numa conta inexistente");
    	}
    }
    public void sacarConta(double valor) {
    	if(getStatusConta() == true) {
    		if(getSaldoConta() >= valor) {
    			setSaldoConta(getSaldoConta()-valor);
    			System.out.println("Saldo restante da conta: " + getSaldoConta());
    		}else {
    			System.out.println("Não é possivel sacar esse valor, saldo da conta é: " + getSaldoConta());
    		}
    	} else {
    		System.out.println("Impossivel sacar numa conta inexistente");
    	}
    }

}