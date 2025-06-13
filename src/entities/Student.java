package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double NotaMax() {
		return nota1 + nota2 + nota3;
		}
	public double Faltou() {
		return 60.00 - NotaMax(); 
	}
	public String toString() {
		
		if (NotaMax() >= 60.00 ) {
			return "FINAL GRADE: "
				+ String.format("%.2f%n", NotaMax())
				+ "PASS";
		}
		else {
			return "FINAL GRADE: "
				+ String.format("%.2f", NotaMax())
				+ "\nFAILED\nMISSING "
				+ String.format("%.2f", Faltou()) + " POINTS ";
		}
	}
	
}
