
# **Internship Projects Collection**

This repository contains all the projects I completed during my internship. Each task includes the source code, logic explanation, and sample outputs to clearly demonstrate how the program works.

---

## **📝 Task 1: Number Guessing Game**

A Java console game where the computer selects a hidden number, and the user must guess it within limited attempts. The game provides helpful hints like **“Too High”, “Too Low”, “Slightly High”,** or **“Slightly Low”** based on how close the guess is. Scores are awarded depending on how quickly the number is found, and the user can play multiple rounds.

### **Key Features**

* Random number generated between **1–100**
* **5 attempts** per round
* Intelligent hints for close guesses
* Cumulative score system
* Replay support
* Clean and interactive console UI

### **Technologies Used**

* Java
* `Scanner` for input
* `Math.random()` for generating numbers

### **Example Output**
Welcome to the Number Guessing Game
The computer has generated a random number
You have 5 attempts to guess it
Enter your guess:
5
Too Low! Try again
Enter your guess:
5
Too Low! Try again
Enter your guess:
10
Too Low! Try again
Enter your guess:
8
Too Low! Try again
Enter your guess:
99
A Bit High! Try again
Haha! u are out of attempts.
The number was 85
Hey i gotttu
Your score is: 0
Wanna play again ?
(yes/no)
nc
I know u liked it.
Thanks for playing!
Your score is : 0


📌 **File:** `NumberGame.java`

---

## **📝 Task 2: Student Grade Calculator**

### **Overview**

A Java program that calculates a student’s total marks, percentage, and grade based on the marks entered for each subject.

### **Highlights**

* Inputs number of subjects
* Accepts marks out of 100
* Calculates total and average
* Assigns grade based on percentage
* Clear and simple output

### **Grade Chart**

| Percentage | Grade | 90–100 - O 80–89 - A 70–79 - B 60–69 - C  50–59 - D 40–49 - E Below 40 - F

📌 **File:** `Sgc.java`

---

## **📝 Task 3: ATM Interface**

### **Overview**

A basic simulation of an ATM system using Java. It allows the user to perform essential banking operations through a console menu.

### **Core Functionalities**

* **Check Balance:** Displays current balance
* **Deposit:** Adds valid amount
* **Withdraw:** Deducts amount if balance is sufficient
* **Exit:** Ends session safely
* **Input Validation:** Rejects invalid values

### **Concepts Implemented**

* Classes & methods
* Loops (`while`, `switch`)
* Conditional statements
* Static variables
* Input handling using `Scanner`

### **Sample Run**

Atm Menu:
1. Check balance
2. Deposit
3. Withdraw
4. Exit
choose an option from 1-4: 2
Enter rupees to dep: Rs 8000000000
Deposit successful.
Your new balance is: Rs 8.000005E9

📌 **File:** `Atm.java`

---

## **▶️ How to Execute the Programs**

### **1. Clone the repository**

```
https://github.com/venkattejaodela/codesoft1
```

### **2. Navigate to the project directory**

```
cd codSoft1
```

### **3. Compile and run the Java files**

Example for Task 1:

```
javac NumberGame.java
java NumberGame
```

---

## **👤 Author**

**Venkat Teja Odela**
