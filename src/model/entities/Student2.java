package model.entities;

public class Student2 {
	public double grade1;
	public double grade2;
	public double grade3;

	public Student2() {
	}
	public Student2(double grade1,double grade2,double grade3) {
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}
	public double SumGrades() {
		return grade1 + grade2 + grade3;
	}
	public String toString() {
		if (grade1 + grade2 + grade3 >= 60.00) {
			return "FINAL GRADE: "
					+ String.format("%.2f ", SumGrades())
					+ " PASSED";
		}else {
			return "FINAL GRADE: "
					+ String.format("%.2f ", SumGrades())
					+ "MISSING "
					+ String.format("%.2f",60 - SumGrades())
					+ " POINTS";
		}
	}
}
