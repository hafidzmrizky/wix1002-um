# WIX1002 Fundamentals of Programming
Hafidz Muhammad Rizky (24084524) - Artificial Intelligence 
### Tutorial 1: Problem Solving in Programming
#### Part I
1. Request two numbers from the user and print the multiplication of the numbers.
	##### Input-Process-Output Model:
	| Input       | Process     | Output      |
	|----------------|----------------|----------------|
	| firstNumber (user input)<br><br>secondNumber (user input)    | Multiply firstNumber * secondNumber and then SET it into a result variable      | Display result from the variable     |

	#### Pseudocode
	| Number       | Process     |
	|----------------|----------------|
	| 1    | START   |
	| 2    | DECLARE VARIABLE firstNumber, secondNumber, result AS INT  |
	| 3    | PRINT(“First Number : “);<br>firstNumber = INPUT  |
	| 4    | PRINT(“Second Number : “);<br>secondNumber = INPUT  |
	| 5    | result = firstNumber * secondNumber;<br>PRINT(“Multiplication: “ + firstNumber + “ * “ + secondNumber + “ is “ + result);  |
	| 6    | END  |

	#### Flowchart
	![Number 1 Flowchart](storage/t1-n1-hmr.png)
	
2. Determine whether a random number is greater than 50!
	##### Input-Process-Output Model:
	| Input       | Process     | Output      |
	|----------------|----------------|----------------|
    | randomNumber (generated using Random util library) | Fill the variable of randomNumber with random number <br><br>then, check if randomNumber > 50 | Display “Random Number of “ + number + “ is Greater than 50” or “Random Number of “ + number + “ is Not Greater than 50”

    ##### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE int randomNumber;<br><br>INSTANTIATING Random Object (new Random())  |
    | 3    | randomNumber = Random.nextInt(100);  |
    | 4    | IF randomNumber > 50 THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Random Number of “ + randomNumber + “ is Greater than 50”)<br>ELSE<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Random Number of “ + randomNumber + “ is Not Greater than 50”)<br>ENDIF  |
    | 5    | END  |

    #### Flowchart
    ![Number 2 Flowchart](storage/t1-n2-hmr.png)

3. Print the pass/fail grade based on the mark entered by user. The passing mark is at least 40.
    #### Input-Process-Output Model:
    | Input       | Process     | Output      |
    |----------------|----------------|----------------|
    | Mark (user input) | Check Mark if >= 40 = pass; else fail | Display “Pass” or “Fail” | 

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE mark as INT |
    | 3    | mark = INPUT | 
    | 4    | IF mark >= 40 THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Pass”)<br>ELSE<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Fail”)<br>ENDIF  |
    | 5    | END  |

    #### Flowchart
    ![Number 3 Flowchart](storage/t1-n3-hmr.png)

4. Print the results of the two players’ dice game.
    #### Input-Process-Output Model:
    | Input       | Process     | Output      |
    |----------------|----------------|----------------|
    | secondPlayerDice (result from random) | Compare firstPlayerDice and secondPlayerDice to determine the end result. | Display “First Player Wins” if firstPlayerDice is greater than secondPlayerDice. <br><br>Display “Second Player Wins” if secondPlayerDice is greater than firstPlayerDice. <br><br>Else, display “Tie”|

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE firstPlayerDice, secondPlayerDice AS INT
    | 3    | GENERATE random number from 1 to 6: <br><br>firstPlayerDice = (int) Math.floor(Math.random() * 6) + 1;<br><br>secondPlayerDice = (int) Math.floor(Math.random() * 6) + 1;  |
    | 4    | IF firstPlayerDice > secondPlayerDice THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“First Player Wins”);<br>ELSE IF secondPlayerDice > firstPlayerDice THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Second Player Wins”);<br>ELSE<br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Tie”);<br>ENDIF  |
    | 5    | END  |

    #### Flowchart
    ![Number 4 Flowchart](storage/t1-n4-hmr.png)

5. Print the perimeter of a rectangle
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | width (user input)<br><br>length (user input) | Calculate the perimeter using the formula of: 2 * (length + width). | Display the result of the rectangle perimeter. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE length, width, result AS DOUBLE |
    | 3    | PRINT(“Length : “);<br>length = INPUT  |
    | 4    | PRINT(“Width : “);<br>width = INPUT  |
    | 5    | result = 2 * (length + width); |
    | 6    | PRINT(“The Perimeter of Rectangle is “ + result);  |
    | 7    | END  |

    #### Flowchart
    ![Number 5 Flowchart](storage/t1-n5-hmr.png)

6. Print the minimum number from 10 random numbers generated by computer.
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | An array of 10 random numbers (generated) | Loop from the array of random numbers, if the number is smaller than before, set smallestNumber variable | Display the smallest / minimum number from the 10 randomly generated numbers. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE int[] numbers = new int[10];<br>DECLARE int smallestNumber = 0;<br>DECLARE randomGenerator AS new Random();|
    | 3    | LOOP FOR i = 0; i < numbers.length; i++<br>&nbsp;&nbsp;&nbsp;&nbsp;numbers[i] = randomGenerator.nextInt(100);<br>ENDFOR  |
    | 4    | smallestNumber = numbers[0];<br>LOOP FOR c = 0; c < numbers.length; c++<br>&nbsp;&nbsp;&nbsp;&nbsp;IF numbers[c] < smallestNumber THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;smallestNumber = numbers[c];<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>ENDFOR  |
    | 5    | PRINTLN(“Smallest Number : “ + smallestNumber);<br>PRINTLN(“From Array of: “ + numbers TO STRING);  |
    | 6    | END |

    #### Flowchart
    ![Number 6 Flowchart](storage/t1-n6-hmr.png)

7. Print the number of odd and even number from 10 random numbers generated by computer. The random number must be from 10 – 100
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | An array of 10 random numbers (generated from 10-100) | Loop through the array, find the modulus, if % 2 is 1, then it’s odd, else even | Display the total odd and even numbers from the 10 randomly generated numbers. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE int[] numbers = new int[10];<br>DECLARE randomGenerator AS Random;<br>DECLARE oddCount = 0, evenCount = 0; |
    | 3    | LOOP FOR int b = 0; b < numbers.length; b++<br>&nbsp;&nbsp;&nbsp;&nbsp;numbers[b] = numbers[b] = randomGenerator.nextInt(91) + 10;<br>ENDFOR  |
    | 4    | LOOP FOR int a = 0; a < numbers.length; a++;<br>&nbsp;&nbsp;&nbsp;&nbsp;IF numbers[a] % 2 == 1 THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oddCount++;<br>&nbsp;&nbsp;&nbsp;&nbsp;ELSE<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;evenCount++;<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>ENDFOR  |
    | 5    | PRINT(“Odd Count: “ + oddCount);<br>PRINT(“Even Count: “ + evenCount); | 
    | 6    | END | 

    #### Flowchart
    ![Number 7 Flowchart](storage/t1-n7-hmr.png)

#### Part II
8. Count the number of alphabet U and M from a sentence entered by user.
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | sentence (user input) | Loop the character in the sentence and if it matches either ‘u’ or ‘m’, it increments the value of its respective variable. | Display the alphabetUCount and/or alphabetMCount in a sentence given. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2     | DECLARE sentence = INPUT;<br>DECLARE alphabetUCount = 0, alphabetMCount = 0; |
    | 3    | LOOP FOR int a = 0; a < sentence.length(); a++;<br>&nbsp;&nbsp;&nbsp;&nbsp;IF sentence.toLowerCase().charAt(a) == ‘u’ THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;alphabetUCount++;<br>&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF sentence.toLowerCase().charAt(a) == ‘m’ THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;alphabetMCount++;<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>ENDFOR  |
    | 4    | PRINT(“Count of ‘U’: “ + alphabetUCount);<br>PRINT(“Count of ‘M’: “ + alphabetMCount);  |
    | 5    | END  |

    #### Flowchart
    ![Number 8 Flowchart](storage/t1-n8-hmr.png)

9. Display the frequency of a keyword from a web page.
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | webPageContent (user input, the content of the web page)<br><br>keyword (user input, the keyword we’re looking for) | Split the web page content by their spaces or hyphen, creating collections of arrays, and store it. (Because every word in a sentence is ended with a space of hyphen) <br><br> Normalize the content and keyword into lowercase format, then compare with the keyword, if it matches increment count by 1. | Display the frequency count of a keyword, alongside the keyword itself to increase clarity. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE String contentArray[]<br>DECLARE webPageContent = INPUT;<br>DECLARE keyword = INPUT;<br>DECLARE frequency = 0; |
    | 3    | contentArray = SPLIT webPageContent WITH REGEX of ’[\\s-]+’;<br>keyword = keyword.toLowerCase();<br>FOR int i = 0; i < contentArray.length; i++<br>&nbsp;&nbsp;&nbsp;&nbsp;IF contentArray[i].toLowerCase() EQUALS TO keyword THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;frequency++;<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>ENDFOR  |
    | 4    | PRINT(“Frequency of keyword:  ‘“ + keyword + “ is : “ + frequency);  |
    | 5    | END  |

    #### Flowchart
    ![Number 9 Flowchart](storage/t1-n9-hmr.png)

10. Display the number of female students from a random list of 100 students.
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | studentData (user input, with gender in it) | Filter the list to only include female students, then calculate the length of the list. | Display the number/count of female students. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE studentData = INPUT;<br>DECLARE tempStudentData = ArrayList;|
    | 3    | Filter studentData by gender, convert back to array, and store in tempStudentData:<br>tempStudentData = STREAM ARRAY OF studentData and FILTER s -> s.gender EQUALS TO female AND CONVERT TO ARRAY |
    | 4    | PRINT (“Number of female students: “ LENGTH OF tempStudentData);  |
    | 5    | END  |

    #### Flowchart
    ![Number 10 Flowchart](storage/t1-n10-hmr.png)

11. Display a list of 5 random numbers in descending order. (Sort)
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | randomNumbers (an array of five random numbers) | Sort the number into a descending order. (Using Selection Sort, since it’s 5 numbers only) | Display the sorted number in a descending order. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE int[] randomNumbers = new int[5];<br>DECLARE / Instantiating randomGenerator AS Random; |
    | 3    | LOOP FOR int a = 0; a < randomNumbers.length; a++<br>&nbsp;&nbsp;&nbsp;&nbsp;randomNumbers[a] = randomGenerator.nextInt(100) + 1;<br>ENDFOR  |
    | 4    | LOOP FOR int i = 0; i < randomNumbers.length; i++<br>&nbsp;&nbsp;&nbsp;&nbsp;FOR int x = i + 1; x < randomNumbers.length; x++<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;IF randomNumbers[x] > randomNumbers[i] THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int iValue = randomNumbers[i];<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;randomNumbers[i] = randomNumbers[x];<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;randomNumbers[x] = iValue;<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDFOR<br>ENDFOR  |
    | 5    | PRINT(“Random Numbers (Sorted): “ + ARRAY TO STRING of randomNumbers);  |
    | 6    | END  |

    #### Flowchart
    ![Number 11 Flowchart](storage/t1-n11-hmr.png)

12. Guess a random number generated by computer.
    #### Input-Process-Output Model:
    | Input      | Process     | Output      |
    |----------------|----------------|----------------|
    | userGuess (user input)<br><br>randomNumber (generated) | Compare guess with the generated randomNumber to check if it’s the same value, or higher, or smaller. | Display “Congratulations, you’re right” if guess is equal to randomNumber. <br><br>Display “Guess is too low” if guess is less than the randomNumber.<br><br>Display “Guess is too high” if guess is greater than the randomNumber. |

    #### Pseudocode
    | Number       | Process     |
    |----------------|----------------|
    | 1    | START   |
    | 2    | DECLARE randomGenerator AS Random (new Random());<br>DECLARE int randomNumber = randomGenerator.nextInt(100) + 1;<br>DECLARE int guess = 0; |
    | 3    | DO: <br>&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Your Guess: ”);<br>&nbsp;&nbsp;&nbsp;&nbsp;guess = INPUT;<br>&nbsp;&nbsp;&nbsp;&nbsp;IF (guess == randomNumber) THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Congratulations, you’re right”);<br>&nbsp;&nbsp;&nbsp;&nbsp;ELSE IF (guess > randomNumber) THEN<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Guess is too high”);<br>&nbsp;&nbsp;&nbsp;&nbsp;ELSE<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PRINT(“Guess is too low”);<br>&nbsp;&nbsp;&nbsp;&nbsp;ENDIF<br>WHILE (guess != randomNumber)  |
    | 4    | END  |

    #### Flowchart
    ![Number 12 Flowchart](storage/t1-n12-hmr.png)
