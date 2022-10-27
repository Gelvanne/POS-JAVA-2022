
public class Teste {

	public static void main (String arg[]) {
	
	
//-----------------------------PASSEIO 1----------------------------------

	Passeio p1 = new Passeio();

	p1.setVelocMax(210);
	p1.getMotor().setPotencia(100 );
	p1.getMotor().setQtdPist (8);
	p1.setPlaca("ATO 1056");
	p1.setMarca("Chevrolet");
	p1.setModelo("Onix");
	p1.setCor("Azul");
	p1.setQtdRodas(4);


System.out.println("========================= PASSEIO 1 =================================");

System.out.println("\nPISTÃO...:" +p1.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +p1.getPlaca());
System.out.println("\nMARCA...:" +p1.getMarca());
System.out.println("\nMODELO...:" +p1.getModelo());
System.out.println("\nCOR...:" +p1.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p1.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +p1.getQtdRodas());
System.out.println("\n\n");

System.out.println(+p1.getVelocMax() + " --> Kilometer/Hour  =  " +p1.CalculaVelocidade(210f) + " --> Meter/Hour");

System.out.println("\n\n==================================================================");

	
//-----------------------------PASSEIO 2----------------------------------

	Passeio p2 = new Passeio();

	p2.setVelocMax(200);
	p2.getMotor().setPotencia(96 );
	p2.getMotor().setQtdPist (4);
	p2.setPlaca("gel 1266");
	p2.setMarca("Fiat");
	p2.setModelo("Argo");
	p2.setCor("Prata");
	p2.setQtdRodas(4);

System.out.println("========================= PASSEIO 2 =================================");

System.out.println("\nPISTÃO...:" +p2.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +p2.getPlaca());
System.out.println("\nMARCA...:" +p2.getMarca());
System.out.println("\nMODELO...:" +p2.getModelo());
System.out.println("\nCOR...:" +p2.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p2.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +p2.getQtdRodas());
System.out.println("\n\n");

System.out.println(+p2.getVelocMax() + " --> Kilometer/Hour  =  " +p2.CalculaVelocidade(200f) + " --> Meter/Hour");


System.out.println("\n\n==================================================================");

//-----------------------------PASSEIO 3----------------------------------

	Passeio p3 = new Passeio();

	p3.setVelocMax(190);
	p3.getMotor().setPotencia(86 );
	p3.getMotor().setQtdPist (6);
	p3.setPlaca("SDT 1234");
	p3.setMarca("Chevrolet");
	p3.setModelo("Celta");
	p3.setCor("Preto");
	p3.setQtdRodas(4);

System.out.println("========================= PASSEIO 3 =================================");

System.out.println("\nPISTÃO...:" +p3.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +p3.getPlaca());
System.out.println("\nMARCA...:" +p3.getMarca());
System.out.println("\nMODELO...:" +p3.getModelo());
System.out.println("\nCOR...:" +p3.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p3.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +p3.getQtdRodas());
System.out.println("\n\n");

System.out.println(+p3.getVelocMax() + " --> Kilometer/Hour  =  " +p3.CalculaVelocidade(190f) + " --> Meter/Hour");


System.out.println("\n\n==================================================================");
	
//-----------------------------PASSEIO 4----------------------------------

	Passeio p4 = new Passeio();

	p4.setVelocMax(240);
	p4.getMotor().setPotencia(160 );
	p4.getMotor().setQtdPist (16);
	p4.setPlaca("THB 3578");
	p4.setMarca("Ford");
	p4.setModelo("Fox");
	p4.setCor("Branco");
	p4.setQtdRodas(4);

System.out.println("========================= PASSEIO 4 =================================");

System.out.println("\nPISTÃO...:" +p4.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +p4.getPlaca());
System.out.println("\nMARCA...:" +p4.getMarca());
System.out.println("\nMODELO...:" +p4.getModelo());
System.out.println("\nCOR...:" +p4.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p4.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +p4.getQtdRodas());
System.out.println("\n\n");

System.out.println(+p4.getVelocMax() + " --> Kilometer/Hour  =  " +p4.CalculaVelocidade(240f) + " --> Meter/Hour");



System.out.println("\n\n==================================================================");

//-----------------------------PASSEIO 5----------------------------------

	Passeio p5 = new Passeio();

	p5.setVelocMax(210);
	p5.getMotor().setPotencia(100 );
	p5.getMotor().setQtdPist (8);
	p5.setPlaca("AME 9876");
	p5.setMarca("Chevrolet");
	p5.setModelo("Corsa");
	p5.setCor("Bege");
	p5.setQtdRodas(4);


System.out.println("========================= PASSEIO 5 =================================");

System.out.println("\nPISTÃO...:" +p5.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +p5.getPlaca());
System.out.println("\nMARCA...:" +p5.getMarca());
System.out.println("\nMODELO...:" +p5.getModelo());
System.out.println("\nCOR...:" +p5.getCor());
System.out.println("\nVELOCIDADE MAX...:" +p5.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +p5.getQtdRodas());
System.out.println("\n\n");

System.out.println(+p5.getVelocMax() + " --> Kilometer/Hour  =  " +p5.CalculaVelocidade(210f) + " --> Meter/Hour");

System.out.println("\n\n==================================================================");





	
//-----------------------------CARGA 1----------------------------------

	Carga c1 = new Carga();

	c1.setVelocMax(96);
	c1.getMotor().setPotencia(100 );
	c1.getMotor().setQtdPist (8);
	c1.setPlaca("ATO 1056");
	c1.setMarca("Ford");
	c1.setModelo("Ranger");
	c1.setCor("Azul");
	c1.setQtdRodas(4);


System.out.println("========================= CARGA 1 =================================");

System.out.println("\nPISTÃO...:" +c1.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +c1.getPlaca());
System.out.println("\nMARCA...:" +c1.getMarca());
System.out.println("\nMODELO...:" +c1.getModelo());
System.out.println("\nCOR...:" +c1.getCor());
System.out.println("\nVELOCIDADE MAX...:" +c1.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +c1.getQtdRodas());
System.out.println("\n\n");

System.out.println(+c1.getVelocMax() + " --> Kilometer/Hour  =  " +c1.CalculaVelocidade(96f) + " --> Centimeter/Hour");

System.out.println("\n\n==================================================================");

	
//-----------------------------CARGA 2----------------------------------

		
	Carga c2 = new Carga();

	c2.setVelocMax(90);
	c2.getMotor().setPotencia(100 );
	c2.getMotor().setQtdPist (8);
	c2.setPlaca("AGO 4456");
	c2.setMarca("Toyota");
	c2.setModelo("Triton");
	c2.setCor("Azul");
	c2.setQtdRodas(4);



System.out.println("========================= CARGA 2 =================================");

System.out.println("\nPISTÃO...:" +c2.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +c2.getPlaca());
System.out.println("\nMARCA...:" +c2.getMarca());
System.out.println("\nMODELO...:" +c2.getModelo());
System.out.println("\nCOR...:" +c2.getCor());
System.out.println("\nVELOCIDADE MAX...:" +c2.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +c2.getQtdRodas());
System.out.println("\n\n");

System.out.println(+c2.getVelocMax() + " --> Kilometer/Hour  =  " +c2.CalculaVelocidade(90f) + " --> Centimeter/Hour");

System.out.println("\n\n==================================================================");


//-----------------------------CARGA 3----------------------------------

	Carga c3 = new Carga();

	c3.setVelocMax(80);
	c3.getMotor().setPotencia(100 );
	c3.getMotor().setQtdPist (8);
	c3.setPlaca("SAO 1467");
	c3.setMarca("Chevrolet");
	c3.setModelo("S10");
	c3.setCor("Branca");
	c3.setQtdRodas(4);


System.out.println("========================= CARGA 3 =================================");

System.out.println("\nPISTÃO...:" +c3.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +c3.getPlaca());
System.out.println("\nMARCA...:" +c3.getMarca());
System.out.println("\nMODELO...:" +c3.getModelo());
System.out.println("\nCOR...:" +c3.getCor());
System.out.println("\nVELOCIDADE MAX...:" +c3.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +c3.getQtdRodas());
System.out.println("\n\n");

System.out.println(+c3.getVelocMax() + " --> Kilometer/Hour  =  " +c3.CalculaVelocidade(80f) + " --> Centimeter/Hour");

System.out.println("\n\n==================================================================");

	
//-----------------------------CARGA 4----------------------------------

		
	Carga c4 = new Carga();

	c4.setVelocMax(76);
	c4.getMotor().setPotencia(100 );
	c4.getMotor().setQtdPist (8);
	c4.setPlaca("AQQ 0476");
	c4.setMarca("Fiat");
	c4.setModelo("Toro");
	c4.setCor("Azul");
	c4.setQtdRodas(4);



System.out.println("========================= CARGA 4 =================================");

System.out.println("\nPISTÃO...:" +c4.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +c4.getPlaca());
System.out.println("\nMARCA...:" +c4.getMarca());
System.out.println("\nMODELO...:" +c4.getModelo());
System.out.println("\nCOR...:" +c4.getCor());
System.out.println("\nVELOCIDADE MAX...:" +c4.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +c4.getQtdRodas());
System.out.println("\n\n");

System.out.println(+c4.getVelocMax() + " --> Kilometer/Hour  =  " +c4.CalculaVelocidade(76f) + " --> Centimeter/Hour");

System.out.println("\n\n==================================================================");

//-----------------------------CARGA 5----------------------------------

		
	Carga c5 = new Carga();

	c5.setVelocMax(99);
	c5.getMotor().setPotencia(100 );
	c5.getMotor().setQtdPist (8);
	c5.setPlaca("ASS 9849");
	c5.setMarca("Chevrolet");
	c5.setModelo("Saveiro");
	c5.setCor("Azul");
	c5.setQtdRodas(4);



System.out.println("========================= CARGA 5 =================================");

System.out.println("\nPISTÃO...:" +c5.getMotor().getQtdPist());
System.out.println("\nPLACA...:" +c5.getPlaca());
System.out.println("\nMARCA...:" +c5.getMarca());
System.out.println("\nMODELO...:" +c5.getModelo());
System.out.println("\nCOR...:" +c5.getCor());
System.out.println("\nVELOCIDADE MAX...:" +c5.getVelocMax());
System.out.println("\nQUANTIDAE DE RODAS...:" +c5.getQtdRodas());
System.out.println("\n\n");

System.out.println(+c5.getVelocMax() + " --> Kilometer/Hour  =  " +c5.CalculaVelocidade(99f) + " --> Centimeter/Hour");

System.out.println("\n\n==================================================================");

	}		
}


