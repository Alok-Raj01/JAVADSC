# 🧮 Arithmetic Operators in Java

This document summarizes all arithmetic-related operators in Java, logically grouped with examples.

---

## ➕ Basic Arithmetic Operators

These perform standard calculations between numerical values.

| Operator | Name        | Description                     | Example               | Result     |
|----------|-------------|---------------------------------|------------------------|------------|
| `+`      | Addition     | Adds two values                  | `5 + 3`                | `8`        |
| `-`      | Subtraction  | Subtracts right from left value | `10 - 4`               | `6`        |
| `*`      | Multiplication | Multiplies two values         | `7 * 2`                | `14`       |
| `/`      | Division     | Divides left by right value     | `10 / 2`               | `5`        |
| `%`      | Modulus      | Remainder of division           | `9 % 4`                | `1`        |

---

## 🔄 Unary Arithmetic Operators

Operators that operate on a single operand.

| Operator | Name           | Description                              | Example   | Result     |
|----------|----------------|------------------------------------------|-----------|------------|
| `+`      | Unary Plus     | Positive identity (rarely used)          | `+a`      | `a`         |
| `-`      | Unary Minus    | Negates a value                          | `-a`      | Negative of `a` |
| `++`     | Increment       | Increases a value by 1                   | `x++` / `++x` | `x = x + 1` |
| `--`     | Decrement       | Decreases a value by 1                   | `x--` / `--x` | `x = x - 1` |

> 🔹 Prefix (`++ before use.  
> 🔹 Postfix (`x++`) uses the value first, then updates.

---

## 🧠 Compound Assignment Operators

Shorter versions of arithmetic combined with assignment.

| Operator | Equivalent To | Example        | Description                       |
|----------|---------------|----------------|-----------------------------------|
| `+=`     | `a = a + b`   | `a += 5`       | Adds and assigns result to `a`    |
| `-=`     | `a = a - b`   | `a -= 2`       | Subtracts and assigns             |
| `*=`     | `a = a * b`   | `a *= 3`       | Multiplies and assigns            |
| `/=`     | `a = a / b`   | `a /= 2`       | Divides and assigns               |
| `%=`     | `a = a % b`   | `a %= 3`       | Modulus and assigns               |

---

## 🧾 Notes

- Division between integers always **returns an integer** (`5 / 2 = 2`, not `2.5`). Use `float` or `double` for real division.
- Modulo operator is great for checking **even/odd** (`num % 2`) or **cycles** (like wrapping indexes).

---

## 👨‍💻 Example

```java
int a = 10, b = 3;
System.out.println("Add: " + (a + b));    // 13
System.out.println("Divide: " + (a / b)); // 3 (int division)
System.out.println("Remainder: " + (a % b)); // 1

---

## 🔍 Comparison (Relational) Operators

These operators compare two values and return a boolean result (`true` or `false`).

| Operator | Name                | Description                                  | Example       | Result     |
|----------|---------------------|----------------------------------------------|---------------|------------|
| `==`     | Equal to            | Checks if values are equal                   | `5 == 5`      | `true`     |
| `!=`     | Not equal to        | Checks if values are not equal               | `3 != 5`      | `true`     |
| `>`      | Greater than        | Checks if left value is greater              | `7 > 2`       | `true`     |
| `<`      | Less than           | Checks if left value is smaller              | `4 < 9`       | `true`     |
| `>=`     | Greater than or equal | Checks if left value is larger or equal   | `6 >= 6`      | `true`     |
| `<=`     | Less than or equal   | Checks if left value is smaller or equal   | `5 <= 10`     | `true`     |

> 📌 These are mostly used in `if` statements, loops, and conditions to control flow.

---

## 👨‍💻 Example Usage

```java
int a = 10, b = 20;
System.out.println(a == b);  // false
System.out.println(a < b);   // true
System.out.println(a != b);  // true
