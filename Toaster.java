
public class Toaster extends Product implements Cooker {

	Toaster(){
		System.out.println("This is Toaster");
	}
	
	public String prepareFood() {
		// TODO Auto-generated method stub
		return "PrepareFood is Toast!\n";
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return "Toaster name is Sik-Bbang\n";
	}

	
	
	



}
