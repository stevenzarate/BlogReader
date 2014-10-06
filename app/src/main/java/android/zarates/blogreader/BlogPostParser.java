package android.zarates.blogreader;

import org.json.JSONObject;

import java.io.InputStream;

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
    public JSONObject phrase(InputStream inputStream){
        return null;
    }
}
