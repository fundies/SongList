package song;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class SongList {

    private ArrayList<Song> songs = new ArrayList<Song>();

    /**
     * Construct Music Library from text file.
     *
     * @param fpath path to file
     * @throws java.io.FileNotFoundException
     */
    public SongList(final String fpath) throws FileNotFoundException {
        File file = new File(fpath);

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                Song song = new Song(sc.nextLine());
                songs.add(song);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
            throw e;
        }

    }

    /**
     * Sort Songs in descending alphabetical order.
     */
    public final void sort() {
        Collections.sort(songs);
    }

    /**
     * Print the list of songs.
     */
    public final void print() {
        for (int i = 0; i < songs.size(); ++i) {
            Song s = songs.get(i);
            System.out.println(s.getTitle() + " by " + s.getArtist()
                    + " ranked: #" + s.getRank());
        }
    }
}
