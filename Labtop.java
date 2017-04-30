
public class Labtop extends Product implements Networked, DataStorage{
	
	Labtop(){
		System.out.println("This is Labtop");
	}

	private double totalCapacity;
	private double usedCapacity;
	
	public double getFreeCapacity(){
		return getTotalCapacity()-getUsedCapacity();
	}
	
	public void format(){
		System.out.println("Delete all file!");
		setUsedCapacity(0);
	}
	
	public boolean isConnected(){
		return true;
	}
	
	public double maxSpeed(){
		return 64;
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	@Override
	public String getName(){
		return "Labtop name is OOP!\n";
	}
}
