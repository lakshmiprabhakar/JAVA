class cpu {
	double price;
	String name;
	
	cpu(double p,String nam) {
	 	price=p;
	 	name=nam;
	}
	class processor {
		int no_of_cores;
		String manufacturer;
		
		processor(int cores,String man) {
			no_of_cores = cores;
			manufacturer = man;
		}
	}
	static class ram {
	
		String memory;
		String manufacturer;
		
		ram(String mem,String man) {
			memory = mem;
			manufacturer = man;
		}
	}

}
public class CpuInfo {
	public static void main(String args[]) {
		cpu c =new cpu(20000,"Intel i7");
		cpu.processor p =c.new processor(8,"Intel");
		cpu.ram r = new cpu.ram("8gb","crucial");
		System.out.println("Processor name = " + c.name + "\nProcessor Price : " + c.price);
		System.out.println("Processor cores = " + p.no_of_cores + "\nProcessor Manufacturer name : " + p.manufacturer);
		System.out.println("Ram capacity : " + r.memory + "\nRam Manufacturer : " + r.manufacturer);
	
	}

}
