import java.util.ArrayList; 
import java.util.Timer;
import java.util.TimerTask;

public class Auction2 {
private ArrayList<Person> bidders;  
private int blockTilMine; 
private Products product; 

public Auction2 (int time, Products p){
	bidders=new ArrayList<Person> (); 
	product=p; 
	if (time<60 || time>1080){
		System.out.println("your entered an invalid amount of time an auction can run for. The time will be set to a default of 3 days "); 
		blockTilMine=4320; 
	}else{
		blockTilMine=time; 
	}
}

public Person getHighestBidder(){
	double amount=0; 
	Person store=null; 
	for (int i=0; i<bidders.size(); i++){
		double bid= bidders.get(i).getBidAmount(); 
		if (bid>amount){
			amount=bid; 
			store=bidders.get(i); 
		}
	}
	return (store); 
}

public double getHighestAmount(){
	double amount=0; 
	for (int i=0; i<bidders.size(); i++){
		double bid= bidders.get(i).getBidAmount(); 
		if (bid>amount){
			amount=bid;  
		}
	}
	return (amount); 
}

public boolean placeBid(Person user){
	double amount=user.getBidAmount(); 
	if (amount>this.getHighestAmount() && blockTilMine>0 && !user.getName().equals(product.getn()) && !user.getName().equals(this.getHighestBidder().getName())){
		bidders.add(user); 
		System.out.println("your bid has succesffuly been placed");
		this.increaseTime(); 
		return (true); 
	}
	System.out.println ("Oh no! The auction has already ended or you are the product owner or your bid wasn't high enough"); 
	return (false); 
}

public void increaseTime(){
	blockTilMine++; 
}

public void setTime(int num){
	blockTilMine=num; 
}

public Person declareWinner(){
	if (blockTilMine==0){
		double money=getHighestAmount(); 
		Person user=getHighestBidder(); 
		user.withdraw(money); 
		product.getPerson().add(money); 
		return (user); 
	}
	System.out.println("there is still time remaining in the Auction"); 
	return (null); 

}

}