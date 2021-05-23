import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RainDropsTest {

	private RainDrops rainDrops;

	@Before
	public void setup() {
		rainDrops = new RainDrops();
	}

	/* Test factors of 3 */
	@Test
	public void NumberGivenis9ReturnsPling() {
		assertEquals("Pling", rainDrops.translate(9));
	}

	@Test
	public void NumberGivenis27ReturnsPling() {
		assertEquals("Pling", rainDrops.translate(27));
	}

	/* Test other */
	@Test
	public void numerIsOne() {
		assertEquals("1", rainDrops.translate(1));
	}

	@Test
	public void numberIs11() {
		assertEquals("11", rainDrops.translate(11));
	}

	/* Test factors of 5 */
	@Test
	public void numberIs5() {
		assertEquals("Plang", rainDrops.translate(5));
	}

	@Test
	public void numberIs55() {
		assertEquals("Plang", rainDrops.translate(55));
	}

	/* Test factors of 3 and 5 */
	@Test
	public void numberIs255() {
		assertEquals("PlingPlang", rainDrops.translate(255));
	}

	/* Test factors of 7 */
	@Test
	public void numberIs7() {
		assertEquals("Plong", rainDrops.translate(7));
	}

	@Test
	public void numberIs77() {
		assertEquals("Plong", rainDrops.translate(77));
	}
}