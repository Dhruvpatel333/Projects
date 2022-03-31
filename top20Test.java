import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class top20Test {

	@Test
	void test() throws IOException {
		HashFunction test = new HashFunction();
		int output = test.top20(1, 2);
		assertEquals(1, output);
	}
	
	@Test
	void test1() throws IOException {
		HashFunction test = new HashFunction();
		int output = test.top20(100, 700);
		assertEquals(20, output);
	}

}
