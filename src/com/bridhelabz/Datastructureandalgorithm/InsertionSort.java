package com.bridhelabz.Datastructureandalgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		String[] wordList = { "dog", "cat", "cow", "goat", "tiger", "lion" };
		System.out.println("Before Insertion Sort");
		for (int i = 0; i < wordList.length; i++) {
			System.out.print(wordList[i] + " ");
		}
		System.out.println();
		System.out.println("After Insertion Sort");
		String sortedArray[] = insertionSort.sort(wordList);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	public String[] sort(String array[]) {
		String temp = " ";
		int arrayLength = array.length;
		for (int i = 0; i < arrayLength; i++) {
			for (int j = i + 1; j < arrayLength; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}
