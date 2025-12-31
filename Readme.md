🔁 Loop Logic Practice Programs (Python)

This repository contains basic to intermediate loop-based programs written in Python, designed to strengthen logical thinking and problem-solving skills.
Each problem includes a clear statement, approach, and simple code, making it ideal for beginners, students, and placement preparation.

📌 Contents

Level 1 – Basic Loop Logic

Level 2 – Loops with Conditional Logic

🟢 Level 1 – Basic Loop Logic
🔢 Problem 1: Sum of 10 Numbers

Problem Statement:
Write a program to calculate the sum of the first 10 natural numbers using a loop.

total = 0

for i in range(1, 11):
    total = total + i

print("Sum of 10 numbers is:", total)

🔢 Problem 2: Factorial of a Given Number

Problem Statement:
Write a program to find the factorial of a given number.

n = int(input("Enter a number: "))
fact = 1

for i in range(1, n + 1):
    fact = fact * i

print("Factorial is:", fact)

🔢 Problem 3: Sum of Square Series

(1 + 4 + 9 + 16 + … + n)

n = int(input("Enter limit: "))
total = 0

for i in range(1, n + 1):
    total = total + (i * i)

print("Sum of series:", total)

🔢 Problem 4: Reverse Digits of a Number
num = int(input("Enter a number: "))

while num > 0:
    print(num % 10)
    num = num // 10

🔢 Problem 5: Sum of Digits of a Number
num = int(input("Enter a number: "))
sum_digits = 0

while num > 0:
    sum_digits += num % 10
    num //= 10

print("Sum of digits:", sum_digits)

🔢 Problem 6: Multiplication Without Using *
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
result = 0

for i in range(b):
    result += a

print("Result:", result)

🔢 Problem 7: Calculate Power Without Using **
x = int(input("Enter base: "))
y = int(input("Enter power: "))
result = 1

for i in range(y):
    result *= x

print("Result:", result)

🟡 Level 2 – Loops with Conditional Logic
🔢 Problem 8: Numbers Divisible by 2 in a Range
start = int(input("Enter start: "))
end = int(input("Enter end: "))

for i in range(start, end + 1):
    if i % 2 == 0:
        print(i)

🔢 Problem 9: Factors of a Number
n = int(input("Enter a number: "))

for i in range(1, n + 1):
    if n % i == 0:
        print(i)

🔢 Problem 10: Sum of All Divisors
n = int(input("Enter a number: "))
total = 0

for i in range(1, n + 1):
    if n % i == 0:
        total += i

print("Sum of divisors:", total)

🔢 Problem 11: GCD of Two Numbers
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
gcd = 1

for i in range(1, min(a, b) + 1):
    if a % i == 0 and b % i == 0:
        gcd = i

print("GCD:", gcd)

🔢 Problem 12: LCM of Two Numbers
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
num = max(a, b)

while True:
    if num % a == 0 and num % b == 0:
        print("LCM:", num)
        break
    num += 1

🔢 Problem 13: Perfect Number Check
n = int(input("Enter a number: "))
total = 0

for i in range(1, n):
    if n % i == 0:
        total += i

if total == n:
    print("Perfect Number")
else:
    print("Not a Perfect Number")

🔢 Problem 14: Harshad Number Check
n = int(input("Enter a number: "))
temp = n
sum_digits = 0

while temp > 0:
    sum_digits += temp % 10
    temp //= 10

if n % sum_digits == 0:
    print("Harshad Number")
else:
    print("Not a Harshad Number")

🔢 Problem 15: Prime Number Check
n = int(input("Enter a number: "))
count = 0

for i in range(1, n + 1):
    if n % i == 0:
        count += 1

if count == 2:
    print("Prime Number")
else:
    print("Not Prime")

🔢 Problem 16: Fibonacci Series
n = int(input("Enter number of terms: "))
a, b = 0, 1

print(a, b, end=" ")

for i in range(2, n):
    c = a + b
    print(c, end=" ")
    a, b = b, c

🔢 Problem 17: Alternating Series

(1 – 2 + 3 – 4 + … ± n)

n = int(input("Enter value of n: "))
total = 0

for i in range(1, n + 1):
    if i % 2 == 0:
        total -= i
    else:
        total += i

print("Sum of series:", total)
