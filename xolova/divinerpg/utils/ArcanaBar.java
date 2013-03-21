package xolova.divinerpg.utils;


public class ArcanaBar
{
    public String playerID;
	private int arcana = 0;
    private int regenDelay = 0;
    
    public ArcanaBar(int par1, String username)
    {
        this.arcana = par1;
        this.regenDelay = 0;
        this.playerID = username;
    }

    public void arcanaRegen(int par1)
    {
        if (regenDelay == 0)
        {
            arcana += par1;
        }
        else
        {
            regenDelay--;
        }
    }

    public void arcanaAdd(int par1)
    {
        arcana += par1;
    }
    public boolean arcanaUse(int par1)
    {
        if (arcana < par1)
        {
            regenDelay = 30;
            return false;
        }
        else
        {
            arcana -= par1;
            regenDelay = 30;
            return true;
        }
    }
    
    public float getBarValue()
    {
    	return arcana;
    }
    
    public void setArcana(int par1)
    {
    	arcana = par1;
    }
}
