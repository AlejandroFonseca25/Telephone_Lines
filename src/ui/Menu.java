package ui;

import java.util.Scanner;
import model.*;

public class Menu
{
	private Scanner reader;
	private Company company;

	public Menu ()
	{
		reader = new Scanner(System.in);
		company = new Company();
	}

	public static void main (String[] args)
	{
		Menu menu = new Menu ();
		menu.init();
		menu.mainMenu();
	}

	public void mainMenu ()
	{
		boolean on = true;
		int decision = 0;
		
		while (on == true)
		{
			System.out.println("\n~~~|||Cost manager pro 2019 edition|||~~~\nSelect a function.");
			System.out.println("\n1 = Calculate cost of all lines.");
			System.out.println("2 = Get line info. (Coming soon)");
			System.out.println("3 = Add line. (Coming very soon)");
			System.out.println("4 = Delete line. (Coming later)");
			System.out.println("5 = Change the minutes of a type of call. (Coming soon too ^^)");
			System.out.println("6 = Exit.\n");
		
			decision = reader.nextInt();

			if (decision == 1)
			{
				String msg = company.calculateAllCost();
				System.out.println("\n" + msg);
			}

			else if (decision == 6)
			{
				on = false;
			}

			else
			{
				System.out.println("\nNot available yet x_x try another one.");
			}
		}
	}

	public void init ()
	{
		company.addLine(1, 450, 0, 0);
		company.addLine(2, 200, 1200, 0);
		company.addLine(2, 100, 30, 0);
		company.addLine(1, 165, 0, 0);
		company.addLine(3, 55, 39, 75);
	}
}