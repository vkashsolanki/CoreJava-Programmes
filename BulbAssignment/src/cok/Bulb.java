package cok;

public class Bulb {
	

		static int counter = 0;
		int watt;
		float price;
		String color;
		String cname;
		boolean state;
		 
		    Bulb(int watt, float price, String color, boolean state, String cname) {
		        this.watt = watt;
		        this.price = price;
		        this.color = color;
		        this.state = state;
		        this.cname = cname;
		        counter++;
		    }
		 
		  //1-Behaviour
		void showDetails()
		{
		System.out.println("Bulb Details: ");
		System.out.println("Bulb watt: " +watt);
		System.out.println("Bulb price: " +price);
		System.out.println("Bulb color: " +color);
		System.out.println("Bulb cname: " +cname);
		System.out.println("Bulb state: " +state);

		}

		//2-change state of bulb
		 void changeState() {
		    if (state) {
		        state = false; // If current state is true, set it to false
		    } else {
		        state = true; // If current state is false, set it to true
		    }
		    System.out.println("Bulb change state: " + state);
		}

		//3-change company name
		 void changeCompanyName(String newCompany) {
		        cname = newCompany;
		        System.out.println("Company name changed to: " + cname);
		    }
		//4-count bulb value

		 static void countBulb() {
		        System.out.println("Total number of bulbs created: " + counter);
		    }
		//5-main method start

		 public static void main(String[] args) {
		        // Creating 3 bulbs of the same type
		        Bulb bulb1 = new Bulb(100, 50.f, "White", false, "SURYA");
		        Bulb bulb2 = new Bulb(60, 30.0f, "Yellow", false, "SURYA");
		        Bulb bulb3 = new Bulb(75, 40.5f, "Red", false, "SURYA");
		 //6- showing details of each bulb
		        bulb1.showDetails();
		        bulb2.showDetails();
		        bulb3.showDetails();

		        // 7-counting nuber of bulb

		        countBulb();

		        // 8-Changing the state of the first bulb

		        bulb1.changeState();

		        // 9-Changing the company name of the first bulb

		        bulb1.changeCompanyName("phillipse");

		        // Creating 3 bulbs of different types
		        Bulb bulb4 = new Bulb(100, 80.0f, "Green", false, "crompton");
		        Bulb bulb5 = new Bulb(30, 40.0f, "Blue", false, "havells");
		        Bulb bulb6 = new Bulb(60, 25.30f, "Purple", false, "fuse");

		        // Counting the total number of bulbs after creating different types of bulbs
		        countBulb();
		    }
		}

