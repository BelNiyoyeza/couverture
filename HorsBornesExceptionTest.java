package java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Java.HorsBornesException;

/**
 * HorsBornesExceptionTest.
 * @author Niyoyeza Belise.
 */

class HorsBornesExceptionTest {

	@Test
	
	 public void testConstructeur()
    {
        final String ExpectedMessage = "Les positions x ou y sont hors bornes";
        final String ErrorMessage = "Les positions x ou y sont hors bornes";
        HorsBornesException ex = new HorsBornesException(ErrorMessage);
        assertEquals(ExpectedMessage,  ex.getMessage());
    }  
}
