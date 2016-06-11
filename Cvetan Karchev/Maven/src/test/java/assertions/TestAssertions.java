package assertions;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestAssertions {

    @Test
    public void testAssertions() throws AssertionError {

        /* test data */
        String str1 = new String ("abc");
        String str2 = new String ("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;
        assert 2>0 : 2;
        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray =  {"one", "two", "three"};

        assert val2 == 3;

        if ( true )
        {
            throw new AssertionError("test");// no message

        }



        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue ("wrong ",val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4,str5);

        //Check if two object references not point to the same object
        assertNotSame(str1,str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
        fail("opa");
    }

}
