package com.hhuda.dpj.prototype;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class HistoricalBook implements Book {
    private String name;
    private int year;

    public HistoricalBook(HistoricalBook historicalBook) {
        this.name = historicalBook.name;
        this.year = historicalBook.year;
    }

    @Override
    public Book clone() {
        return new HistoricalBook(this);
    }
}
