package song;

import java.util.Scanner;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class Song implements Comparable<Song> {

    private final String title;
    private final String artist;
    private final int rank;

    /**
     * Return Rank.
     * 
     * @return rank
     */
    public final int getRank() {
        return rank;
    }

    /**
     * Return Song Title.
     * 
     * @return song title
     */
    public final String getTitle() {
        return title;
    }

    /**
     * Return Artist.
     * 
     * @return artist
     */
    public final String getArtist() {
        return artist;
    }

    /**
     * Construct a song Parses the text file...
     * 
     * @param song string consisting of artist and title
     */
    public Song(final String song) {

        Scanner sc = new Scanner(song);

        sc.useDelimiter(" ");
        rank = Integer.parseInt(sc.next().replaceAll("\\.", ""));

        sc.useDelimiter("-");
        artist = sc.next().trim();
        title = sc.next().trim();

        sc.close();

    }

    /**
     * Constructor Homework Actually wanted...
     *
     * @param r rank
     * @param t title
     * @param a artist
     */
    public Song(final int r, final String t, final String a) {
        rank = r;
        title = t;
        artist = a;
    }

    /**
     * Override for comparisons.
     * 
     * @param t song
     * @return alphabetical
     */
    @Override
    public final int compareTo(final Song t) {
        return title.compareTo(t.title);
    }

}
