package empresa;

public class Nota {
    private double nota1;
    private double nota2;
    private int faltas;
    
    public Nota () {
    	
    }
    
	public Nota(double nota1, double nota2, int faltas) {;
		setNota1(nota1);
		setNota2(nota2);
		setFaltas(faltas);
	}
    
    public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		if(faltas>40 || faltas<0) {
			System.out.println("Número de faltas inválido!");
            return;
		}
		this.faltas = faltas;
	}

	public void setNota1(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, doidão!");
            return;
        }
        nota1 = nota;
    }
    
    public void setNota2(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida, doidão!");
            return;
        }
        nota2 = nota;
    }
    
    double getNota1() {
        return nota1;
    }
    
    double getNota2() {
        return nota2;
    }
    
    void resultado() {
        double media = (nota1 + nota2) / 2;
        
        
        System.out.println("Media: " + media);
        if(faltas> 7) {
        	System.out.println("Reprovado por faltas!");
            return;
        }
        else if (media < 4) {
            System.out.println("Reprovado por notas, faz o L");
        } else if (media < 7) {
            System.out.println("Tá de recuperação, boca aberta!");
        } else {
            System.out.println("Aprovado, meu nobre!");
        }
    }

}
