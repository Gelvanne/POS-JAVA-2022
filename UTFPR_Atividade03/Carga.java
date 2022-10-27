public class Carga extends Veiculo{

	public Carga(){}  // Metodo construtor

		private int cargaMax;
		private int tara;

	
	
			public int getTara(){
				return tara;
			}
			public void setTara(int tara){
				this.tara = tara;
			}
			public int getCargaMax() {
				return cargaMax;
			}
			public void setCargaMax(int cargaMax){
				this.cargaMax = cargaMax;
			}

			public float CalculaVelocidade(float velocMax){

				return velocMax * 100000f;
	}
}