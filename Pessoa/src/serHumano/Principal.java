
package serHumano;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa ("Ronnie", 26, "Médio", identidadeGenero.TRANSGENERO, "Hetero", "macho");
		
		//System.out.print(p1.getGenero(p1));
		//System.out.println(p1.getGenero());
		//System.out.println(p1.genero.getGneroEnum());
	
		System.out.println(p1.getIdade());
		p1.setIdade(p1.getIdade() + 1);
		System.out.println(p1.getIdade());
		p1.setIdade(23 + 1);
		System.out.println(p1.getIdade());
		
		p1.dormir();
		
		// TODO Auto-generated method stub

	}

}
