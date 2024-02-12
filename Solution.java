import java.io.*;
import java.util.regex.*;

class Solution {
    private static final Pattern NUMBER_PATTERN = Pattern.compile("zero|one|two|three|four|five|six|seven|eight|nine");

    private static int parseNumber(String s) {
        int number = 0;
        Matcher m = NUMBER_PATTERN.matcher(s);
        while (m.find()) {
            String match = m.group();
            switch (match) {
                case "zero": number = number * 10 + 0; break;
                case "one": number = number * 10 + 1; break;
                case "two": number = number * 10 + 2; break;
                case "three": number = number * 10 + 3; break;
                case "four": number = number * 10 + 4; break;
                case "five": number = number * 10 + 5; break;
                case "six": number = number * 10 + 6; break;
                case "seven": number = number * 10 + 7; break;
                case "eight": number = number * 10 + 8; break;
                case "nine": number = number * 10 + 9; break;
            }
        }
        return number;
    }

    public static int calibration(String[] table) {
        int sum = 0;
        for (String s : table) {
            System.out.println(s);
            int number = parseNumber(s);
            sum += number;
            System.out.println("num: " + number);
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            long startTime = System.nanoTime();
            BufferedReader reader = new BufferedReader(new FileReader("calibration_doc.txt"));
            String[] table = reader.lines().toArray(String[]::new);
            reader.close();
            int suma = calibration(table);
            System.out.println("suma: " + suma);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1_000_000; 
            System.out.println("Tiempo de ejecución: " + duration + " ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
