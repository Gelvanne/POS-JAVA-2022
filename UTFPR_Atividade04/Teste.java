public class Teste{
	public static void main(String arg[]){
		
		
	Passeio p1 = new Passeio();
	p1.setVelocidadeMaxima(210);
	//p1.getMotor().setPotencia(100);
	//p1.getMotor().setQtdPistao(8);
	p1.setPlaca("ATO 1056");
	p1.setMarca("Chevrolet");
	p1.setModelo("Onix");
	p1.setCor("Azul");
	p1.setQtdRodas(4);
	p1.setQtdPassageiros(6);

//System.out.println("\nPISTÃO...:" +p1.getMotor().getQtdPistao());
System.out.println("\nPLACA...:" +p1.getPlaca());
System.out.println("\nMARCA...:" +p1.getMarca());
System.out.println("\nMODELO...:" +p1.getModelo());
System.out.println("\nCOR...:" +p1.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p1.getVelocidadeMaxima());
System.out.println("\nQUANTIDAE DE RODAS...:" +p1.getQtdRodas());
System.out.println("\nQUANTIDAE PASSAGEIROS...:" +p1.getQtdPassageiros());
System.out.println("\n\n");

System.out.println(+p1.getVelocidadeMaxima() + " --> Kilometer/Hour  =  " +p1.calculaVelocidade(p1.getVelocidadeMaxima()) + " --> Meter/Hour");
		
		
	}
	
}