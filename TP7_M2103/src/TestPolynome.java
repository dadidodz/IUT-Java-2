import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPolynome {

    @Test
    public void testtoStringPolynomeNul() {
        Polynome nul = new Polynome();
        assertEquals("0", nul.toString());
    }

    @Test
    public void testtoStringPolynomeCoefficientsPositifs() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(8F, 4));
        p.setMonome(new Monome(8F, 2));
        p.setMonome(new Monome(1F, 0));
        assertEquals("8.0xe4 + 8.0xe2 + 1.0", p.toString());
    }

    @Test
    public void testtoStringPolynomeCoefficientsPositifsEtNégatifs() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(128F, 8));
        p.setMonome(new Monome(160F, 4));
        p.setMonome(new Monome(-32F, 2));
        p.setMonome(new Monome(1F, 0));
        assertEquals("128.0xe8 + 160.0xe4 - 32.0xe2 + 1.0", p.toString());
    }

    @Test
    public void testtoStringPolynomePremierCoefficientNégatif() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(-128F, 8));
        p.setMonome(new Monome(160F, 4));
        p.setMonome(new Monome(-32F, 2));
        p.setMonome(new Monome(1F, 0));
        assertEquals("-128.0xe8 + 160.0xe4 - 32.0xe2 + 1.0", p.toString());
    }

    @Test
    public void testDerivePolynome() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(2F, 2));
        p.setMonome(new Monome(6F, 1));
        p.setMonome(new Monome(32F, 0));
        assertEquals("4.0x + 6.0", p.dérivée().toString());
    }

    @Test
    public void testSommePolynomes() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(-128F, 8));
        p.setMonome(new Monome(160F, 4));
        p.setMonome(new Monome(-32F, 2));
        p.setMonome(new Monome(1F, 0));
        Polynome other = new Polynome();
        other.setMonome(new Monome(128F, 8));
        other.setMonome(new Monome(6F, 4));
        other.setMonome(new Monome(33F, 3));
        assertEquals("166.0xe4 + 33.0xe3 - 32.0xe2 + 1.0",
                p.somme(other).toString());
    }

    @Test
    public void testProduitPolynomeParMonome() {
        Polynome p = new Polynome();
        p.setMonome(new Monome(128F, 8));
        p.setMonome(new Monome(160F, 4));
        p.setMonome(new Monome(-32F, 2));
        p.setMonome(new Monome(1F, 0));
        Monome m = new Monome(2F, 1);
        assertEquals("256.0xe9 + 320.0xe5 - 64.0xe3 + 2.0x",
                p.produit(m).toString());
    }
    
    @Test
    public void testDegré() {
    	Polynome p = new Polynome();
    	p.setMonome(new Monome(15F,5));
    	p.setMonome(new Monome(13F,3));
    	p.setMonome(new Monome(4F,2));
    	p.setMonome(new Monome(10F,0));
    	assertEquals(5, p.degré());
    }
    
    @Test
    public void testDifférence() {
    	Polynome p1 = new Polynome();
    	p1.setMonome(new Monome(20F,3));
    	p1.setMonome(new Monome(5F,2));
    	p1.setMonome(new Monome(17F,1));;
    	Polynome p2 = new Polynome();
    	p2.setMonome(new Monome(10F,3));
    	p2.setMonome(new Monome(2F,2));
    	assertEquals("10.0xe3 + 3.0xe2 + 17.0x",
    			p1.différence(p2).toString());
    }
}
