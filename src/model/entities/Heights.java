package model.entities;

public class Heights {
	private String name;
	private int age; 
	private double height;

	
	public Heights(String name, int age, double height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static double AvgHeight(Heights[] vect,int n) {
		double avgHeight = 0;
		for (int i = 0; i < n; i++ ) {
			avgHeight += vect[i].getHeight();
		}
		return avgHeight/n;
	}
	public static double percentageUnder16(Heights[] vect, int n ) {
		int under16 = 0;
		for (int i = 0;i < n; i++ ) {
			if(vect[i].getAge() < 16) {
				under16 += 1;
			}
		}
		return (double)under16/n * 100;
	}
}