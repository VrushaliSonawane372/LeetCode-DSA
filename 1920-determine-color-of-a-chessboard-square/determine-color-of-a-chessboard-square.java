class Solution {
    public boolean squareIsWhite(String coordinates) 
    {
        int col = coordinates.charAt(0) - 'a' + 1;
        int row = coordinates.charAt(1) - '1' + 1;
        return (col + row) % 2 == 1;   
    }
}