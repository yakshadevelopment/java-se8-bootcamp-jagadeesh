
package test.handson;

import java.text.ParseException;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import handson.SymmetricDifference;

public class TestSymmetricDiff {

	@Test
	public void testSymmetric_Success() throws ParseException {

		int[] a = { 12, 24, 7, 36, 14 };

		int[] b = { 11, 26, 7, 14 };

		int[] c = { 11, 12, 24, 26, 36 };

		Assertions.assertArrayEquals(c, SymmetricDifference.getSymmetricDifference(a, b));

		int[] a1 = { 11, 5, 14, 26, 3 };

		int[] b1 = { 5, 3, 1 };

		int[] c1 = { 1, 11, 14, 26 };

		Assertions.assertArrayEquals(c1, SymmetricDifference.getSymmetricDifference(a1, b1));

	}

}
