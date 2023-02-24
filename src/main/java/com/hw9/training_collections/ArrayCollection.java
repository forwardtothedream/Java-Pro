package com.hw9.training_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCollection {
    public int countOccurance(List<String> array, String str) {
        int count = 0;
        for (String word : array) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }

    public List<Integer> toList(int[] array) {
        List<Integer> masList = new ArrayList();
        for (int i : array) {
            masList.add(i);
        }
        return masList;
    }

    public List<Integer> findUnique(List<Integer> listOne) {
        List<Integer> listToo = new ArrayList<>();
        for (Integer i : listOne
        ) {
            if (!listToo.contains(i)) {
                listToo.add(i);
            }

        }
        return listToo;
    }

    public Map<String, Integer> calcOccurance(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }
        return wordCounts;
    }
    public List<Map<String, Object>> findOccurance(List<String> list) {
        List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String key : map.keySet()) {
            Map<String, Object> occurrenceMap = new HashMap<String, Object>();
            occurrenceMap.put("name", key);
            occurrenceMap.put("occurrence", map.get(key));
            result.add(occurrenceMap);
        }
        return result;
    }
}


