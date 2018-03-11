package soko;

public class Worker extends Thing{
	private int points;
	
	public Worker() {}
	public Boolean hasWeight() { return false;}
	public void addPoints(int add) {points += add;}
	public void push(Direction d) {}
	public void hitBy(Worker w, Direction d, Boolean b) {}
	public void hitBy(Box box, Direction d, Boolean b) {}
	public void collideWith(Thing t, Direction d) {}
}
