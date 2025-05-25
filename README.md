
📊 **Ex4: Enhanced Spreadsheet Tool**  
*Course: Ariel University – Computer Science 2025A*

---

## 📝 Overview  
This project extends a basic spreadsheet system with support for mathematical expressions, conditional logic, and data range functions. It is part of the Introduction to Computer Science (2025A) course.

### 🔑 Key Features:
-  Evaluate formulas with `+`, `-`, `*`, `/`, and parentheses
- Functions like `sum`, `min`, `max`, `average`, and `multiply` over 2D cell ranges
- Conditional expressions using nested `if` logic
- Cycle detection for formulas referencing each other
- Save/load spreadsheet content from text files

---

## 🎬 Demo

[![Watch Demo](demo-screenshot.png)](https://youtu.be/0j_o3yKhASw)

![Preview](Sol_Ex4_.png)

## How to Run

Clone the repository:
bashgit clone https://github.com/Orelsalem21/Ex4.git

Open the project in IntelliJ IDEA
Run the main class: Ex2GUI.java
The spreadsheet GUI will open automatically

## ⚙️ Features & Examples

### Range Functions:
```text
=sum(A1:C5)       → totals values
=min(B2:D4)       → minimum in range
=average(A1:B2)   → average of cells
```

### Conditional Logic:
```text
=if(A1>10,High,Low)
=if(A1>10,if(B1<5,50,Check),Low)
```

### Error Handling:
| Error       | Meaning |
|-------------|---------|
| `IF_ERR`    | Bad `if` format |
| `FUNC_ERR`  | Invalid function or bad range |
| `ERR_CYCLE` | Circular formula reference |

---

## ✅ Valid Inputs:
```text
=if(A1>5,10,20)
=sum(A1:C3)
=if(A1*A2!=A3/(2-A1),A2+2,A1+1)
```

## ❌ Invalid Examples:
```text
=if(A1,5,10)             → condition must be comparison
=sum(A1:A5,B1:B5)        → multiple ranges not supported
```

---

## 🧪 Testing Scope
Includes full JUnit tests for:
- Formula parsing and operator precedence
- Range evaluation with edge cases
- `if` expressions including nested logic
- Circular reference detection
- Data updates and propagation

---

## 📁 Project Structure
```
Ex4/
├── src/ex4/
│   ├── Cell.java
│   ├── CellEntry.java
│   ├── CellEntryTest.java
│   ├── Ex2GUI.java
│   ├── Ex2Sheet.java
│   ├── Ex2SheetTest.java
│   ├── Ex2Utils.java
│   ├── Index2D.java
│   ├── Range2D.java
│   ├── Range2DTest.java
│   ├── SCell.java
│   ├── SCellTest.java
│   ├── Sheet.java
│   └── StdDrawEx2.java
├── README.md
└── test_save_load.txt / test_sheet.txt
```

---

## 📌 Submission  
- **Student ID**: 208748368  
- **Repository**: [https://github.com/Orelsalem21/Ex4.git](https://github.com/Orelsalem21/Ex4.git)

