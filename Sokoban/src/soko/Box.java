package soko;

public class Box {
	private WareHouse wh;
	private Boolean pushable;
	private DestField det;
	
	public Box() {}
	public void destroy() {}
	public void SetDestField(DestField df) {}
	public Boolean hasWeight() {return false;}
	public void move(Direction d) {}
	public void push(Direction d) {}
	public void hitBy(Worker w, Direction d, Boolean b) {}
	public void hitBy(Box box, Direction d, Boolean b) {}
	public void collideWith(Thing t, Direction d) {}
}
