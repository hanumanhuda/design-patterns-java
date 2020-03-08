package com.hhuda.dpj.prototype;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class KidsBook implements Book{
    private String name;
    private String author;
    private String diagram;

    public KidsBook(KidsBook kidsBook) {
        this.author = kidsBook.author;
        this.name =kidsBook.name;
        this.diagram = kidsBook.diagram;
    }


    @Override
    public Book clone() {
        return new KidsBook(this);
    }
}
