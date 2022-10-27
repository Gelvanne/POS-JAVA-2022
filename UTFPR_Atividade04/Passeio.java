public final class Passeio extends Veiculo implements Calcular{
	private int qtdPassageiros; 

	public Passeio(){
		qtdPassageiros = 0;
	} 
	
	public float calculaVelocidade(float velocidadeMaxima){
			float y = (getVelocidadeMaxima()*1000);
			System.out.println("\nVelocidade PASSEIO..:" + y +" ..:M/H");
			return y;
		}
	
	public int calcular(){
		int x = 1;
		return x;
	}
		
	public final void setQtdPassageiros(int qtdPassageiros){
			this.qtdPassageiros = qtdPassageiros;
		}
	public int getQtdPassageiros(){
		return qtdPassageiros;
	}
}