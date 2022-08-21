package com.bridhelabz.Datastructureandalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	public static void main(String[] args) {
        BinarySearch binary = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        String[] wordList = {"cat", "cow", "dog", "goat", "tiger", "lion"};
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchWord = sc.nextLine();
        sc.close();
        int result = binary.binarySearch(wordList, searchWord);

        if (result == -1)
            System.out.println("word is not present in the list");
        else
            System.out.println("word is found at "
                    + "index " + result);
    }

    public int binarySearch(String[] wordList, String searchName) {
        int start = 0, length = wordList.length - 1;
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);
            if (result == 0)
                return middle;
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }
}


