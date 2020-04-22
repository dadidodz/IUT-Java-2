
public abstract class Case {
	
	private int num�ro;
	
	public Case(int num�ro) throws IllegalArgumentException {
		if (num�ro>48) {
			throw new IllegalArgumentException("Num�ro de case sup�rieur � 48");
		}
		this.num�ro = num�ro;
	}
	
	protected int getNum�ro() {
		return this.num�ro;
	}
	
	public abstract int calculD�placement(int valeur);
	
	@Override
	public String toString() {
		return "[case n�" + num�ro + "] : ";
	}
}
