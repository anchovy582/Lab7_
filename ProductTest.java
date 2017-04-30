
public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductTest call = new ProductTest();
		
		SmartTV tv = new SmartTV();		
		tv.setChannel(11);
		tv.setPrice(2500000);
		call.testProduct(tv);
		call.testNetworked(tv);
		System.out.println();
		
		Labtop lab = new Labtop();
		lab.setTotalCapacity(1024);
		lab.setUsedCapacity(869.3);
		lab.setPrice(1248000);
		call.testProduct(lab);
		call.testDataStorage(lab);
		call.testNetworked(lab);
		System.out.println();
		
		Toaster toaster = new Toaster();
		toaster.setPrice(25000);
		call.testProduct(toaster);
		call.testCooker(toaster);

	}

	public void testProduct(Product p) {
		System.out.printf(p.getName());
		System.out.println("Its price is "+p.getPrice()+"won");

	}
	
	public void testDataStorage(DataStorage d) {
		System.out.println("Before Free Capacity");
		System.out.println(d.getFreeCapacity());
		System.out.println("Format Start!");
		d.format();
		System.out.println("After Free Capacity");
		System.out.println(d.getFreeCapacity());
	}
	
	public void testNetworked(Networked n) {
		if(n.isConnected()){
			System.out.println("Network is Connected");
		}
		else
			System.out.println("Network is Disconnected");
		System.out.println("Its Max speed is "+n.maxSpeed());
	}

	public void testCooker(Cooker c) {
		System.out.println(c.prepareFood());
	}

}
