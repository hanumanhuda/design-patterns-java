package com.hhuda.dpj.bridge;

public class Driver {
    public static void main(String[] args) {
        Artist artist = Artist.builder()
                .fname("hanuman")
                .lname("huda")
                .url("huda.com")
                .build();
        ArtistResource artistResource = new ArtistResource(artist);
        LongFormatView longFormatView = new LongFormatView(artistResource);
        System.out.println(longFormatView.show());
    }
}
