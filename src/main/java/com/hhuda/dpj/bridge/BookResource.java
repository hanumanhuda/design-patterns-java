package com.hhuda.dpj.bridge;

public class BookResource implements Resource {
    private Book book;
    public BookResource(Book book){
        this.book = book;
    }
    @Override
    public String snippet() {
        return null;
    }

    @Override
    public String getTitle() {
        return book.getTitle();
    }

    @Override
    public String getImage() {
        return null;
    }

    @Override
    public String getUrl() {
        return book.getUrl();
    }
}
