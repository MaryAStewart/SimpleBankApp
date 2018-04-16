package mas;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank("US Bank");
		
		//testing to make sure can add a branch
		if(bank.addBranch("Fountain Square"));{
			System.out.println("Fountain Square branch created.");
		}
		
		bank.addCustomer("Fountain Square", "Sandy", 50.05);
		bank.addCustomer("Fountain Square", "Ty", 175.34);
		bank.addCustomer("Fountain Square", "Hannah", 200.12);
		
		bank.addBranch("Oakley");
		bank.addCustomer("Oakley", "George", 1012.55);
		
		bank.addCustomerTransaction("Fountain Square", "Sandy", 75.25);
		bank.addCustomerTransaction("Fountain Square", "Sandy", 135.35);
		bank.addCustomerTransaction("Fountain Square", "Ty", 62.12);
		bank.addCustomerTransaction("Oakley", "George", 25.25);
		
		bank.listCustomers("Fountain Square", true);
		bank.listCustomers("Oakley", true);
		
		bank.addBranch("Finneytown");		
		//testing to see if branch exists for initial add customer
		if(!bank.addCustomer("Finneytown", "Sam", 30.35)){
			System.out.println("Branch Finneytown does not exist");
		}
		
		//testing to see if branch exists
		if(!bank.addBranch("Fountain Square")){
			System.out.println("Fountain Square already exists");
		}
		
		//testing to see if customer exists at a branch
		if(!bank.addCustomerTransaction("Oakley", "Tom", 105.22)){
			System.out.println("Customer does not exist at branch.");
		}
		
		//testing to see if customer already exists when doing initial customer add
		if(!bank.addCustomer("Oakley", "George", 225.65)){
			System.out.println("Customer George already exists.");
		}
		
		
		
		
	}

}
