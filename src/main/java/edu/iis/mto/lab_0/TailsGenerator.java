package edu.iis.mto.lab_0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TailsGenerator {

    public List<String> tails(String value) {
        return IntStream.range(0, value.length() + 1)
                .mapToObj(value::substring)
                .collect(Collectors.toList());
    }

}
