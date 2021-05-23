import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RainDropsTest {

	private RainDrops rainDrops;

	@Before
	public void setup() {
		rainDrops = new RainDrops();
	}

	@Test
	public void testThattranslateReturnsPlingWhenFactorOfThree() {
		assertEquals("Pling", rainDrops.translate(9));
	}

	@Test
	public void numerIsOne() {
		assertEquals("1", rainDrops.translate(1));
	}
}