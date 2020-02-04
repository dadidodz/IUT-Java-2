
public class Rationnel {
	private long numerateur;
	private long denominateur;
	
	public static long pgcd (long a, long b) {
		while (a!=b) {
			if(a>b) {
				a-=b;
			}
			else {
				b-=a;
			}
		}
		return a;
	}
	
	public Rationnel (long a, long b) throws IllegalArgumentException {
		if (b==0) {
			throw new IllegalArgumentException("b=0");
		}
		this.numerateur=a;
		this.denominateur=b;
	}
	
	public long getNumerateur () {   
		return this.numerateur;
	}
	
	public long getDenominateur () {
		return this.denominateur;
	}
	
	public Rationnel reduction () {
		long p=Rationnel.pgcd (this.numerateur, this.denominateur);
		return new Rationnel(
				this.numerateur/p,
				this.denominateur/p);
	}
	
	public Rationnel somme (Rationnel r) {
		return new Rationnel (
				this.numerateur*r.denominateur+r.numerateur*this.denominateur,
				this.denominateur*r.denominateur);
	}
	
	public Rationnel produit (Rationnel r ) {
		return new Rationnel (
				this.numerateur*r.numerateur,
				r.denominateur*this.denominateur);
	}
	
	public String toString() {
		Rationnel r=this.reduction();
		return r.numerateur + "/" + r.denominateur;
	}
}

