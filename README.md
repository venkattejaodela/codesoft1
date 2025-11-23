
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

```
Welcome to the Number Guessing Game!
I have picked a number between 1 and 100.
You get 5 chances to find it.

Enter your guess: 45
Slightly Low! Try again.

Enter your guess: 68
Too High! Try again.

Enter your guess: 59
🎉 Correct! You got it in 3 attempts!
Your total score: 30

Would you like to play another round? (yes/no)
```

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

| Percentage | Grade |
| ---------- | ----- |
| 90–100     | O     |
| 80–89      | A     |
| 70–79      | B     |
| 60–69      | C     |
| 50–59      | D     |
| 40–49      | E     |
| Below 40   | F     |

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

```
ATM Menu:
1. Check Balance
2. Deposit
3. Withdraw
4. Exit

Choose an option: 1
Your current balance is: ₹1000.0

Choose an option: 2
Enter deposit amount: ₹500
Deposit successful! New balance: ₹1500.0

Choose an option: 3
Enter withdrawal amount: ₹200
Withdrawal successful! New balance: ₹1300.0
```

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
