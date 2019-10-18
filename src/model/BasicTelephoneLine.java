package model;

public class BasicTelephoneLine extends TelephoneLine
{
	///////////////////////////////////////////////
	//				   Constructor				 //
	///////////////////////////////////////////////  
	public BasicTelephoneLine (int localMins)
	{
		super(localMins);
	}

	///////////////////////////////////////////////
	//                FR Methods                 //
	///////////////////////////////////////////////
	@Override
	public double calculateTotalCost ()
	{
		double total = 0;
		total = calculateLocalCost();
		return total;
	}
}