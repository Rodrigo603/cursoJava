package model.entities;

public class Rectangle2 {
	private double width;
	private double height;

	public Rectangle2() {
	}

	public Rectangle2(double width,double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return width * 2 + height * 2;
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	public String toString() {
		return "AREA: " 
				+
				String.format("%.2f",Area()) 
				+ " PERIMETER: "
				+ String.format("%.2f", Perimeter())
				+ " DIAGONAL: "
				+ String.format("%.2f",Diagonal());
				
	}
}