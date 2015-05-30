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
     * get Rank
     *
     * @return rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * Return Song Title
     *
     * @return song title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Return Artist
     *
     * @return artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Construct a song
     * Parses the text file...
     * @param song string consisting of artist and title
     */
    public Song(String song) {

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
     * @param rank rank
     * @param title title
     * @param artist artist
     */
    public Song(int rank, String title, String artist) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
    }

    /**
     * Override for comparisons
     *
     * @param t song
     * @return alphabetical
     */
    @Override
    public int compareTo(Song t) {
        return this.title.compareTo(t.title);
    }

}
