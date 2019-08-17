package pl.coderslab.servletjee.servlet.post;

import java.util.Arrays;
import java.util.Collections;

public class Censor {
    private static String[] NOT_ALLOWED_WORDS = {
            "cholera", "kurde", "shit"
    };

    public static String censor(String toCensor) {
        for(String word : NOT_ALLOWED_WORDS){
            final String stars = String.join("", Collections.nCopies(word.length(), "*"));
            toCensor = toCensor.replaceAll(word, stars);
        }

        return toCensor;
    }
}
