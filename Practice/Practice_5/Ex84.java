/*
Counting Inversions in an Array
Introduction
In this article, we will discuss a Java code snippet that counts the number of inversions in an array. An inversion occurs when two elements in an array are out of order. For example, in the array [4, 2, 1, 3], there are three inversions: (4, 2), (4, 1), and (2, 1).

Key Concepts
Before we dive into the code, let's understand a few key concepts:
Inversions: An inversion occurs when two elements in an array are out of order. In other words, if i and j are two indices in an array, and i < j, then there is an inversion if array[i] > array[j].
Pairs: In the context of this code, a pair refers to two elements in the array that form an inversion.

Code Structure
The code provided is a Java class named UserMainCode. It contains a single static method named student that takes two parameters: an integer input1 and an array of integers input2. The method returns an integer representing the number of inversions in the array.
*/
import java.io.*;
import java.util.*;
public class Ex84{
    public static int student(int input1, int[] input2) {
        int pairs = 0;
        for (int i = 0; i < input1; i++) {
            for (int j = i + 1; j < input1; j++) {
                if (input2[i] > input2[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}