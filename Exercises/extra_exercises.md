## Exercise 1
### Palindrome
Write a function that checks if a String is a palindrome or not<br>
The function should receive 1 String parameter and return a boolean


## Exercise 2
### String reverse
Write a function that reverses a String<br>
The function should receive 1 String parameter and return a String
> **Example:**<br />
> "Hello" would become "olleH"

## Exercise 3
### Dash It
Write a function that adds dashes to a String<br>
The function should receive 1 String parameter and return a String
> **Example:**<br />
> "banana" would become "b-a-n-a-n-a"

## Exercise 4
### Triangles
Write a program that asks the user for a size `s` and then outputs a triangle with the height and width of `s`

> **Example:**<br />
> User inputs `4`<br />
> Output:
```
*
**
***
****
```
> **Bonus goal 1:**<br />
> Also ask the user for how many triangles to print.<br />
> User inputs size `3`<br />
> User inputs times`2`<br />
> Output:
```
*
**
***
*
**
***
```
> **Bonus goal 2:**<br />
> Write numbers instead of `*`.<br />
> Output:
```
1
22
333
4444
55555
```

## Exercise 5
### Xmas tree 🎄

Write a program that asks the user for a height `h` and then output a Xmas Tree with an height of `h`.
> **Example:**<br />
> User inputs `5`<br />
> Output:
```
    *
   ***
  *****
 *******
*********
    I
```
> **Hint:**<br />
> Don't forget the stem.

## Exercise 6
### Split
Write a program that asks the user for a sentence and outputs the words one per line. For example the sentence "Java is Awesome" gets printed as:
```
Java
is
Awesome
```
> **Hint:**<br />
> Research how to `split()` Strings.

## Exercise 7
### Frame it
Write a program that asks the user for a sentence and outputs the words one per line, in a rectangular frame. For example the sentence "Hello World in a frame" gets printed as:
```
*********
* Hello *
* World *
* in    *
* a     *
* frame *
*********
```

## Exercise 8
### Grid
List a table that multiplies all the numbers from 1 to 10.<br />
Format your output to something like this:
```
 1   2   3   4   5   6   7   8   9  10
 2   4   6   8  10  12  14  16  18  20
 3   6   9  12  15  18  21  24  27  30
 4   8  12  16  20  24  28  32  36  40
 5  10  15  20  25  30  35  40  45  50
 6  12  18  24  30  36  42  48  54  60
 7  14  21  28  35  42  49  56  63  70
 8  16  24  32  40  48  56  64  72  80
 9  18  27  36  45  54  63  72  81  90
10  20  30  40  50  60  70  80  90 100
```

## Exercise 9
## Hail Caeser 
Write a program that asks the user for a sentence and prints back the sentense using the Caeser Cipher
```
Plain:    ABCDEFGHIJKLMNOPQRSTUVWXYZ
Cipher:   XYZABCDEFGHIJKLMNOPQRSTUVW
```
> **Example:**<br />
> User text:  `THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG`<br>
> Converted:  `QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD`

## Exercise 10
### Perfect numbers
> For those who thought Prime was easy

Write a program that calculates which integers below 1000 are perfect numbers. A perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.

> **Hint:**<br>
> The first perfect number is 6. Its proper divisors are 1, 2 and 3 `1 + 2 + 3 = 6`.<br>
> The next perfect number is 28: `1 + 2 + 4 + 7 + 14 = 28`.<br>
> 8 is not a perfect number because it is evenly divisible by 1, 2 and 4 but `1 + 2 + 4 = 7`.
> **Bonus goal 1:**<br />
> Write all the Perfect numbers between 1 and 1000.<br />
> **Bonus goal 2:**<br />
> Write the first 5 perfect numbers.<br />


## Exercise 11
### Random
Write a function that generates an integer number given a certain range<br>
The function should receive 2 `int` parameters a `min` and a `max` and return the random number `int`
> **Example function declaration:**<br />
> `public static int myRandomNumber(int min, int max)`

## Exercise 12
### Guessing Game
Write a guessing game where the user has to guess a secret number between 1 and 100 generated randomly by the program.<br>
After every guess the program tells the user whether their number was too large or too small.<br>
After 6 tries the game is over and the user loses.
