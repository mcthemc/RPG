import java.util.Random;

public class Enemy { 
  /* in the distant future, the Enemy stats and type will be based on location and/or player level. */ 
  Random rand = new Random(); 
  
  /* STATS */
  private int level = rand.nextInt(10); // ITDF, this will be set by an if statement, based on the location
  private int HP = level * 10; // ITDF this will have some sort of equation to set a fair HP based on level and stats
  
  public int getStats(String stat) { 
    if (stat.equals("level")) 
      return level; 
    else if (stat.equals("HP"))
      return HP;
    else return HP;
  }
  public void lowerHP(int decrement) {
    if (HP - decrement <= 0) 
      HP = 0; 
    else 
      HP -= decrement; 
  }
  public void 
  
}