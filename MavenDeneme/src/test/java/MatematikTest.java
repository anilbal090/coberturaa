import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MatematikTest {
	@Test
	public void testToplaHepsi() {
		for (int i = 10000; i <10001; i++) {
			for (int j = 10000; j < 10001; j++) {
				int gercekSonuc=Matematik.topla(i, j);
				assertEquals(i + j, gercekSonuc);
			}
		}
	}

}
