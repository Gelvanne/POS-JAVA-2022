public abstract class Veiculo{
	
	private String placa; 
	private String marca; 
	private String modelo; 
	private String cor;
	private float velocidadeMaxima; 
	private int qtdRodas; 
	private Motor motor; 
	
	public Veiculo (){
		placa = "";
		marca = "";
		modelo = "";
		cor = "";
		velocidadeMaxima = 0;
		qtdRodas = 0;
		motor = new Motor();
	} 
	
	public abstract float calculaVelocidade(float velocidadeMaxima);
	
	
	public final void setPlaca (String placa){
		this.placa = placa;
	}
	public final void setMarca(String marca){
		this.marca = marca;
	}
	public final void setModelo(String modelo){
		this.modelo = modelo;
	}
	public final void setCor(String cor){
		this.cor = cor;
	}
	public final void setVelocidadeMaxima(float velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public final void setQtdRodas(int qtdRodas){
		this.qtdRodas = qtdRodas;
	}
	public final void setMotor (Motor motor){
		this.motor = motor;
	}
	
	public String getPlaca(){
		return placa;
	}
	public String getMarca(){	
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
	public String getCor(){
		return cor;
	}
	public float getVelocidadeMaxima(){
		return velocidadeMaxima;
	}
	public int getQtdRodas(){
		return qtdRodas;
	}
	public Motor getMotor(){
		return motor;
	}
	
}