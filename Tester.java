public class Tester{
		public static void main (String [] args){
			Person user1= new Person ("fsjfsak", "Liana", 40); 
			Person user2= new Person("sfhsa", "Bella", 100); 
			Person user3 = new Person ("fsfaf", "Kevin", 8); 
			Person user4 = new Person("fasfsa", "Aaron",300); 
			Products product1= new Products("NFT of Dog", user4);
			Auction2 auc= new Auction2 (300, product1); 
			user1.placeBid(10); 
			auc.placeBid(user1); 
			auc.setTime(0); 
			System.out.println(auc.declareWinner()); 
		}
}
