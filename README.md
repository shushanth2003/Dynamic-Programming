
````markdown
# 🧮 Dynamic Programming (DP) Notes

Dynamic Programming (DP) is a technique for solving problems by breaking them down into smaller subproblems, solving each subproblem once, and storing their solutions.

---

## 🚀 What is DP?
- DP = **Divide + Remember + Reuse**
- Instead of recomputing results, DP saves them and reuses.
- Mainly used for **optimization** and **counting problems**.

---

## 📌 Steps to Solve a DP Problem
1. **Identify** if the problem can be broken into overlapping subproblems.
2. **Define State**  
   - Example: `dp[i]` = solution for the first `i` items.
3. **Find Recurrence Relation**  
   - How can you get `dp[i]` from smaller subproblems?
4. **Base Case(s)**  
   - Define the smallest solvable case.
5. **Choose Approach**
   - **Top-Down (Memoization)** → Recursive + cache
   - **Bottom-Up (Tabulation)** → Iterative + table

---

## 🔑 Characteristics of DP Problems
- **Optimal Substructure**: Solution can be built from sub-solutions.
- **Overlapping Subproblems**: Same subproblems appear multiple times.

---

## 🛠️ Types of DP
1. **1D DP** → Fibonacci, Climbing Stairs
2. **2D DP** → Grid problems, Longest Common Subsequence
3. **DP on Subsequences** → Knapsack, Subset Sum
4. **DP on Strings** → Edit Distance, Palindrome Partitioning
5. **DP on Trees/Graphs** → Tree DP, Shortest Paths

---

### 2. Climbing Stairs

* Ways to climb `n` stairs taking 1 or 2 steps at a time.
* Relation: `dp[n] = dp[n-1] + dp[n-2]`

### 3. 0/1 Knapsack

* `dp[i][w]` = max value using first `i` items with capacity `w`.

---

## 🧩 Tips for Mastering DP

* Practice **patterns** (Fibonacci → Knapsack → LCS → Matrix Chain).
* Always write **recurrence relation first**.
* Try **recursive solution first**, then optimize with DP.
* Visualize with **tables/graphs**.

---

## 📚 Practice Problems

* Fibonacci
* Climbing Stairs
* Coin Change
* Longest Common Subsequence
* Edit Distance
* Matrix Chain Multiplication
* Knapsack Variants

```
