# Data Types in Java

This document outlines the **primitive** and **non-primitive** data types used in Java.

---

## 🧱 Primitive Data Types

Primitive types are the most basic data types available. They store simple values directly in memory.

| Type     | Description                             | Example       |
|----------|-----------------------------------------|---------------|
| `int`    | Whole number (32-bit)                   | `10`, `-5`    |
| `float`  | Decimal number (32-bit)                 | `3.14f`, `-0.5f` |
| `double` | Larger decimal (64-bit)                 | `3.1415926`   |
| `char`   | Single Unicode character                | `'A'`, `'9'`  |
| `boolean`| True or false                           | `true`, `false` |
| `byte`   | Tiny integer (-128 to 127)              | `100`, `-10`  |
| `short`  | Small integer (-32,768 to 32,767)       | `30000`       |
| `long`   | Large integer                           | `99999999L`   |

---

## 🧰 Non-Primitive Data Types

These types reference objects and are used to store more complex structures.

| Type        | Description                             | Example                          |
|-------------|-----------------------------------------|----------------------------------|
| `String`    | A sequence of characters                | `"Hello, Alok!"`                 |
| `Array`     | Collection of elements of the same type | `int[] arr = {1, 2, 3};`         |
| `Class`     | Blueprint for creating objects          | `class Car { ... }`              |
| `Object`    | Superclass of all Java classes          | `Object obj = new Car();`        |
| `Interface for defining contracts    | `interface Movable { ... }`      |

> 📝 Non-primitive types store references (memory addresses), not actual values.

---

## 🔎 Quick Notes

- Primitive types are stored in the stack, and are faster to access.
- Non-primitive types are stored in the heap, and can be more flexible.
