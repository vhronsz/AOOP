
public class Car {
	
	protected String brand;
	protected String fuelType;
	protected int wheelCount;
	
	
	public Car(String brand, String fuelType, int wheelCount) {
		super();
		this.brand = brand;
		this.fuelType = fuelType;
		this.wheelCount = wheelCount;
	}



	public Car() {
		// TODO Auto-generated constructor stub
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getFuelType() {
		return fuelType;
	}



	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}



	public int getWheelCount() {
		return wheelCount;
	}



	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}

}
