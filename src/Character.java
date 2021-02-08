//3. 
//Here we'll create a class to use in our driver class

//This class doesn't have a main. Can it be compiled?
//Can it be executed?

public class Character
{


    private String name;
    private int strength;
    private int hitPoints;
    private boolean alive;

    public String nic;

	public void setName(String name)
	{
	    this.name = name;
	}

	public String getName() {

	    return name;

    }

    public void setHitPoints(int hitPoints){

	    if (hitPoints > 99){
	        this.hitPoints = 99;
        } else {
	        this.hitPoints = hitPoints;
        }

    }

    public void setStrength(int strength){
	    if (strength > 10){
	        this.strength = 10;
        } else {
	        this.strength = strength;
        }
    }

    public int getStrength(){
	    return strength;
    }

    public int getHitPoints(){
	    return hitPoints;
    }

    public void showStats() {

        System.out.println("Strength is: " + strength + "\nHitPoints are: " + hitPoints);

    }

    public int takeDamage(int Damage){
	    return this.hitPoints = this.hitPoints - Damage;
    }

    public Character()
    {
        name = "Goblin";
        hitPoints = 10;
        strength = 2;
        alive = true;
    }

    public boolean isAlive(){
	    return this.alive;
    }

    public void setStatus(boolean status){
	    this.alive = status;
    }

    public Character(String name)
    {
        this.name = name;
        hitPoints = 10;
        strength = 2;
        alive = true;
    }

    public Character(String name, int hitPoints, int strength)
    {
        this.name = name;
        setHitPoints(hitPoints);
        setStrength(strength);
        alive = true;
    }

}