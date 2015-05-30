package song;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class SongTest {

    /**
     * Test of getTitle method, of class Song.
     */
    @Test
    public final void testGetTitle() {
        System.out.println("getTitle");
        Song instance = new Song(1, "Heart Attack Lyrics", "Demi Lovato");
        String expResult = "Heart Attack Lyrics";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Song.
     */
    @Test
    public final void testGetRank() {
        System.out.println("getRank");
        Song instance = new Song(1, "Heart Attack Lyrics", "Demi Lovato");
        int expResult = 1;
        int result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of getArtist method, of class Song.
     */
    @Test
    public final void testGetArtist() {
        System.out.println("getArtist");
        Song instance = new Song(1, "Heart Attack Lyrics", "Demi Lovato");
        String expResult = "Demi Lovato";
        String result = instance.getArtist();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Song.
     */
    @Test
    public final void testCompareTo() {
        System.out.println("compareTo");
        Song s1 = new Song(1, "Heart Attack Lyrics", "Demi Lovato");
        Song s2 = new Song(2, "When I Was Your Man Lyrics", "Bruno Mars");
        // Why -15???
        assertEquals(-15, s1.compareTo(s2));
    }

}
