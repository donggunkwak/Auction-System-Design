public class Person{
	private String address; 
	private String name; 
	private double bidAmount; 
	private double cash; 


	public Person(String address, String name, int cash){
		this.name=name; 
		this.address=address; 
		this.bidAmount=0; 
		this.cash=cash; 
	}

	public void placeBid(double amount){
		bidAmount=amount; 
	}

	public double getBidAmount(){
		return (bidAmount); 
	}

	public Sting getName(){
		return name; 
	}

	public void withdraw(double amount){
		cash=cash-amount; 
	}

	public void add(double amount){
		cash=cash+amount; 
	}

} 
