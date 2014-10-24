package android.zarates.blogreader;

public class BlogPost {
    public final String title;
    public final String url;
    public final String date;
    public final String author;
    public final String thumbnail;

    public BlogPost(String title, String url, String date, String author, String thumbnail) {
        this.title = title;
        this.url = url;
        this.date = date;
        this.author = author;
        this.thumbnail = thumbnail;
    }

}
