package week1.Day1;

//Class name....Comment Line
//Syntax for creating class name => Access specifier class classname
public class LearnJava {

	// Method name....Comment Line
	// Syntax for creating Method name => Access specifier returntype Methodname()
	public void driveCar() {
		System.out.println("Driving my car");
	}

	public void gearCar() {
		System.out.println("Without putting a Gear");
	}

	// Main Method...Comment Line
	public static void main(String[] args) {

		// Object name...Comment Line
		// Syntax for object creation => Classname Object name = new Classname();
		LearnJava Car = new LearnJava();
		Car.driveCar();
		Car.gearCar();

		// System.out.println("Hariharan");
	}

}
