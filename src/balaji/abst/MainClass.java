package balaji.abst;

public class MainClass extends AbstClass {
	String name;
	@Override
		void getVal(String name) {
		this.name=name;
	
		
	}
	@Override
	void display() {
		System.out.println("Hello "+name);
		
		
	}

}
