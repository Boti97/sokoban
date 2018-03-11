package soko;

public abstract class Thing {
	private Field field;
	private Boolean pushed;
	
	public Thing() {}
	public void destroy() {}
	public Boolean hasWeight() {return false;}
	public void move(Direction d) {}
	public void push(Direction d) {}
	public void hitBy(Worker w, Direction d, Boolean b) {}
	public void hitBy(Box box, Direction d, Boolean b) {}
	public void collideWith(Thing t, Direction d) {}
}
