package ex4;

/**
 * This class represents a single cell in the spreadsheet.
 * Handles different data types such as text,numbers, formulas, functions, and IF conditions.
 */
public class SCell implements Cell {
    private String _line;
    private int order =0;
    int type = Ex2Utils.TEXT;

    /**
     * Default constructor setting an empty cell.
     */
    public SCell() {
        this("");
    }

    /**
     * Constructor that sets the cell with data.
     * @param s The value to store in the cell.
     */
    public SCell(String s) {
        setData(s);
    }

    /**
     * Gets the computation order of the cell.
     * @return The order in which this cell should be evaluated.
     */
    @Override
    public int getOrder() {
        return order;
    }

    /**
     * Sets the data of the cell and determines its type.
     * @param s The new value to be stored in the cell.
     */
    @Override
    public void setData(String s) {
        if(s!=null) {
        type = Ex2Utils.TEXT;
        if (isNumber(s)) {
            type = Ex2Utils.NUMBER;
        }
        else if (isFunction(s)){
            type = Ex2Utils.FUNCTION;
        }
        else if(isIf(s)){
            type = Ex2Utils.IF;
        }
        else if(s.startsWith("=")) {
            type = Ex2Utils.FORM;
        }
        _line = s;
      }
    }

    /**
     * Gets the data in the cell.
     * @return The cell's value as a string.
     */
    @Override
    public String getData() {
        return _line;
    }

    /**
     * Gets the type of the data stored in the cell.
     * @return The type of data (TEXT, NUMBER, FUNCTION, IF, FORM).
     */
    @Override
    public int getType() {
        return type;
    }

    /**
     * Sets the type of the data in the cell.
     * @param t The new type to assign to the cell.
     */
    @Override
    public void setType(int t) {
        type = t;
    }

    /**
     * Sets the computation order for formula evaluation.
     * @param t The computation order value.
     */
    @Override
    public void setOrder(int t) {
        this.order = t;
    }

    @Override
    public String toString() {
        return getData();
    }

    /**
     * Checks if the given string represents a number.
     * @param line The string to check.
     * @return True if the string is a valid number, otherwise false.
     */
    public static boolean isNumber(String line) {
        if (line == null || line.isEmpty()) {
            return false;
        }

        try {
            Double.parseDouble(line);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checks if the given string represents a function.
     * A function starts with '=' followed by a recognized function name.
     * @param line The string to check.
     * @return True if the string is a function, otherwise false.
     */
    static boolean isFunction(String line) {
        if (line == null || line.isEmpty()) return false;
        line = line.toLowerCase().replace(" ", "");
        if (!line.startsWith("=")) return false;
        if (line.startsWith("=if(")) return false;
        for (String func : Ex2Utils.FUNCTIONS) {
            if (line.startsWith("=" + func + "(")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if the given string represents an IF function.
     * An IF function starts with "=if".
     * @param line The string to check.
     * @return True if the string is an IF function, otherwise false.
     */
    public static boolean isIf(String line){
        return line != null && line.length() >= 3 && line.toLowerCase().startsWith("=if");
    }

    }
