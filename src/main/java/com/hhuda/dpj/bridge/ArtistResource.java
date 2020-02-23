package com.hhuda.dpj.bridge;

public class ArtistResource implements Resource {
    private Artist artist;
    public ArtistResource(Artist artist){
        this.artist = artist;
    }
    @Override
    public String snippet() {
        return null;
    }

    @Override
    public String getTitle() {
        return artist.getFname()+" "+artist.getLname();
    }

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public String getUrl() {
        return artist.getUrl();
    }
}
