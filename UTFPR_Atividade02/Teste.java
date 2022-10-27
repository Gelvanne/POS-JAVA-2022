
public class Teste {
	public static void main(String arg[]) {
	
	Pai p1 = new Pai( );    	// Declaração e instanciação da classe Pai

	p1.nome = "Jesus";		// Não recomendado a troca de mensagem entre objetos acessando direto os atributos	
	p1.idade = (33);		// Não recomendado a troca de mensagem entre objetos acessando direto os atributos
	//p1.salario=(100); // Acesso privado
	p1.cadPai("José",50,120); // Acesso publico
	//p1.calcSalario(); // Acesso Privado
	p1.impPai();
	System.out.println("\n Nome...:" +p1.nome);
	System.out.println("\n Idade...:" +p1.idade);	
	
	}

}