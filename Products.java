public class Product{
	private final number; // represent number in arrayList applicable to Auction class 
	private final String description; 
	private Bid highestBid; 
	private final Person productOwner; 
	private int BlocksTilMine; 

public Product (int counter, String desc, Person name, int time){
	number=counter; 
	description=desc; 
	higestBid=null; 
	productOwner=name; 
	BlocksTilMine=time; 
}

public void replaceHighestBid(Bid bid){
		if (!bid.getBidder().getName().equals(productOwner.getName() && bid.getAmount()>highestBid){
			highestBid=bid; 
			this.increaseTime();
		}else{
			System.out.println("You either can't bid on your own product or your bid was too low");
		} 

}

public void increaseTime(){
	blockTilMine++; 
}


}

