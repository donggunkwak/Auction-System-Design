
import java.util.*; 
public class Auction extends User{
	private String auctionFileName; 
	private ArrayList<User> userNames; // I added this to make my life easier 
	private String tumbnailFileName; 
	private String proudctDescription; 
	private double curprice; 
	private int blocksTillMine; 
	private String usssser; // the person that creates the auction
	private String winner; 

	public Auction(String aucFilName, String tumb, String description, double mon, int time, Stig user){
		auctionFileName=aucFilName; 
		tumbnailFileName=tumb; 
		productDescription=description; 
		cuprice=mon;
		usssser=user; 
		blockTilMine=time; 
		userNames=new ArrayList<User> (); 
		if (blockTillMine<60 || blockTilMine=>1080){
			System.out.println ("You either entered a time that was too big or too small. Please enter a time in minutes that is more than one hour and less than or email to 7 days")
		}
	}

	public String getuser(){
		return (usssser); 
	}

	public void increaseTime(){
		blockTillMine++; 
	}

	public boolean expire(){ // has the time of the auction expired 
		if(blockTilMine==0){
			winner=userNames.get(userNames.size()-1); 
			return (true); 
		}
		return (false); 
	}

public String getWinner(){
	return winner; 
}

}