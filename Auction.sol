// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.8.9;
import "@openzeppelin/contracts/token/ERC721/IERC721.sol";

contract Auction {
    address public owner; 
    address [] public bidders;
    string productDescription; 
    uint highestBid; 
    bool time; 
    string [] comments; 
    IERC721 nft; 
     uint public _nftId; 
      address public nftt; 
      uint start; 
      uint end; 
    
    constructor(string memory p){
        productDescription=p;
        owner=msg.sender; 
        highestBid=0; 
        time=true; 
        nft=IERC721 (address(0x13066EE900a8C4e2C9cD7cE0096ADF9B907D0CfF)); 
    }
    
    modifier timerOver(){
        require(block.timestamp<=end, "The auction has ended"); 
        _; 
    }
    
    function startTimer() public{
        start=block.timestamp; 
    }
    
    function endTimer(uint totalTime) public{
        end=totalTime+start; 
    }
    
    function getTimeLeft() view public timerOver returns (uint){
        return (end-block.timestamp); 
    }
    
    
    function setNFTAddress(address add) public{
        nftt=add; 
    }
    
    function setNFTID (uint num) public{
        _nftId=num; 
    }
    
     modifier validAddress(address add) {
        require(add!= address(0), "Not valid address");
        _;
    }
    
    modifier notOwner(address add){
        require(add!=owner, "The owner of the product can not bid on their own object"); 
        _; 
    }
    
    
     function placeBid (uint bidAmount) public timerOver returns(bool){
         require (playGame()==true, "sorry you rolled a one and lost the game. You will need to place another bid and hope you dont roll a one"); 
       if (bidAmount>highestBid && enoughMoney (msg.sender, bidAmount)){
           highestBid=bidAmount; 
           bidders.push(msg.sender); 
          return (true); 
       }else{
           return (false); 
    }
    }
    
    function enoughMoney(address add, uint bidAmount) private  view validAddress(add) returns (bool){
       uint totalMoney=add.balance/10^18; 
       if(totalMoney>=bidAmount){
           return (true); 
       } else{
           return (false); 
       }
    }
    
    function comment(string memory name, string memory message) public returns (string memory){
       string memory name2=append(name, ": "); 
       comments.push(append(name2, message)); 
       return (append(name2, message)); 
    }
    
    
    function append(string memory a, string memory b) internal pure returns (string memory) {
    return string(abi.encodePacked(a, b));

    }
    
    function declareWinner() public payable returns (address add){
          uint length=bidders.length; 
           address add1 = bidders[length-1]; 
           nft.transferFrom(address(this), add1, _nftId);
          return (add); 
  }
  
  function commentsArray () public view returns (string[] memory){
      return (comments); 
  }
  
   function random () private view returns(uint){
    return uint(keccak256(abi.encodePacked(block.timestamp, block.difficulty, msg.sender)))%4;
    }
  
  
  function playGame() view public returns (bool){
        uint num = random(); 
        if (num==1){
            return false;  
        } else{
            return true; 
        }
        
    }
  }
