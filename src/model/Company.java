package model;

import java.util.ArrayList;

public class Company 
{
	///////////////////////////////////////////////
	//               Attributes				     //
	///////////////////////////////////////////////
	private ArrayList<TelephoneLine> telephoneLines;

	///////////////////////////////////////////////
	//			     Constructor	  			 //
	/////////////////////////////////////////////// 
	public Company ()
	{
		telephoneLines = new ArrayList<TelephoneLine>();
	}

	///////////////////////////////////////////////
	//                FR Methods                 //
	///////////////////////////////////////////////
	public void addLine (int type, int localMins, int cellphoneMins, int longMins)
	{
		if (type == 1)
		{
			TelephoneLine basic = new BasicTelephoneLine(localMins);
			telephoneLines.add(basic);
		}

		else if (type == 2)
		{
			TelephoneLine cellphone = new CellphoneLine (localMins, cellphoneMins);
			telephoneLines.add(cellphone);
		}

		else 
		{
			TelephoneLine voiceIP = new VoiceIPLine (localMins, cellphoneMins, longMins);
			telephoneLines.add(voiceIP);			
		}
	}

	public String calculateAllCost ()
	{
		double total = 0;

		for (int i = 0; i < telephoneLines.size(); i++)
		{
			if (telephoneLines.get(i) instanceof BasicTelephoneLine == true)
			{
				BasicTelephoneLine temp = (BasicTelephoneLine) telephoneLines.get(i);
				total += temp.calculateTotalCost();
			}

			else if (telephoneLines.get(i) instanceof CellphoneLine == true)
			{
				CellphoneLine temp = (CellphoneLine) telephoneLines.get(i);
				total += temp.calculateTotalCost();
			}

			else if (telephoneLines.get(i) instanceof VoiceIPLine == true)
			{
				VoiceIPLine temp = (VoiceIPLine) telephoneLines.get(i);
				total += temp.calculateTotalCost();
			}
		}
		String msg = "The cost of all lines added up is: " + total + " pesos.";
		return msg;
	}


}