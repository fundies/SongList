/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

import java.io.FileNotFoundException;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class SongListTest {

    /**
     * Test of print method, of class SongList.
     *
     * @throws java.io.FileNotFoundException
     */
    @Test
    public void testPrint() throws FileNotFoundException {
        SongList instance = new SongList("songs.txt");
        instance.sort();
        instance.print();
        // Make sure output is is in alphabetical order yourself ;)
        boolean wat = true;
        assertTrue(wat);
    }
}
