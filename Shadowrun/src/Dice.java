/* Dice
 * This class will handle the doce rolls of the dice pools for players
 * and GM.
 * 
 * 
 * 
 * 
 * 
 */
///////////////////////////////////////////////////////////////////////
public class Dice 
{
	final int DIE_SIDE_NUMBER = 6;
	private int diePoolSize;
	private int[] dieResults;
//---------------------------------------------------------------------	
	public Dice(int poolSize)
	{
		this.diePoolSize = poolSize;
		this.dieResults = new int[poolSize];
	}
//---------------------------------------------------------------------
	public Dice()
	{
		this.diePoolSize = 0;
		this.dieResults = new int[0];
	}
//---------------------------------------------------------------------
	public void setDicePoolSize(int poolSize)
	{
		diePoolSize = poolSize;
	}
//---------------------------------------------------------------------	
	public void dieRollResult()
	{
		dieResults = new int[diePoolSize];
		for(int i = 0; i < diePoolSize; i++)
		{
			dieResults[i] = (int )(Math.random() * (DIE_SIDE_NUMBER) + 1);
		}
	}
//---------------------------------------------------------------------
	public void getDieResults()
	{
		if(dieResults.length == 0)
			System.out.println("No Test has been performed.");
		for(int i = 0; i < dieResults.length; i++)
		{
			System.out.println(dieResults[i]);
		}
	}
///////////////////////////////////////////////////////////////////////
}
