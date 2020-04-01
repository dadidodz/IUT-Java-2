import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CaseNormaleTests {
	
	private CaseNormale c;
	
	@Before
	public void setUp() throws Exception {
		this.c = new CaseNormale(0);
	}
	
	@After
	 public void tearDown() throws Exception {
	 this.c = null;
	 }
	
	@Test
	public void testCaseNormale() {
		assertEquals(2, this.c.calculDéplacement(2));
	}

}
