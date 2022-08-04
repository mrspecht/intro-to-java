/*
 * Introduction to Java programming
 * Assignment 2
 * Project 3
 * Andre Specht
 */

import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.util.stream.*;

public class Anagrams {
  private static final Path WORDS = Paths.get("words.txt");
  private String anagram, keyWord;

  public String getKey(String s) {
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }

  public void getAnagrams(Path path, String word) {
    String key = getKey(word);
    List<String> list = new ArrayList<>();

    try (BufferedReader br = Files.newBufferedReader(path)) {
      while ((anagram = br.readLine()) != null) {
        keyWord = getKey(anagram);
        if (key.equals(keyWord))
          list.add(anagram);
        }

      if (!list.contains(word))
        System.out.println("Invalid word");
      else if (list.size() <= 1)
        System.out.println("Anagrams not found");
      else
        System.out.println("Anagrams: " + list
          .stream()
          .filter(s -> !s.equals(word))
          .sorted()
          .collect(Collectors.joining(", ")));
    } catch (IOException e) {
      System.out.println("File not found");
    }
  }

  public static void main(String[] args) {
    System.out.print("Enter a word: ");
    Scanner input = new Scanner(System.in);
    String word = input.nextLine();
    new Anagrams().getAnagrams(WORDS, word);
    input.close();
  }
}
