package week3;

public interface person {
	public void canWalk();
}


class Tyler implements person{
	public void canWalk() {
		System.out.println("Tyler can Walk.");
	}
}