# 🔁 Recursion — Short Notes

## What is Recursion?
- A function **calls itself** to solve a **smaller subproblem** until a **base case** stops further calls.

## Call Stack Behavior
- Each call gets its own **stack frame** and **stays on the stack** until it returns.
- When a call **finishes**, its frame is **popped** off the stack.
- Control returns to the **caller**, and the program continues **step by step** (LIFO order).

![img.png](img.png)