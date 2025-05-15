 Ex4 – Advanced Spreadsheet System
Ariel University – Introduction to Computer Science, 2025A

📌 Project Overview
This project is an extended version of the Ex2 Spreadsheet system. It introduces:

📐 2D range support

🧮 Mathematical aggregation functions

🧠 Conditional logic with if

🛠 Formula parsing, validation, and evaluation

💾 Save/load functionality

🗂 Key Classes
Ex2Sheet.java – Implements the Sheet interface, manages all spreadsheet data.

SCell.java – Represents a single cell, including parsing, evaluation, and error detection.

Range2D.java – Represents a 2D range of cells, e.g., A1:C3.

Ex2Utils.java – Utility class for parsing strings, coordinates, and validating formulas.

CellEntry.java – Represents a cell position and is used for dependency resolution.

Spreadsheet.java – GUI controller (optional).

Ex2GUI.java – Provided GUI for the spreadsheet.

Test Classes – SCellTest.java, Ex2SheetTest.java, Range2DTest.java.

🧮 Supported Features
🔲 2D Ranges (Range2D)
Use syntax like A1:C3 in functions to operate over multiple cells.
Example: =sum(A1:C5)

➕ Aggregation Functions
=min(A1:C5) → Smallest value

=max(A1:C5) → Largest value

=sum(A1:C5) → Total sum

=average(A1:C5) → Average value

=multiply(A1:C5) → Product of all values

🧩 Conditional Logic (if)
Supports nested conditionals.
Examples:

=if(A1>10,High,Low)

=if(A1>10,if(B1<5,50,Check),Low)

Explanation of the second:

If A1 > 10, check B1.

If B1 < 5, return 50, otherwise return "Check".

If A1 ≤ 10, return "Low".

🚫 Error Handling
Error Code	Description
IF_ERR	Invalid if syntax (e.g., missing condition or values)
FUNC_ERR	Malformed or unsupported function (e.g., single-cell function or multiple ranges)
ERR_CYCLE	Circular reference detected

📏 Function & IF Statement Rules
Must begin with =

No spaces allowed (e.g., =sum(A1:B1) ✅, = sum ( A1 : B1 ) ❌)

if condition must follow format: formula OP formula (e.g., A1>5)

if_true and if_false can be text, numbers, formulas, functions, or another if

Circular references in functions/ranges → ERR_CYCLE

Empty cells in a range are ignored

Text inside a range → FUNC_ERR

✅ Valid vs. ❌ Invalid Functions
✅ Valid:
=if(A1>5,10,20)

=if(A1*A2!=A3/(2-A1),A2+2,A1+1)

=sum(A1:C5)

=min(A1:B4)

=multiply(A1:B3)

❌ Invalid:
=if(A1>5,10) → Missing false value

=if(A1,5,10) → Condition must be a comparison

=min(A1) → Must be a range

=sum(A1:A5,B1:B5) → Multiple ranges not supported

=multiply(A1:A5,B1:B5) → Multiple ranges not supported

🧪 Testing & Edge Cases
✔ Covered by JUnit Tests:
Invalid if syntax & structure

Range functions with empty cells or text

Formula parsing and operator handling

Circular dependencies

Edge cases with negative values, emptiness, and updates

Dependency propagation between cells

💾 Save & Load
Data is saved/loaded from .txt files

All values, formulas, and functions persist correctly

📁 Project Structure
bash
Copy
Edit
Ex4/
├── src/
│   └── ex4/
│       ├── Ex2Sheet.java
│       ├── Ex2Utils.java
│       ├── SCell.java
│       ├── Range2D.java
│       ├── CellEntry.java
│       ├── Spreadsheet.java
│       └── Ex2GUI.java
├── test/
│   └── ex4/
│       ├── SCellTest.java
│       ├── Ex2SheetTest.java
│       └── Range2DTest.java
├── README.md
└── Ex4.iml
📤 Submission
Student ID: 208748368

GitHub Repository: https://github.com/Orelsalem21/Ex4.git
