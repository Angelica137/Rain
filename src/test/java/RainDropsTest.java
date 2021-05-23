import org.junit.Test;
import static org.junit.Assert.asserEquals;

public class RainDropsTest {
	@Test
	public void testThatGradleIsGreeted() {
		asserEquals("Hello, world!", new RainDrops().sayHello());
	}
}