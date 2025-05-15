# Ex4 – Extended Spreadsheet Project  
**Ariel University – Introduction to Computer Science, 2025A**

---

## 📌 Project Description
This project is an advanced version of the Ex2 Spreadsheet system. It introduces extended functionalities such as 2D range support, mathematical functions, and conditional logic. The application handles parsing, evaluation, error detection, and saving/loading spreadsheet data.

---

## 🧱 Main Components

### 🗂 Key Classes
- **`Ex2Sheet.java`** – Main class implementing the `Sheet` interface, managing all cells.
- **`SCell.java`** – Represents each cell in the spreadsheet, handles parsing, evaluation, formula resolution, and error detection.
- **`Range2D.java`** – Represents a rectangular range of cells (e.g., `A1:C3`), used for aggregation functions.
- **`Ex2Utils.java`** – Includes utility functions for parsing strings, coordinates, types, and formula validation.
- **`CellEntry.java`** – Represents a cell's position and is used for dependency resolution.
- **`Spreadsheet.java`** – GUI wrapper and controller (optional).
- **`Ex2GUI.java`** – Visual display of the spreadsheet (provided GUI).
- **Test Classes**: `SCellTest.java`, `Ex2SheetTest.java`, `Range2DTest.java`.

---

## 🔧 Features

### ➕ Formula Parsing
- Supports recursive parsing and evaluation of expressions:
  - Basic math: `=1+2*3`
  - Parentheses: `=(1+2)*(3-1)`
  - Cell references: `=A1+B2*C3`

### 📐 Range2D Support
- Syntax: `A1:C3` (inclusive rectangle).
- Internally represented as two corner points.
- Used in functions like `min`, `max`, `sum`, and `average`.

### 🧮 Aggregation Functions
- Format: `=sum(A1:C3)`, `=average(B2:B5)`, etc.
- Functions supported:
  - `min(range)`
  - `max(range)`
  - `sum(range)`
  - `average(range)`
- Invalid format results in `FUNC_ERR`.

### ❓ Conditional Expressions
- Format: `=if(<cond>, <ifTrue>, <ifFalse>)`
- Condition is of the form `formula1 op formula2`, with `op` from `{<, >, ==, !=, <=, >=}`.
- Supports nesting and all value types (text, number, formula).
- Invalid format results in `IF_ERR`.

#### ✅ Examples:
```
=if(1<2,1,2)
=if(A1>2,=B1+1,"low")
=if(A1*A2 != A3/(2-A1), =A2+2, =A1+1)
```

---

## ⚠️ Error Handling
- **`ERR_FORM`** – Invalid formula structure.
- **`ERR_CYCLE`** – Cyclic dependency (e.g., A1 depends on itself).
- **`FUNC_ERR`** – Malformed aggregation function.
- **`IF_ERR`** – Invalid conditional logic.

---

## 💾 Save & Load
- Spreadsheet can be saved to and loaded from `.txt` files.
- All valid values, formulas, functions, and conditionals are persisted and parsed correctly.

---

## 🧪 Testing
JUnit tests included:
- **`SCellTest.java`** – Tests cell parsing, formula evaluation, function handling, and conditionals.
- **`Ex2SheetTest.java`** – Tests full spreadsheet behavior including `eval`, `set`, `get`, and error management.
- **`Range2DTest.java`** – Validates range parsing, indexing, and boundary behavior.

---

## 📁 File Structure
```
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
```

---

## 🚀 Running the Project
1. Open with **IntelliJ IDEA** (or other Java IDE).
2. Make sure JDK 17+ and **JUnit 5** are configured.
3. Run:
   - `main` in `Ex2GUI.java` for graphical interface.
   - JUnit tests under `test/ex4/` for validation.

---

## 🔗 Submission
- **Student ID**: 208748368  
- **GitHub Repository**: [https://github.com/Orelsalem21/Ex4.git](https://github.com/Orelsalem21/Ex4.git)

---

