
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
=sum(A1:C5)       → totals values in rectangle A1 to C5
=min(B2:D4)       → minimum value in range B2 to D4
=average(A1:B2)   → average of 4 cells
=max(A1:Z99)      → maximum in entire sheet
```

### Conditional Logic:
=if(A1>10,High,Low)                    → Simple condition
=if(A1>10,if(B1<5,50,Check),Low)      → Nested IF
=if(sum(A1:B2)>20,=max(C1:D2),0)      → Functions in conditions

## Complex Examples:
java=if(A1*A2!=A3/(2-A1),=sum(B1:C3),=average(D1:E2))
=if(max(A1:C1)>min(D1:F1),Great,Small)

### Error Handling:
ErrorMeaningExampleIF_ERRBad if format=if(A1,5,10)FUNC_ERRInvalid function or bad range=sum(A1:text)ERR_CYCLECircular formula referenceA1: =A1+5ERR_FORMInvalid formula syntax=5++3
---
##✅ Valid Inputs:
=if(A1>5,10,20)                      ✓ Simple comparison
=sum(A1:C3)                          ✓ Range function
=if(A1*A2!=A3/(2-A1),A2+2,A1+1)     ✓ Complex condition
=if(5>2,=if(3<4,100,200),300)       ✓ Nested IF
❌ Invalid Examples:
java=if(A1,5,10)              → condition must be comparison
=if(A1>5,10)              → missing false branch
=sum(A1:A5,B1:B5)         → multiple ranges not supported
=if(A1>>B1,yes,no)        → invalid operator
🧪 Testing Scope
Comprehensive JUnit tests covering:

✅ Formula parsing and operator precedence
✅ Range evaluation with edge cases (empty cells, text)
✅ if expressions including nested logic
✅ Circular reference detection
✅ Data updates and propagation
✅ Save/load functionality with new features
✅ Boundary conditions (A0, Z99, etc.)

📁 Project Structure
Ex4/
├── src/ex4/
│   ├── Cell.java              → Cell interface
│   ├── CellEntry.java         → Cell coordinate implementation
│   ├── Ex2Sheet.java          → Main spreadsheet logic
│   ├── Range2D.java           → Range functions (sum, min, max, etc.)
│   ├── SCell.java             → Cell implementation
│   ├── Ex2GUI.java            → Graphical interface
│   └── Ex2Utils.java          → Constants and utilities
├── tests/                     → JUnit test files
├── README.md
└── sample_files/              → Example spreadsheet files
    ├── test_sheet.txt
    └── complex_example.txt

---

## 📌 Submission  
- **Student ID**: 208748368  
- **Repository**: [https://github.com/Orelsalem21/Ex4.git](https://github.com/Orelsalem21/Ex4.git)

