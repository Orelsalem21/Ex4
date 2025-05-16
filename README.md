
📊 **Ex4: Enhanced Spreadsheet Tool**  
*Course: Ariel University – Computer Science 2025A*

---

## 📝 Overview
This software represents an upgraded spreadsheet system tailored for the *Introduction to Computer Science* course. It adds sophisticated support for computations, decision-making logic, error detection, and data persistence.

### 🔑 Key Features:
-  Range2D-based calculations: `sum`, `min`, `max`, `average`
-  Conditional operations using `if` logic
-  Robust formula and function validation
-  Detection of cyclic dependencies
-  File-based saving and loading

---

## 📽 Demo Photo 
****

---

## ⚙️ Feature Set

### 1️⃣ Range Operations (Range2D)
- Accepts ranges like `A1:C5`
- Common use: `=sum(A1:C5)` – totals the values across the selected area

### 2️⃣ Built-in Functions
- `=min(A1:C5)` → Fetches the **lowest** number  
- `=max(A1:C5)` → Fetches the **highest** number  
- `=sum(A1:C5)` → Returns the **total sum**  
- `=average(A1:C5)` → Computes the **mean**

### 3️⃣ `if` Logic Statements
Example:  
```text
=if(A1>10,High,Low)
```

Nested example:  
```text
=if(A1>10,if(B1<5,50,Check),Low)
```

Meaning:  
- If `A1 > 10`, then evaluate `B1`.
- If `B1 < 5`, return `50`; otherwise return `"Check"`.
- If `A1 <= 10`, return `"Low"`.

---

## ⚠️ Error Detection

| Error        | Explanation |
|--------------|-------------|
| `IF_ERR`     | Invalid if syntax (e.g. `=if(A1,5,10)`) |
| `FUNC_ERR`   | Badly formed function (e.g. `=sum(A1)` instead of `=sum(A1:A5)`) |
| `ERR_CYCLE`  | Circular logic – cell indirectly references itself |

Empty cells in a range are skipped. If any range contains a **text** cell → `FUNC_ERR`.

---

##  Rules Summary
1. All formulas/functions begin with `=`
2. No spaces allowed between function name and parameters
3. `if` must follow format: *formula operator formula*
4. Both result values (`true`, `false`) must be valid values
5. Self-references in ranges → `ERR_CYCLE`
6. Ranges with text → `FUNC_ERR`  

---

## ✅ Valid Examples:
```text
=if(A1>5,10,20)
=if(A1*A2!=A3/(2-A1),A2+2,A1+1)
=sum(A1:C5)
=min(A1:B4)
=max(A2:D3)
=average(A1:B3)
```

## ❌ Invalid Examples:
```text
=if(A1>5,10)             ← Missing "false" value
=if(A1,5,10)             ← Condition isn't a comparison
=min(A1)                 ← Not a range
=sum(A1:A5,B1:B5)        ← Multiple ranges not allowed
=average(A1:A5,B1:B5)    ← Multiple ranges not allowed
```

---

##  Testing Overview

The project is backed by **JUnit tests** covering:

-  Invalid `if` use  
-  Ranges with empty or invalid cells  
-  Expression parsing and operator behavior  
-  Circular dependencies  
-  Edge input cases  
-  Updates and re-evaluation propagation  

---

## 📂 Project Layout
```
Ex4/
├── src/ex4/
│   ├── Ex2Sheet.java
│   ├── Ex2Utils.java
│   ├── SCell.java
│   ├── Range2D.java
│   ├── CellEntry.java
│   ├── Spreadsheet.java
│   └── Ex2GUI.java
├── test/ex4/
│   ├── SCellTest.java
│   ├── Ex2SheetTest.java
│   └── Range2DTest.java
├── README.md
└── Ex4.iml
```

---

## 📌 Submission Details
- **Student ID**: 208748368  
- **Repository**: [https://github.com/Orelsalem21/Ex4.git](https://github.com/Orelsalem21/Ex4.git)
