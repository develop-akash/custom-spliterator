package com.streams.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamsDemo {

    public static void main(String[] args) {
        Path path = Paths.get("G://Intellij Workspace/CustomStreams/src/main/resources/movie.log");
        try(Stream<String> lines = Files.lines(path)){
            // lines.forEach(System.out::println);
            Spliterator<String> base = lines.spliterator();
            MovieSpliterator movieSpliterator = new MovieSpliterator(base);
            StreamSupport.stream(movieSpliterator, false).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
