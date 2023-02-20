
package consolecharacter;

public class T extends ConsoleCharacter{
    public boolean[][] getUppercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 0, 4, 0);
        plotVerticalLine(buff, 0, 4, 2);

        return buff;
    }

    public boolean[][] getLowercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 0, 4, 1);
        plotVerticalLine(buff, 0, 4, 2);
        buff[4][3] = true;
        
         buff[3][4] = true;
        return buff;
    }
}
