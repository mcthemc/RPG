import java.util.Random;
import java.lang.Math;

public class Enemy { 
  /* in the distant future, the Enemy stats and type will be based on location and/or player level. */ 
  private Random rand = new Random(); 
  
  private int level, HP, beardPoints, power, armor;
  
  public Enemy(){
    this(1); // this creates an enemy with level 1 if there is no level passed to the constructor
  }
  
  public Enemy(int playerLevel){
    level = (int)(playerLevel*1.5); // ITDF, this will be set by an if statement, based on the location and play level
    HP = level * 10;
    beardPoints = 
    
  }
  
  public int getLevel() {return level;}
  public int getHP() {return HP;}
  public int getBeardPoints() {return beardPoints;}
  public int getPower() {return power;}
  public int getArmor() {return armor;}
  
  public void damage(int decrement) {
    if (HP - decrement <= 0) 
      HP = 0;
    else 
      HP -= decrement; 
  }  
  
  public void die() { // for when you murder the bastard
    
  }
  
}