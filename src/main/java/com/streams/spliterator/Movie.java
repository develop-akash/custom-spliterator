package com.streams.spliterator;

public class Movie {
    private String name;
    private String genre;
    private String director;
    private Double rating;

    public Movie() {
    }

    public Movie(String name, String genre, String director, Double rating) {
        this.name = name;
        this.genre = genre;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", rating=" + rating +
                '}';
    }
}
