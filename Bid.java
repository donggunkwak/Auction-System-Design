public class Bid{
	private final Person name;
	private final double price; 

public Bid(Person per, double amount){
	name=per; 
	price=amount; 
}

public void makeBid(){

}

public Person getBidder(){
	return (name); 
}

}