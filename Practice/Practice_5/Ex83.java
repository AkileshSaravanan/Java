/*
Calculating Arrangements in Java
Introduction
In this article, we will discuss how to calculate arrangements using Java. Arrangements refer to the different ways in which a set of elements can be ordered or arranged. We will provide a code example that demonstrates how to calculate arrangements recursively.

Key Concepts
Before we dive into the code example, let's understand some key concepts related to arrangements:
Arrangements: Arrangements are the different ways in which a set of elements can be ordered or arranged. For example, if we have three elements A, B, and C, the possible arrangements are ABC, ACB, BAC, BCA, CAB, and CBA.
Factorial: Factorial is a mathematical operation denoted by the exclamation mark (!). It represents the product of all positive integers less than or equal to a given number. For example, 5! = 5 * 4 * 3 * 2 * 1 = 120.
Recursive Approach: In the code example provided, we will use a recursive approach to calculate arrangements. Recursion is a programming technique where a function calls itself to solve a smaller subproblem. It is particularly useful when solving problems that can be divided into smaller, similar subproblems.

*/
import java.io.*;
import java.util.*;
public class Ex83 {
    public static int arrangements(int input1) {
        if (input1 == 1) {
            return 0;
        }
        if (input1 == 2) {
            return 1;
        }
        return (input1 - 1) * (arrangements(input1 - 1) + arrangements(input1 - 2));
    }
}