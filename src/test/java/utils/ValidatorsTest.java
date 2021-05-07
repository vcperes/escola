package utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidatorsTest {

	@Test
	public void testOnlyValidchars() {
		assertTrue(Validators.onlyValidchars("sagasgasfdsjsfafdsfhjdkfAGHSDF"));
	}
	
	@Test
	public void testOnlyValidcharsInvalido() {
		assertFalse(Validators.onlyValidchars("¨@%$@#%@$#"));
	}

}
