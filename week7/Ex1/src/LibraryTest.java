import java.util.ArrayList;
import java.util.List;

// Base class for media (same as before)
abstract class Media {
    private String title;

    public Media(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Title: " + title;
    }
}

// Book class (same as before)
class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}

// Video class (same as before)
class Video extends Media {
    private int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duration: " + duration + " mins";
    }
}

// Newspaper class (same as before)
class Newspaper extends Media {
    private String date;

    public Newspaper(String title, String date) {
        super(title);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return super.toString() + ", Date: " + date;
    }
}

// Library class without Generics
class Library {
    private List<Media> mediaCollection;

    public Library() {
        mediaCollection = new ArrayList<>();
    }

    public void addMedia(Media media) {
        mediaCollection.add(media);
    }

    public void displayMedia() {
        for (Media media : mediaCollection) {
            System.out.println(media);
        }
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        Library library = new Library();

        library.addMedia(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addMedia(new Video("Inception", 148));
        library.addMedia(new Newspaper("The Times", "2024-12-05"));

        System.out.println("Media in Library:");
        library.displayMedia();
    }
}
