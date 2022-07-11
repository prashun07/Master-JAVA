package collectionsAndGenerics.jukebox;
//Song object is implement of  comparable<object> to use sort like collection on it.
public class Song implements Comparable<Song> {
    private String title;
    String artist;
    String rating;
    String bpmi;

    public String getTitle() {
        return title;
    }

    public int compareTo(Song a) {
        return title.compareTo(a.getTitle());
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpmi() {
        return bpmi;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpmi='" + bpmi + '\'' +
                '}';
    }

    public Song(String title, String artist, String rating, String bpmi) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpmi = bpmi;
    }

    public void setBpmi(String bpmi) {
        this.bpmi = bpmi;
    }
}
