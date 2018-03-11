package soko;

public class SwitchableHole extends Hole implements Switchable{
	private Boolean open;
	
	public SwitchableHole() {}
	public void accept(Thing t, Direction d) {}
	public void Switch() {}
}
