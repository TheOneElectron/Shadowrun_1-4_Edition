import java.util.Scanner;


public class CharacterGenerator 
{
	String characterName = "I need a name!";
	String characterRace = "Not selected yet.";
	int[] raceMaxAttribute;
	int maxAttributes;
	
	public void nameAndRaceSetUp(String name, int race)
	{
		characterName = name;
		switch(race)
		{
		case(1):
			characterRace = "Dwarf";
			int[] dMax = {7,5,8,6,6,7,6,6,5};
		    maximumAtributesSetUp(raceMaxAttribute,dMax);
			break;
		case(2):
			characterRace = "Elf";
		    int[] eMax = {6,7,6,8,6,6,6,6,6};
		    maximumAtributesSetUp(raceMaxAttribute,eMax);
			break;
		case(3):
			characterRace = "Human";
			int[] hMax = {6,6,6,6,6,6,6,6,6};
	    	maximumAtributesSetUp(raceMaxAttribute,hMax);
			break;
		case(4):
			characterRace = "Orc";
			int[] oMax = {9,6,8,5,5,6,6,6,5};
			maximumAtributesSetUp(raceMaxAttribute,oMax);
			break;
		case(5):
			characterRace = "Troll";
			int[] tMax = {11,5,10,4,4,5,6,6,4};
	  	  maximumAtributesSetUp(raceMaxAttribute,tMax);
			break;
		default:
			System.out.println("Please select again.");	
		}
	}
	
	private void maximumAtributesSetUp(int[] rMA, int[] maxRacialAtt)
	{
		for(int i = 0; i < maxAttributes; i++)
		{
			rMA[i] = maxRacialAtt[i];
		}
	}
	
	public void attributeSetUp(int[] att, int[] dRoll)
	{
		boolean editCharacterStats = true;
		boolean[] hasBeenSelected = new boolean[maxAttributes];
		while(editCharacterStats)
		{
			for(int i = 0; i < maxAttributes; i++)
			{
				int choice = 0;
				choice = getInput(hasBeenSelected);
				switch(choice)
				{
					case(1):
						att[0] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(2):
						att[1] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(3):
						att[2] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(4):
						att[3] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(5):
						att[4] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(6):
						att[5] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(7):
						att[6] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(8):
						att[7] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					case(9):
						att[8] = dRoll[i];
						hasBeenSelected[0] = true;
						break;
					default:
				}
			}
			System.out.println("Are these stats ok?");
			if(yes())
				editCharacterStats = false;
		}
	}
	
	public int getInput(boolean[] select)
	{
		int choice = 0;
		while(true)
		{
			Scanner kb = new Scanner(System.in);
		    choice = kb.nextInt();
			if(select[choice - 1] == false)
			{
				return choice;
			}
		}
	}
	
	public boolean yes()
	{
		System.out.println("Are these attributes ok?");
		Scanner kb = new Scanner(System.in);
	    int choice = kb.nextInt();
	    if(choice == 1)
	    	return true;
		return false;
	}
}
