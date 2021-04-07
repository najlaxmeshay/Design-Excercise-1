package gameDesign;
import java.util.HashMap;
import java.util.Map;

public class Players {
	private int id;
	private String userName;
	public  int level;
	public int strength;
	public int endurance;
	public String wisdom;
	public int charisma;
	
	Map <Integer, Players> list;
	
	
	public Players (int id, String userName, int level, int strength, int endurance, String wisdom, int charisma) {
		this.id = id;
		this.userName = userName;
		this.strength = strength;
		this.endurance = endurance;
		this.level = level;
		this.charisma = charisma;
		this.wisdom = wisdom;
		
		
		list = new HashMap<Integer, Players>();
	}
	
	
	public int getID() {
		return this.id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getStrength() {
		return this.strength;
	}
	
	public int getEndurance() {
		return this.endurance;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public int getCharisma() {
		return this.charisma;
	}
	
	public String getWisdom() {
		return this.wisdom;
	}
	
	public void add(Players p) {
		if(!list.containsKey(p.getID())) 
			list.put(p.getID(),p);
	}
	public void setStrength(int s) {
		this.strength = s;
	}
	
	public void setEndurance( int e) {
		this.endurance = e;
	}
	
	public void setLevel( int l) {
		this.level = l;
	}
	
	public void setCharisma(int c ) {
		this.charisma = c;
	}
	
	public void setWisdom( String w) {
		this.wisdom = w;
	}
	public String toString() {
		return String.format("Players: id=%d, name=%s", this.id, this.userName);
	}
}	

