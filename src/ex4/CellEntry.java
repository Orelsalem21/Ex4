package ex4;

/**
 * This class represents a cell in the spreadsheet.
 * It stores the cell's location either as a reference string (e.g., "A1")
 * or as numeric coordinates (x, y).
 */
    public class CellEntry implements Index2D {
        private String _data;
        private int x;
        private int y;

    /**
     * Constructs a cell entry using (x, y) coordinates.
     * If the coordinates are out of bounds, an error value is stored.
     *
     * @param x Column index.
     * @param y Row index.
     */
    public CellEntry(int x, int y) {
        if (x < 0 || y < 0 || x >= Ex2Utils.ABC.length) {
            _data = "ERROR!";
        } else {
            _data = Ex2Utils.ABC[x] + y;
        }
        init();
    }

    /**
     * Constructor that initializes a cell entry using a cell reference string.
     * @param c The cell reference string (e.g., "A1").
     */
    public CellEntry(String c) {
        _data = c;
        init();
    }

    /**
     * Converts the reference string into numerical coordinates.
     * If the conversion fails, the cell is invalid.
     */
    private void init() {
        x = -1;
        y= -1;
       if(_data!=null && _data.length()>=2) {
           _data = _data.toUpperCase();
            String s1 = _data.substring(0,1);  // get column letter
            String s2 = _data.substring(1);  // get row number
            Integer yy = Ex2Sheet.getInteger(s2); // parse row number
            if(yy!=null){
                y=yy;
            }
            if(y>=0) {
                x = s1.charAt(0) - 'A';// Convert letter to index
                if(x<0 || x>25) {x=-1;}// Invalid column
          }
       }
       if(x==-1) {_data=null; y=-1;} // mark as invalid cell
    }

    /**
     * Converts the stored coordinates back into a cell reference string.
     * @return The cell reference ("A1"), or null if invalid.
     */
    public String toCell() {
        String ans = null;
        if(x>=0 && y>=0) {
            ans = Ex2Utils.ABC[x]+y;
        }
        return ans;
    }

    /**
     * Checks if the cell reference is valid.
     * @return True if the cell is valid, otherwise false.
     */
    @Override
    public boolean isValid() {
        return _data!=null;}

    /**
     * Gets the column index of the cell.
     * @return The column index.
     */
    @Override
    public int getX()
         {return x;}

    /**
     * Gets the row index of the cell.
     * @return The row index.
     */
    @Override
    public int getY()
         {return y;}

    @Override
    public String toString() {
        return _data;
    }

}
