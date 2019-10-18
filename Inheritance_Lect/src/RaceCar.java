
public class RaceCar extends Car{
	
	private String engineType;
	private float maxVelocity;
	
	public RaceCar() {
		// TODO Auto-generated constructor stub
	}
	
	public RaceCar(String brand, String fuelType, int wheelCount,String engineType,float maxVelocity) {
		super(brand, fuelType, wheelCount);
		// TODO Auto-generated constructor stub
		this.engineType = engineType;
		this.maxVelocity = maxVelocity;
	}


	public String getEngineType() {
		return engineType;
	}


	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}


	public float getMaxVelocity() {
		return maxVelocity;
	}


	public void setMaxVelocity(float maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

}