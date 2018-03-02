/*
 Ex. 1 (exemplo "Aula03_01")
- Crie uma primeira classe chamada Principal (onde ter� a fun��o "main");
- Crie uma segunda classe chamada Veiculo. Nela, dever�o existir os atributos "nome", "fabricante", "ano" e "velocidade". 
Al�m disso, dever�o existir os m�todos "acelerar", "desacelerar" e "parar", onde a velocidade sofrer�, respectivamente, o acr�scimo de 5km/h,
o decr�scimo de 5km/h e a atribui��o de 0km/h.

- na classe Principal, instancie 3 objetos da classe Veiculo, com os nomes, fabricantes e anos que voc� quiser, mas que tenham, 
respectivamente, as velocidades em 15, 200, 150;
- aumente e diminua as velocidades a seu bel prazer, sempre exibindo a velocidade a cada altera��o.

Ex. instanciar objeto da classe Veiculo:
        Veiculo objV1 = new Veiculo("Gol", "Volkswagen", 2001, 150);

Requisitos:
- implemente o encapsulamento (getters e setters) de modo que o valor da velocidade n�o possa ser alterado por alguma 
classe externa (alheia � regra de neg�cio), devendo ser alterada, apenas, pelos m�todos de neg�cio ("acelerar", "desacelerar" e "parar");

- limite a faixa de velocidade entre 0km/h a 220km/h.

===>>>> Continua��o da Implementa��o:

- Crie uma terceira classe chamada Carro, que seja subclasse de Veiculo. Nela, inclua o atributo "quantidadePortas" e fa�a um polimorfismo do m�todo 
"acelerar", aumentando a velocidade de 10km/h em 10km/h;

- Crie uma quarta classe chamada Moto, tamb�m subclasse de Veiculo; ela dever� ter o atributo "apoioAcionado" (booleano) e um polimorfismo do m�todo 
"acelerar", outro do m�todo "desacelerar" e outro para m�todo "parar": quando a velocidade for igual a 0, 
o atributo "apoioAcionado" dever� ser verdadeiro; quando a velocidade for maior que 0, o atributo dever� ir para falso.
 */

package exProfDavi3;

public class Principal {
	public static void main(String[] args) {
		
		/*Veiculo v1 = new Veiculo("gol","volks","2001",10);
		v1.getAno();
		v1.getNome();
		v1.getFabricante();
		v1.acelerar();
		
		Veiculo v2 = new Veiculo("siena","fiat","2018",180);
		v2.acelerar();
		v2.acelerar();
		
		Carro c1 = new Carro("gol","volks","2001",10,4);
		c1.acelerar();
		c1.acelerar();
		c1.desacelerar();*/
				
		Moto m1 = new Moto("honda","titan","2005",10,true);
		 m1.acelerar();
		 m1.subirApoio();
		 m1.acelerar();
		 m1.parar();
		 m1.desacelerar();
		 m1.descerApoio();
		 m1.parar();
		 m1.getApoioAcionado();
	}

}
