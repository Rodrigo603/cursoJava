package model.entities;

public class Rectangle {
	public double largura;
	public double altura;
	
	public double Area() {
		return largura * altura;
		
	}
	public double Perimeter() {
		return (largura * 2) + (altura * 2);
		
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	public String toString() {
		return "AREA = "
			+ String.format("%.2f%n", Area())
			+ "PERIMETER = "
			+ String.format("%.2f%n", Perimeter())
			+ "DIAGONAL = "
			+ String.format("%.2f%n", Diagonal());
				
				
	}
}
