package app;



public class Teste {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Salomao", null, "M", 326532153);
		Pessoa pessoa2 = new Pessoa("maria", null, "H", 1663432153);
		Vendedor vendedor = new Vendedor(null, null, null, 0, null, 0, null, 0, 0);
		
		
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(vendedor);
		
	}

}
