package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        int array_length = value.length() + 1;
        ArrayList<String> tails = new ArrayList<>(array_length);

        for (int i = 0; i < array_length; i++) {
            tails.add(i, value.substring(i));
        }

        return tails;
    }

}
