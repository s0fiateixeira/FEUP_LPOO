import java.util.ArrayList;
import java.util.List;

public class Band extends Act{

    private final List<Artist> artists = new ArrayList<>();

    Band(String name, String country) {
        super(name, country);
    }

    void addArtist(Artist artist){
        this.artists.add(artist);
    }

    public List<Artist> getArtists() {
        return artists;
    }

    boolean containsArtist(Artist artist){
        for(Artist inBand: artists){
            if(inBand.equals(artist)) return true;
        }
        return false;
    }

}
