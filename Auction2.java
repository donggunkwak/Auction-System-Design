import java.util.ArrayList; 

public class Auction2{
private ArrayList<Products> products; 
private int counter; 

public Auction{
	products=new ArrayList<Product> (); 
	counter=0;
}

public void enterProduct(String description, Person name, int time){
	products.add(new Products(counter, description, name, time)); 
	counter++; 
}

public void showProducts(){
	for (int i=0; i<products.size(); i++){
		System.out.println(products.get(i)); 
	}
}

public ArrayList <Products> unsold(){
	Arraylist<Prodcuts> unsold= new ArrayList<Products> (); 
	for (i=0; i<products.size(); i++){
		Bid bid=products.get(i).getHighestBid(); 
		if (bid==null){
			unsold.add(products.get(i)); 
		}
	}
	return (unsold); 
}

public void makeBid(int productNumber, Person bidder, double amount){
	Product selectProduct=getProduct(productNumber); 
	if (selectProduct!=null){
		Bid bid= new Bid(bidder, value); 
		boolean works=selectProduct.replaceHighestBid(bid); 
		if (works==true){
			System.out.println("Your bid was successful");
		} else{
			System.out.println("Your bid was not sucessful either becuase you bidded on your object or your bid is equal to or less than the highest bid"); 
		}
	}
}

public Prodct getProduct(int productNumber){
	if (productNumber>=0 && productNumber<products.size()){
		return products.get(productNumber); 
	}
	else{
		System.out.println("you entered a product number that isn't valid"); 
		return (null); 
	}
}

}