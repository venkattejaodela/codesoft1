Internship Projects Collection
This repository showcases all the assignments I completed during my internship. Each task includes source code, explanations, and output samples to demonstrate the working logic.
Task 1: Number Guessing Game
This is a Java-based console game where the system picks a secret number, and the user must identify it within a fixed number of tries. The game gives directional hints such as **“Too High”, “Too Low”, “Slightly High”, or “Slightly Low”** depending on how close the guess is. Scores are awarded based on how fast the number is guessed, and players may continue with multiple rounds.
Key Features:

* Random number generated between 1 to 100
* 5 attempts available per round
* Smart hints to guide the player
* Running score for all rounds
* Replay option at the end of each game
* Simple and interactive console experience

### **Technologies Used**

* Java
* `Scanner` class for input
* `Math.random()` for number generation

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

File:`NumberGame.java`

---

## 📝 **Task 2: Student Grade Calculator**

**Overview**

A simple Java program that computes a student's total marks, average percentage, and final grade based on the marks entered for multiple subjects.

### **Highlights**

* Accepts number of subjects and marks out of 100
* Calculates total marks and percentage
* Determines grade according to scoring range
* Neatly formatted output for clarity

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

## 📝 **Task 3: ATM Interface**

### **Overview**

This mini-project simulates a basic ATM machine in Java. Users can check their account balance, deposit money, or withdraw funds using a menu-driven console interface.

### **Core Functionalities**

* **Balance Inquiry:** Shows available balance
* **Deposit:** Adds valid amount to balance
* **Withdraw:** Deducts amount if balance is sufficient
* **Exit:** Closes the program safely
* **Input Validation:** Disallows negative or invalid transactions

### **Concepts Implemented**

* Classes & methods
* Loops (`while`, `switch`)
* Conditional logic
* Static variables
* User input handling

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

## ▶️ **How to Execute the Programs**

### 1. Clone the repository:

### 2. Move into the project directory

```
cd CodSoft
```

### 3. Compile & Run

Example for Task 1:

```
javac NumberGame.java
java NumberGame
```

---

## 👤 **Author**

**Harshit Kulkarni**
📌 Hyderabad, India
💼 Intern | Computer Science Engineering
🔥 Enthusiastic about Java, AI/ML, and Full-Stack Development

---

If you want, I can also:

✅ Add badges
✅ Add images
✅ Add tables
✅ Make it more professional
✅ Simplify or expand sections
✅ Personalize it with *your* name instead of his

Just tell me!
