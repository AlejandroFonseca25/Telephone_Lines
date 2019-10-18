package model;

public class VoiceIPLine extends TelephoneLine
{
	///////////////////////////////////////////////
	//                  Attributes			     //
	///////////////////////////////////////////////	
	private final int cellphoneCost;
	private int cellphoneMins;
	private final int longCost;
	private int longMins;

	///////////////////////////////////////////////
	//				   Constructor				 //
	///////////////////////////////////////////////
	public VoiceIPLine (int localMins, int cellphoneMins, int longMins)
	{
		super (localMins);
		this.cellphoneCost = 7;
		this.cellphoneMins = cellphoneMins;
		this.longCost = 80;
		this.longMins = longMins;
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

	public int getLongCost ()
	{
		return this.longCost; 
	}

	public int getLongMins ()
	{
		return this.longMins;
	}

	///////////////////////////////////////////////
	//                Set Methods                //
	///////////////////////////////////////////////
	public void setCellphoneMins (int cellphoneMins)
	{
		this.cellphoneMins = cellphoneMins;
	}

	public void setLongMins (int longMins)
	{
		this.longMins = longMins;
	}

	///////////////////////////////////////////////
	//                FR Methods                 //
	///////////////////////////////////////////////
	public double calculateLongCost ()
	{
		double total = 0;
		total = longCost * longMins;
		return total;
	}

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
		double longTotal = calculateLongCost();

		double total = localTotal + cellphoneTotal + longTotal;

		return total;
	}
}