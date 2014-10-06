package android.zarates.blogreader;
public class BlogPostParser {
    private static BlogPostParser parser;

    private BlogPostParser(){

    }

    private BlogPostParser get(){
        if (parser == null){
            parser = new BlogPostParser();
        }
        return parser;
    }
}
