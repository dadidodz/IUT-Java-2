
public class Dur�e {
	private int heures;
	private int minutes;
	private int secondes;
	
	public Dur�e (int h, int m, int s) throws IllegalArgumentException {
		if (h<0){
			throw new IllegalArgumentException("h < 0");
		}
		else if (m<0 | m>59) {
			throw new  IllegalArgumentException("m < 0 ou m >59");
		}
		else if (s<0 | s>59) {
			throw new IllegalArgumentException("s < 0 ou s > 59");
		}
		this.heures=h;
		this.minutes=m;
		this.secondes=s;
	}
	
	public int heures() {
		return this.heures;
	}
	
	public int minutes() {
		return this.minutes;
	}
	
	public int secondes() {
		return this.secondes;
	}
	
	public boolean �gal(Dur�e d) {
		return (this.heures==d.heures & this.minutes==d.minutes & this.secondes==d.secondes);
	}
	
	public boolean inf(Dur�e d) {
		return (this.heures<d.heures | (this.heures==d.heures & this.minutes<d.minutes) | (this.heures==d.heures & this.minutes==d.minutes & this.secondes<d.secondes));
	}
}
