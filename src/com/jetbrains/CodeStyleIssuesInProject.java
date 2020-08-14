package com.jetbrains;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CodeStyleIssuesInProject {

    public String[] process(String[] value) {
        return value;
    }

    public List<Integer> getList(List<Integer> list) {
        if (list.isEmpty()) {
            list =  List.of(1, 2, 3, 3, 4);
        }
        return list;
    }

    String getFormattedDate(Date date) {
        String format = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(format);

        int value = getReslt(23);

        return formatter.format(date);
    }

    int getReslt(int valueIn) {
        int result = valueIn * 2;
        return result;
    }
}
