package java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Java.CaractereInterditException;

/**
 * CaractereInterditExceptionTest.
 * @author Niyoyeza Belise.
 */
class CaractereInterditExceptionTest {

	@Test
	public void testConstructeur()
    {
        final String ExpectedMessage = "value n'est pas un caractere autorise";
        final String ErrorMessage = "value n'est pas un caractere autorise";
        CaractereInterditException ex = new CaractereInterditException(ErrorMessage);
        assertEquals(ExpectedMessage,  ex.getMessage());
    }
}
