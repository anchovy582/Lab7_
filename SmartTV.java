
public class SmartTV extends Product implements Networked{

	private int channel;
	
	SmartTV(){
		System.out.println("This is SmartTV");
	}
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "SmartTV name is ST!\n";
	}
	
	public boolean isConnected()
	{
		return false;
		
	}
	
	public double maxSpeed()
	{
		return 0;
	}

}
