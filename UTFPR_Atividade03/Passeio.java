
public class Passeio extends Veiculo{

	public Passeio(){}  //Metodo construtor.


		private int qtdPassageiros;
		
				
		

			public int getQtdPassageiros(){
				return qtdPassageiros;
			}

			public void setQtdPassageiros(int qtdPassegeiros) {
				this.qtdPassageiros = qtdPassageiros;
			}
		
			public float CalculaVelocidade(float velocMax){

				return velocMax * 1000;
			}

		
	}