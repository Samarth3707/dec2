package dec2;

class Drink{
	
    
	String name;
	int no;
	int colour;
	int suger;
	
	
	public Drink(String name, int no, int colour) {
		
		this.name = name;
		this.no = no;
		this.colour = colour;
		this.suger=suger;
	}
	
	public  void tast() {
		
		
		System.out.println(this.name+"\n"+this.no+"\n"+this.colour);
		if(suger<10) {
			System.out.println(this.name+"  "+"drink is not tasty ");
			
		}else if(suger>10 && suger<=50) {
			System.out.println(this.name+"   "+ "drink is  tasty");
			
			
			
		}else {
			System.out.println(this.name+"   "+ "drink is very  tasty");
			
		}
		
	}
	
	
	
}

class Cool_drink extends Drink{
	String name2;
	String flavour;
	
	
	public Cool_drink( String name2, String flavour) {
		super("boom", 5, 6);
		this.name2 = name2;
		this.flavour = flavour;
	}
	
	public void show() {
		System.out.println(this.name2+" "+this.flavour);
	}
	
	
	
	
}

class Bear extends Cool_drink{
	int Alcohol;

	public Bear() {
		super("sprite","apple");
		
	}
	
	public void effects() {
		System.out.println("it is very dangours for helth");
	}
	
	
	
	
}



public class dec2 {
	public static void main(String[] args) {
		
		Cool_drink obj1=new Cool_drink("sprite","apple");
		
		//obj1.tast();
		//obj1.show();
		
		Bear obj3=new Bear();
		obj3.tast();
		obj3.show();
		obj3.effects();
	}
}