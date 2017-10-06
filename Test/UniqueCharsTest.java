import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class UniqueCharsTest {

    UniqueChars unique;

    @Test
    public void uniqueCharacters() throws Exception {
        unique = new UniqueChars();
        assertEquals(Arrays.asList("n", "g", "r", "m").toString(), unique.uniqueCharacters("anagram").toString());
    }

    @Test
    public void onlyUnique() throws Exception {
        unique = new UniqueChars();
        assertEquals(Arrays.asList("h", "e", "a", "d", "s", "*", "o", "t").toString(), unique.uniqueCharacters("heads*ot").toString());
    }

    @Test
    public void notEquals() throws Exception {
        unique = new UniqueChars();
        assertNotEquals(Arrays.asList("n", "p", "r", "p").toString(), unique.uniqueCharacters("anagram").toString());
    }

}