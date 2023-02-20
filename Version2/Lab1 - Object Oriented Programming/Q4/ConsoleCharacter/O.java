
package consolecharacter;

public class O extends ConsoleCharacter{ 
    
    public boolean [][] getUppercase() {
        int column = 4;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 2, 0);
        plotHorizontalLine(buff, 1, 2, 4);
        plotVerticalLine(buff, 1, 3, 0);
        plotVerticalLine(buff, 1, 3, 3);
        return buff;
    }
    
    public boolean [][] getLowercase() {
        int column = 4;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 2, 1);
        plotHorizontalLine(buff, 1, 2, 4);
        plotVerticalLine(buff, 2, 3, 0);
        plotVerticalLine(buff, 2, 3, 3);
        return buff;
    }
}
