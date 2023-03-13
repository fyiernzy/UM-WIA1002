/** 
    A class that represents a coin.
    @author Frank M. Carrano
    @author Timothy M. Henry
    @version 4.0
*/
public class Coin
{
   private enum CoinSide {HEADS, TAILS}
   private CoinName myName;
   private int value; // in cents
   private int year;  // mint year
	private CoinSide sideUp;

   /** Constructs an object for the coin having a given  
       value and mint year. The visible side of the new
	    coin is set at random. */
   public Coin(int coinValue, int mintYear)
   {
      switch (coinValue)
      {
         case 1:
             myName = CoinName.PENNY;
             break;
         case 5:
             myName = CoinName.NICKEL;
             break;
         case 10:
             myName = CoinName.DIME;
             break;
         case 25:
             myName = CoinName.QUARTER;
             break;
         case 50:
             myName = CoinName.FIFTY_CENT;
             break;
         case 100:
             myName = CoinName.DOLLAR;
             break;
         default:   
             myName = CoinName.PENNY;
             break;
      } // end switch

      value = coinValue;
      year = mintYear;
		sideUp = getToss();
   } // end constructor
	
   /** Constructs an object for the coin having a given  
       name and mint year. The visible side of the new
	    coin is set at random. */
   public Coin(CoinName name, int mintYear)
   {
      switch (name)
      {
         case PENNY:
             value = 1;
             break;
         case NICKEL:
             value = 5;
             break;
         case DIME:
             value = 10;
             break;
         case QUARTER:
             value = 25;
             break;
         case FIFTY_CENT:
             value = 50;
             break;
         case DOLLAR:
             value = 100;
             break;
         default:   
             value = 1;
             break;
      } // end switch

      myName = name;
      year = mintYear;
		sideUp = getToss();
   } // end constructor
	
   /** Returns the name of the coin. */
	public CoinName getCoinName()
   {
      return myName;
   } // end getCoinName

   /** Returns the value of the coin in cents. */
	public int getValue()
	{
		return value;
	} // end getValue

	/** Returns the coin's mint year as an integer. */
	public int getYear()
	{
		return year;
	} // end getYear
	
   /** Returns "HEADS" if the coin is heads-side up;
	    otherwise, returns "TAILS". */
	public String getSideUp()
	{
   /*
		String result = "Tails";
		if (sideUp == CoinSide.HEADS)
			result = "Heads";
		return result;
   */
      return sideUp.toString();
	} // end getSideUp
	
	/** Returns true if the coin is heads-side up. */
	public boolean isHeads()
	{
		return sideUp == CoinSide.HEADS;	
	} // end isHeads
	
	/** Returns true if the coin is tails-side up. */
	public boolean isTails()
	{
		return sideUp == CoinSide.TAILS;	
	} // end isTails
	
	/** Tosses the coin; sideUp will be either HEADS or TAILS at random. */
	public void toss()
	{
		sideUp = getToss();
	} // end toss
   
   /** Returns the coin as a string in the form "value/year/side-up". */
   public String toString()
   {
      return value + "/" + year + "/" + sideUp;
   } // end toString
   
   // Returns a random value of either HEADS or TAILS.
	private CoinSide getToss()
	{
		CoinSide result;
		if (Math.random() < 0.5)
			result = CoinSide.HEADS;
		else
			result = CoinSide.TAILS;
      
		return result;
	} // end getToss
} // end Coin