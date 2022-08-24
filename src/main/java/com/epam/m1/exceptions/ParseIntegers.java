package com.epam.m1.exceptions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        int number = 0;


        while (words.hasNext()) {
            String next = words.next();


            try {
                number = Integer.parseInt(next);
                sum += number;



            } catch (NumberFormatException nm) {
                justWords = justWords.concat(" ");

            } finally {

                justWords = justWords.concat(next);
            }


            // todo: complete it
        }
        char[] charArray = justWords.toCharArray();
        String result = "";

        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) {

            // Check if the specified character is not digit
            // then add this character into result variable
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }

        }

        System.out.println("Sum is " + sum);
        System.out.println("Just words:" + result);
    }

}
