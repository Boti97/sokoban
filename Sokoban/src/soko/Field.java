package soko;

public class Field {
	private Thing[] things;
	private Field[] neighbors;
	
	public Field() {}
	public void accept(Thing t, Direction d) {}
	public void remove(Thing t) {}
	public Field getNeighbor(Direction d) {return null;}
	public void setNeighbor(Direction d, Field f) {}
}
