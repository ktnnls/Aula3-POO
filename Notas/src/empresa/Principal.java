package empresa;

public class Principal {

	public static void main(String[] args) {

		Nota ribamar = new Nota();
		
		Nota cremilda = new Nota(2,5,5);
		
		
		System.out.println("Media Cremilda");
		cremilda.resultado();
		System.out.println();
		
		ribamar.setNota1(9);
		ribamar.setNota2(10);
		ribamar.setFaltas(5);
		
		ribamar.resultado();
		
		ribamar.setNota1(2);
		ribamar.setFaltas(10);
		
		ribamar.resultado();

	}

}
