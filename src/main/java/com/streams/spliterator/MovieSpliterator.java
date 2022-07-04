package com.streams.spliterator;

import java.util.Spliterator;
import java.util.function.Consumer;

public class MovieSpliterator implements Spliterator<Movie> {

    private String name;
    private String genre;
    private String director;
    private Double rating;
    private Spliterator<String> textSpliterator;

    public MovieSpliterator(Spliterator<String> textSpliterator) {
        this.textSpliterator = textSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Movie> action) {
        if (textSpliterator.tryAdvance(name -> this.name = name) &&
        textSpliterator.tryAdvance(genre -> this.genre = genre) &&
        textSpliterator.tryAdvance(director -> this.director = director) &&
        textSpliterator.tryAdvance(rating -> this.rating = Double.parseDouble(rating))) {
            action.accept(new Movie(name, genre, director, rating));
            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Movie> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return textSpliterator.estimateSize() / 4;
    }

    @Override
    public int characteristics() {
        return textSpliterator.characteristics();
    }
}
