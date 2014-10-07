package android.zarates.blogreader;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

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
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        JSONObject jsonObject = null;
        return null;
    }
}
