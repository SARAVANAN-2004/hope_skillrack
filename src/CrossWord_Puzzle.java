
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class CrossWord_Puzzle {


    public static List<String> crosswordPuzzle(List<String> crossword, String words) {
        // Write your code here
        char[][] arr = new char[11][11];
        fill(arr, crossword);
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        List<String> res = new ArrayList<>();
        return res;

    }

    public static void fill(char[][] arr, List<String> crossword) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = crossword.get(i).charAt(j);
            }
        }
    }
        public static void main(String[] args){
            // Input string
            String input = "++++++-+++\n" +
                    "++------++\n" +
                    "++++++-+++\n" +
                    "++++++-+++\n" +
                    "+++------\n" +
                    "++++++-+-+\n" +
                    "++++++-+-+\n" +
                    "++++++++-+\n" +
                    "++++++++-+\n" +
                    "++++++++-+\n" +
                    "ICELAND;MEXICO;PANAMA;ALMATY";

            String[] lines = input.split("\n");

            List<String> crossword = new ArrayList<>();

            for (int i = 0; i < lines.length - 1; i++) {
                crossword.add(lines[i]);
            }

            String words = lines[lines.length - 1];
            System.out.println(crossword);
            System.out.println(crosswordPuzzle(crossword,words));

//            System.out.println("Crossword Grid:");
//            for (String line : crossword) {
//                System.out.println(line);
//            }
//
//            System.out.println("\nWords:");
//            System.out.println(words);
        }
    }

