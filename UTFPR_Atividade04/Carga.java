public final class Carga extends Veiculo implements Calcular{
	private int cargaMaxima;  
	private int tara;  
	
	public Carga(){
		tara = 0;
		cargaMaxima = 0;
	} 
	
	public float calculaVelocidade(float velocidadeMaxima){
		return velocidadeMaxima * 100000;
	}
	
	public int calcular(){
		
	}
	
	public final void setCargaMaxima(int cargaMaxima){
		this.cargaMaxima = cargaMaxima;
	}
	public final void setTara(int tara){
		this.tara = tara;
	}
	public int getCargaMaxima(){
		return cargaMaxima;
	}
	public int getTara(){
		return tara;
	}
}