package mas;

import java.util.ArrayList;

public class Customer {
	private String name;
	ArrayList<Double> transactions;
	
	
	public Customer(String name, double initialAmount) {		
		this.name = name;
		this.transactions = new ArrayList<Double>();//this initializes the ArrayList
		addTransaction(initialAmount);//this adds the initial Amt to the transactions ArrayList
	}
	public void addTransaction(double amount){
		this.transactions.add(amount);//this adds any new transaction amount to the Transaction ArrayList
	}


	public String getName() {
		return name;
	}


	public ArrayList<Double> getTransaction() {
		return transactions;
	}
	
	
	
	

}
