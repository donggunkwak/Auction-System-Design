import java.util.*; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class User{
	private Map<String, String> user; 
	private String n; 
	private String ad; 
	private String picAd; 
	private String comment; 
	private String aucName; 
	private double bidPrice; 

	public User (String name, String address, String pic){
		n=name; 
		ad=address; 
		picAd=pic; 
	}


	public String getAuc (){
		return (aucName); 
	}

	public void comment(String words){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
  		LocalDateTime now = LocalDateTime.now();  
  		String time=System.out.println(dtf.format(now));  
		comment=n+" " words+ " "+time; 

	}

	public String getComment(){
		return (comment); 
	}

	public void deleteComment(){
		comment=null; 
	}


}