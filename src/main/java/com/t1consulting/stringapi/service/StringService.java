package com.t1consulting.stringapi.service;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class StringService {

    public String getCountedSymbols (String string) {
        if(string == null) {
            return "You sent a null value";
        } else if(string.isEmpty()) {
            return "You sent an empty string";
        } else {
            return toString(sortSymbols(countSymbols(string)));
        }
    }

    private Map<String, Long> countSymbols(String string) {
        return string.codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private Map<String, Long> sortSymbols(Map<String, Long> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    private String toString (Map<String, Long> map) {
        StringBuilder sb = new StringBuilder();
        map.forEach((key, value) ->
                sb.append('"').append(key).append('"').append(": ").append(value).append(", "));
        return sb.substring(0, sb.toString().length() - 2);
    }
}
