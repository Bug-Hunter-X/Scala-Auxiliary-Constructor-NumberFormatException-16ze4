# Scala Auxiliary Constructor NumberFormatException

This repository demonstrates a common error in Scala related to auxiliary constructors and input validation.  Specifically, it showcases how attempting to convert a String to an Int within an auxiliary constructor can lead to a `NumberFormatException` if the String does not represent a valid integer.

The `bug.scala` file contains the problematic code. The `bugSolution.scala` file offers a corrected version with improved error handling.

## Problem
The issue arises when an auxiliary constructor attempts to parse a String into an integer without proper error handling. If the String is invalid, a `NumberFormatException` is thrown, causing the program to crash.

## Solution
The solution involves adding error handling, such as using a `try-catch` block, to gracefully handle invalid input strings.  This prevents program termination and allows for more robust error management.