# 🔁 loop logic programs (python)

this repository contains basic and intermediate loop logic programs using python.
all programs are written in a simple and easy manner, suitable for beginners and placement preparation.

Level 1 – Basic Loop Logic

## 1️⃣Sum of 10 numbers

    total = 0
    
    for i in range(1, 11):
        total = total + i
    
    print("Sum of 10 numbers is:", total)


## 2️⃣Find factorial of a given number (n!)

    n = int(input("Enter a number: "))
    fact = 1
    
    for i in range(1, n + 1):
        fact = fact * i
    
    print("Factorial is:", fact)


## 3️⃣Print sum series 1 + 4 + 9 + 16 + … + n

    n = int(input("Enter limit: "))
    total = 0
    
    for i in range(1, n + 1):
        total = total + (i * i)
    
    print("Sum of series:", total)


## 4️⃣Print digits of a number in reverse order

    num = int(input("Enter a number: "))
    
    while num > 0:
        print(num % 10)
        num = num // 10


## 5️⃣Print sum of digits of a given number

    num = int(input("Enter a number: "))
    sum_digits = 0
    
    while num > 0:
        sum_digits = sum_digits + (num % 10)
        num = num // 10
    
    print("Sum of digits:", sum_digits)


## 6️⃣Perform multiplication without using * operator

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    result = 0
    
    for i in range(b):
        result = result + a
    
    print("Multiplication result:", result)


## 7️⃣Calculate x^y without using power operator

    x = int(input("Enter base: "))
    y = int(input("Enter power: "))
    result = 1
    
    for i in range(y):
        result = result * x
    
    print("Result:", result)

## Level 2 – Loops with Conditional Logic

## 8️⃣Print numbers divisible by 2 between two numbers

    start = int(input("Enter start number: "))
    end = int(input("Enter end number: "))
    
    for i in range(start, end + 1):
        if i % 2 == 0:
            print(i)


## 9️⃣Find factors of a given number

    n = int(input("Enter a number: "))
    
    for i in range(1, n + 1):
        if n % i == 0:
            print(i)


## 🔟Find the sum of all divisors of a number

    n = int(input("Enter a number: "))
    total = 0
    
    for i in range(1, n + 1):
        if n % i == 0:
            total = total + i
    
    print("Sum of divisors:", total)


## 1️⃣1️⃣Find the GCD (Greatest Common Divisor) of two numbers

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    gcd = 1
    
    for i in range(1, min(a, b) + 1):
        if a % i == 0 and b % i == 0:
            gcd = i
    
    print("GCD is:", gcd)


## 1️⃣2️⃣Find the LCM (Least Common Multiple) of two numbers

    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    num = max(a, b)
    
    while True:
        if num % a == 0 and num % b == 0:
            print("LCM is:", num)
            break
        num = num + 1


## 1️⃣3️⃣Check whether a number is a Perfect Number

    n = int(input("Enter a number: "))
    total = 0
    
    for i in range(1, n):
        if n % i == 0:
            total = total + i
    
    if total == n:
        print("Perfect Number")
    else:
        print("Not a Perfect Number")


## 1️⃣4️⃣Check whether a number is a Harshad Number

    n = int(input("Enter a number: "))
    temp = n
    sum_digits = 0
    
    while temp > 0:
        sum_digits = sum_digits + (temp % 10)
        temp = temp // 10
    
    if n % sum_digits == 0:
        print("Harshad Number")
    else:
        print("Not a Harshad Number")


## 1️⃣5️⃣Check whether a number is Prime or Not

    n = int(input("Enter a number: "))
    count = 0
    
    for i in range(1, n + 1):
        if n % i == 0:
            count = count + 1
    
    if count == 2:
        print("Prime Number")
    else:
        print("Not a Prime Number")


## 1️⃣6️⃣Print the Fibonacci Series

    n = int(input("Enter number of terms: "))
    a = 0
    b = 1
    
    print(a, b, end=" ")
    
    for i in range(2, n):
        c = a + b
        print(c, end=" ")
        a = b
        b = c


## 1️⃣7️⃣Find the sum of series 1 – 2 + 3 – 4 + … ± n

    n = int(input("Enter value of n: "))
    total = 0
    
    for i in range(1, n + 1):
        if i % 2 == 0:
            total = total - i
        else:
            total = total + i
    
    print("Sum of series:", total)s:", total)
