package model;

public class CellphoneLine extends TelephoneLine
{
	///////////////////////////////////////////////
	//                  Attributes			     //
	///////////////////////////////////////////////
	private final int cellphoneCost;
	private int cellphoneMins;

	///////////////////////////////////////////////
	//				   Constructor				 //
	///////////////////////////////////////////////
	public CellphoneLine (int localMins, int cellphoneMins)
	{
		super (localMins);
		this.cellphoneCost = 10;
		this.cellphoneMins = cellphoneMins;
	}

	///////////////////////////////////////////////
	//                Get Methods                //
	///////////////////////////////////////////////
	public int getCellphoneCost ()
	{
		return this.cellphoneCost; 
	}

	public int getCellphoneMins ()
	{
		return this.cellphoneMins;
	}

	///////////////////////////////////////////////
	//                Set Methods                //
	///////////////////////////////////////////////
	public void setCellphoneMins (int cellphoneMins)
	{
		this.cellphoneMins = cellphoneMins;
	}

	///////////////////////////////////////////////
	//                FR Methods                 //
	///////////////////////////////////////////////
	public double calculateCellphoneCost ()
	{
		double total = 0;
		total = cellphoneCost * cellphoneMins;
		return total;
	}
	
	@Override
	public double calculateTotalCost ()
	{
		double localTotal = calculateLocalCost();
		double cellphoneTotal = calculateCellphoneCost();

		double total = localTotal + cellphoneTotal;

		return total;
	}
}