
public class Main {
	
	public void printSpecification(RaceCar car){

			System.out.println("Race Car Specification");
			System.out.println("======================");
			System.out.println("Brand : "+car.brand);
			System.out.println("Fuel Type : "+car.fuelType);
			System.out.println("Wheel Count : "+car.wheelCount);
			System.out.println("Engine Type : "+car.getEngineType());
			System.out.println("Maximum Velocity : "+car.getMaxVelocity()+" Km/h");
			System.out.println(" ");
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		RaceCar raceCar = new RaceCar("Volvo","Deluxe",4,"V8",280);
		
		printSpecification(raceCar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
