public class Auction extends User{
	private String auctionFileName; 
	private ArrayList<User> userNames; // I added this to make my life easier 
	private String tumbnailFileName; 
	private String proudctDescription; 
	private double curprice; 
	private int blocksTillMine; 

	public Auction(String aucFilName, String tumb, String description, double mon, int time, ){
		auctionFileName=aucFilName; 
		tumbnailFileName=tumb; 
		productDescription=description; 
		cuprice=mon;
		blockTilMine=time; 
		userNames=new ArrayList<User> (); 
		if (blockTillMine<60 || blockTilMine=>1080){
			System.out.println ("You either entered a time that was too big or too small. Please enter a time in minutes that is more than one hour and less than or email to 7 days")
		}
	}

	public String bid(double price){
		if(sameUser==true){
			return ("you can not bid on your own item"); 
		}
		else if (price<=curprice){
			return ("You must bid an amount that is greater than the higest bid")
		}
		else{
			curprice=price; 
			this.increaseTime(); 
			return("your bid has been placed"); 
		}
	}

	public boolean sameUser(){
		if(this.userName.equals(n)){
			return (true); 
		}
		return (false); 
	}


	public void increaseTime(){
		blockTillMine++; 
	}

}