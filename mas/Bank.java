package mas;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branches;
	
	public Bank(String bankName) {		
		this.bankName = bankName;
		this.branches = new ArrayList<Branch>();
	}
	
	public boolean addBranch(String branchName){
		if(findBranch(branchName) == null){//checking to see if the branch exists
			this.branches.add(new Branch(branchName));//if it doesn't then we add it to the branches ArrayList
			return true;
		}
		return false;
	}
	public boolean addCustomer(String branchName, String customerName, double initialAmount){//this is when a customer walks in & want to open an acct at this branch		
		Branch branch = findBranch(branchName);
		if(branch !=null){//can only add a customer if the branch exists
			return branch.newCustomer(customerName, initialAmount);//calling the newCustomer method from the Branch class
		}
		return false;
	}
	
	public boolean addCustomerTransaction(String branchName, String customerName, double amount){
		Branch branch = findBranch(branchName);
		if(branch !=null){//can only add the transaction if the branch exists
			return branch.addCustomerTransaction(customerName, amount);//calling the addCustomerTransaction method from the Branch class
		}
		return false;
	}
	
	private Branch findBranch(String branchName){
		for(int i = 0; i < this.branches.size(); i ++){//going thru each element in the branches ArrayList looking for the name of the branch
			Branch checkedBranch = this.branches.get(i);
			if(checkedBranch.getBranchName().equals(branchName)){//if the branch name equals one in the ArrayList all is good otherwise it 
				return checkedBranch;
			}
		}
		return null;//it returns null
		
	}
	
	//This method will handle an ArrayList of size zero because the ArrayLists have been initialized
	
	public boolean listCustomers(String branchName, boolean showTransactions){
		Branch branch = findBranch(branchName);
		if(branch !=null){
			System.out.println("Customer details for branch " + branch.getBranchName());//this branchName was from the variables at the top
			
			//need to get a list of customers for the branch that was found & optionally the transactions for each customer
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			//a for loop to print out the customers for the branch
			for( int i = 0; i<branchCustomers.size(); i++){
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
				if(showTransactions){
					System.out.println("Transactions");
					//list of transactions for that particular customer
					ArrayList<Double> transactions = branchCustomer.getTransaction();
					for(int j = 0; j<transactions.size(); j++){
						System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
					}
				}
			}
			return true;	
		}else {		
		return false;
		}
	}
	
	
	

}
