
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculTest {
	Calcul calcul = new Calcul();

	@Test
	public void testCalculerSom() {
	assertEquals(28, calcul.calculerSom(10, 15));
	}
	@Test
	public void testCalculerDiff() {
	assertEquals(30, calcul.calculerDiff(40, 10));
	}
}
