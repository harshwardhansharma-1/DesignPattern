package design_patterns_singleton;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class TestCache {

	@Test
	public void test() {
		Cache cache = Cache.getInstance();
		assertEquals(Cache.getInstance(), cache);
	}
}
