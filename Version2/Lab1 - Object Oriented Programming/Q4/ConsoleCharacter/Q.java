
package consolecharacter;

public class Q extends ConsoleCharacter{
    
    public boolean [][] getUppercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 2, 0);
        plotHorizontalLine(buff, 1, 2, 3);
        plotVerticalLine(buff, 1, 2, 0);
        plotVerticalLine(buff, 1, 2, 3);
        plotDiagonalLeftTop(buff, 2, 4);
        return buff;
    }
    
    public boolean [][] getLowercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 3, 0);
        plotHorizontalLine(buff, 1, 3, 2);
        plotVerticalLine(buff, 0, 4, 3);
        
        buff[1][0] = true;
        buff[3][4] = true;
        return buff;
    }
}
