package com.hhuda.dpj.proxy;

public class LazyBookParserProxy implements IBookParser {
    IBookParser bookParser=null;
    String book=null;
    public LazyBookParserProxy(String book){
        this.book =book;
    }
    public int getNumberOfPages() throws InterruptedException {
        if (bookParser == null){
            bookParser = new BookParser(book);
        }
        return bookParser.getNumberOfPages();
    }
}
