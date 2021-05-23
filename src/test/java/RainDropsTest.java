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
	public void testThatGradleIsGreeted() {

		assertEquals("9", rainDrops.translate(9));
	}
}