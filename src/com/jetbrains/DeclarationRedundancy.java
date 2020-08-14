package com.jetbrains;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeclarationRedundancy {

    void process(Font font, int size, Tree modules) throws IOException {
        final ArrayList<Node> list = modules.getChildren();
        list.removeIf(o -> o instanceof LetterNode letterNode &&
                            letterNode.isLatin() &&
                            !isLetterTrueFont(letterNode.getNodeValue(), font, size));
    }

    public void filterValues() {
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
        list.stream()
            .filter(x -> true)
            .forEach(System.out::println);
    }

    boolean isLetterTrueFont(char letter, Font font, int size) {
        boolean result;
        // TO DO: add code here
        result = true;
        return result;
    }

    public String getInstanceState() {
        filterValues();
        // random comment
        // num -> num % 5 == 0
        String version = "beta";
        return version;
    }
}
