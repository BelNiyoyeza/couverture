package java;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import Java.ValeurImpossibleException;


/**
 * CaractereInterditExceptionTest.
 * @author Niyoyeza Belise.
 */


class ValeurImpossibleExceptionTest {

	@Test
	 public void testConstructeur()
    {
        final String ExpectedMessage = "Valeur interdite!";
        final String ErrorMessage = "Valeur interdite!";
        ValeurImpossibleException ex = new ValeurImpossibleException(ErrorMessage);
        assertEquals(ExpectedMessage,  ex.getMessage());
    }

}
