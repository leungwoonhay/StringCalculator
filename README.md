# String Calculator
## Description
The String Calculator calculates the sum of the integers provided in the string. 
- Allowed to handle an unknown number of numbers (in the string) and handle new lines between numbers (as well as commas). 
- To change the delimiter, the beginning of the string should be a separate line formatted like this: "//[delimiter]\n[numbers]”. 
- Calling Add with a negative number will throw an exception "Negatives not allowed: " and then listing all negative numbers that were in the list of numbers
- Numbers greater than 1000 should be ignored
- Delimiters can be any length
- Allow multiple delimiters

## Requirements
- This application works with Java 8 (earlier versions may not work correctly)

## Setup
1. Copy the repository HTML link
2. Git clone the repository to a local directory of your choice
3. Open the application in an IDE of your choice

## Example
1.1: "" returns 0
1.2: "1" returns 1
1.3: "1,2" returns 3
2.1: "1,2,3,4,5" returns 15
3.1: "1\n2,3" returns 6
4.1: "//;\n1;2" returns 3
5.1: "-1,2" throws "Negatives not allowed: -1"
5.2: "2,-4,3,-5" throws "Negatives not allowed: -4,-5"
6.1: "1001,2" returns 2
7.1: "//[|||]\n1|||2|||3" returns 6
8.1: "//[|][%]\n1|2%3" returns 6
9.1: "//[|||][%%%]\n1|||2%%%3" returns 6
