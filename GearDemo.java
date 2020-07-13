package learnDesign;

class Wheel{
	private double rim;
	private double tire;
	public Wheel(double rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}
	public double diameter(){
		return (rim + 2*tire);
	}
	public double circumference(){
		return diameter() * Math.PI;
	}
}

class Gear{
	private int chainring;
	private int cog;
	private Wheel wheel;
	public Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	public Gear(int chainring, int cog, Wheel wheel){
		this.chainring = chainring;
		this.cog = cog;
		this.wheel = wheel;
	}
	public double ratio() {
		return (double) chainring / cog;
	}
	public double gearInches(){
		return ratio() * wheel.diameter();
	}
}

public class GearDemo{
	public static void main(String[] args){
		System.out.println("Started...");
		System.out.println(new Gear(52, 11).ratio());
		Wheel wheel = new Wheel(26, 1.5);
		System.out.println(new Gear(52, 11, wheel).gearInches());
		System.out.println(wheel.circumference());
	}
}