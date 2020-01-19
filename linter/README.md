# Lab 3 LInter<a name="lab3linter"></a>

[LINK TO CODE](https://github.com/daesy13/java-fundamentals/blob/master/linter/src/main/java/linter/App.java)</br>
[LINK TO TEST](https://github.com/daesy13/java-fundamentals/blob/master/linter/src/test/java/linter/AppTest.java)

## JavaScript Linter

On this app i wrote a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

This app reads through the file line by line. Create a string that contains a message such as "Line 3: Missing semicolon." if a line is missing a semicolon.

**Conditions**
- [x] Doesn’t show an error if the line is empty.
- [x] Doesn’t show an error if the line ends with an opening curly brace {
- [x] Doesn’t show an error if the line ends with an closing curly brace }
- [x] Doesn’t show an error if the line contains if or else
- [x] Call that method in your main method on the file gates.js, and print out the resulting error message.

**Testing**
- Test the linter on a file that contains no errors.
- Test the linter on a file that contains one error.
- Test the linter on a file that contains few errors.
- Test the linter on a file that contains many errors.
- Test the linter on an empty file.