/**
 *  Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating a list og integers
        List<Integer> list = new ArrayList<>();

        // Adding 27 numbers to the list
        for (int index = 0; index < 27; index++) {

            list.add(new Random().nextInt());

        }

        // Checking if numbers are dividable by 3.
        for (int index = 0; index < 27; index++) {

            int helping_number = list.get(index);

            // Condition
            if (helping_number % 3 == 0) {

                // Printing the result to console
                System.out.println(helping_number + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(helping_number + " is not dividable by 3.");

            }

        }
    }
}