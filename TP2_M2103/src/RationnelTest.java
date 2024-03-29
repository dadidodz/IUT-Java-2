import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RationnelTest {

    @Test
    public void testConstructeur() {
        Rationnel r = new Rationnel(1, 2);
        assertEquals(1, r.getNumerateur());
        assertEquals(2, r.getDenominateur());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructeurParametreInvalide() {
        new Rationnel(1, 0);
    }

    @Test
    public void testCalculPgcd() {
        assertEquals(3, Rationnel.pgcd(3, 3));
        assertEquals(3, Rationnel.pgcd(15, 3));
        assertEquals(3, Rationnel.pgcd(9, 3));
        assertEquals(3, Rationnel.pgcd(6, 3));
        assertEquals(3, Rationnel.pgcd(3, 15));
        assertEquals(5, Rationnel.pgcd(15, 10));
    }

    @Test
    public void testReduction() {
        Rationnel r = new Rationnel(15, 10).reduction();
        assertEquals(3, r.getNumerateur());
        assertEquals(2, r.getDenominateur());
    }

    @Test
    public void testSomme() {
        Rationnel s = new Rationnel(3, 5).somme(new Rationnel(2, 10));
        assertEquals(40, s.getNumerateur());
        assertEquals(50, s.getDenominateur());
    }

    @Test
    public void testProduit() {
        Rationnel p = new Rationnel(3, 5).produit(new Rationnel(2, 10));
        assertEquals(6, p.getNumerateur());
        assertEquals(50, p.getDenominateur());
    }

    @Test
    public void testToString() {
        assertEquals("3/5", new Rationnel(9, 15).toString());
    }

}
