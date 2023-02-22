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
}


