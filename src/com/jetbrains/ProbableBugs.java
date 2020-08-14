package com.jetbrains;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProbableBugs {
    private final Map<Integer, List<String>> integerStringMap = new HashMap<>();
    {
        integerStringMap.put(12, List.of("Sun", "Mon", "Tue"));
    }

    String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd");
        return formatter.format(date);
    }

    List<Object> createList() {
        List<Object> list = new ArrayList<>();
        list.add("Hello");
        return list;
    }

    public static boolean binaryStrings(String b) {
        Stack<Character> s = new Stack<>();
        for (char c : b.toCharArray())
            if (s.empty() || !s.peek().equals(c)) s.push(c); else s.pop();
        return s.empty();
    }

    public static boolean beautifulBinaryStrings(String s) {
        while (s != (s = s.replaceAll("AA|BB", "")));
        return s.isEmpty();
    }
}
