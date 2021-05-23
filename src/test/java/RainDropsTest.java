import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RainDropsTest {
	@Test
	public void testThatGradleIsGreeted() {

		assertEquals("Hello, world!", new RainDrops().translate(9));
	}
}