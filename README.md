#Auction-System-Design

##### Profile
- Make a username to connect with users' wallets
- Optional Profile Picture

##### Commenting
- Anyone can comment on auction item pages (pages for each individual auction item)
- Shows comments time and also the username and profile picture of who commented it
- User who commented can delete their comment

##### Creating an auction for your item:
- Add name (max 50 characters)
- File you are auctioning (like mp4, mp3, png, jpeg, txt, etc.)
- Optional picture (jpeg, png, gif)
- Description of item (max 280 characters)
- Starting price of auction item
- Time for auction, how long the auction lasts, has to be at least over 1 hour, and less than or equal to a week

##### Bidding
- Pages for each individual auction item contains the name of auction item, optional picture, current price, current highest bidder, time remaining, and comments
- Anyone can bid on the item as long as it is higher than the current price
- After someone bids on an item, the amount of time remaining for the auction gets extended by 1 minute
- You CANNOT bid on your own item
- You CANNOT bid on an item if you currently have the highest bid on that item
- At the end of the time, the person with the highest bid wins the item, and automatically pays the person with the item
- To try to get no ties when someone bids, we require a small game to be played each time someone bids, also to try to make it that no robots are auto bidding.
	- GAME RULES:
	- They play a small minesweeper game, with an 8X10 board with 10 bombs (like the one on google's easy mode), 
	- It is the same bomb locations for each person, and the bomb locations will switch every time someone makes a bet (basically make a new game each time)
	- The first person to finish this game will have their bid go through
	- If two people finish at the same time, the person with the least fails will have their bid go through first
	- If they have the same time and the same number of fails, the person who made their bid first will go through
	- If EVERYTHING is the same, which is very unlikely, then a random person will be chosen for their bid to go through
	- This also allows people to get better at minesweeper while trying to prevent ties and auto-robots

