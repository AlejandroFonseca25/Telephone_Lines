package model;

public abstract class TelephoneLine
{
	///////////////////////////////////////////////
	//                 Attributes			     //
	///////////////////////////////////////////////
	private final int localCost;
	private int localMins;

	///////////////////////////////////////////////
	//				  Constructor				 //
	///////////////////////////////////////////////   
	public TelephoneLine (int localMins)
	{
		this.localCost = 35;
		this.localMins = localMins;
	}

	///////////////////////////////////////////////
	//                Get Methods                //
	///////////////////////////////////////////////
	public int getLocalCost ()
	{
		return  this.localCost;
	}

	public int getLocalMins ()
	{
		return this.localMins;
	}

	///////////////////////////////////////////////
	//                Set Methods                //
	///////////////////////////////////////////////
	public void setLocalMins (int localMins)
	{
		this.localMins = localMins;
	}

	///////////////////////////////////////////////
	//             	  FR Methods                 //
	///////////////////////////////////////////////
	public double calculateLocalCost ()
	{
		double total = 0;
		total = localCost * localMins;
		return total;
	}

	public abstract double calculateTotalCost ();	
}