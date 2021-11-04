public class Products{
	private final String description; 
	private final Person productOwner; 

public Products ( String desc, Person name) {
	description=desc; 
	productOwner=name; 
}

public String getn(){
	return (productOwner.getName()); 
}

public String getDescription(){
	return description; 
}

public Person getPerson(){
	return (productOwner); 
}


}

