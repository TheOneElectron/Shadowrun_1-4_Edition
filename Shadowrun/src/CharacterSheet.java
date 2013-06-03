import java.util.Scanner;

///////////////////////////////////////////////////////////////////////
public class CharacterSheet 
{
	final private int maxAttributes = 9;
	
	private String characterName   = null;
	private String characterRace   = null;
	private int[] attributes       = new int[maxAttributes];
	private int[] raceMaxAttribute = new int[maxAttributes];
	private int nuyen;
	private int[] dicePools        = new int[0];
	private Object[] skills        = new Object[0];
	private Object[] gear          = new Object[0];
	private Object[] cyberware     = new Object[0];
	private Object[] contacts      = new Object[0];
	private Object[] spells        = new Object[0];
	private Object[] languages     = new Object[0];
	private Object[] condition     = new Object[0];
	private Object[] allergies     = new Object[0];	
//---------------------------------------------------------------------	
	public int[] getRacialMaxAttributes()
	{
		return raceMaxAttribute;
	}
//---------------------------------------------------------------------	
	public int[] getCharacterAttributes()
	{
		return attributes;
	}
//---------------------------------------------------------------------	
	public void getCharacter()
	{
		System.out.println(characterName);
		System.out.println(characterRace);
		for(int i = 0; i < maxAttributes; i++)
		{
			System.out.println(attributes[i]);
		}
	}
//---------------------------------------------------------------------
}
///////////////////////////////////////////////////////////////////////
