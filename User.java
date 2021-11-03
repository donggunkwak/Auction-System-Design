import java.util.*; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class User extends Auction{
	private String n; 
	private String ad; 
	private String picAd; 
	private String comment; 


	public User (String name, String address, String pic){
		n=name; 
		ad=address; 
		picAd=pic; 
		comment=null; 
	}

	public boolean sameUser(){ // checks to see if the user who created the auction is the person bidding 
		if(getUser().equals(n)){
			return (true); 
		}
		return (false); 
	}

	public String bid(double price){ // function allows you to bid on an object
		if(sameUser==true){ // if the person bidding is the same as the person who 
			return ("you can not bid on your own item"); 
		}
		else if (price<=curprice){
			return ("You must bid an amount that is greater than the higest bid"); 
		}
		else if (expire==false){
			curprice=price; 
			this.increaseTime(); 
			userNames.add((User) u=new User(n,ad,picAd)); 
			return("your bid has been placed"); 
		}
		else {
			return ("sorry the auction has expired " + getWinner() + "is the winner"); 
		}
		return ""; 
	}

	public void comment(String words){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
  		LocalDateTime now = LocalDateTime.now();  
  		String time=System.out.println(dtf.format(now));  
		comment=n+" " +words+ " "+ time; 

	}

	public String getComment(){
		return (comment); 
	}

	public void deleteComment(){
		comment=null; 
	}

	public String toString(){
		return(n+ " "+ ad+ " "+ picAd + " "+ comment); 
	}

public static void String (String [] args){
	User usz= new User("liana", "fskfs", "puff"); 
	Auction auction= new Auction("blarg", "bloop","blah blah blah", 20.0, 75, "kevin"); 
	usz.bid(21.0); 
}



}