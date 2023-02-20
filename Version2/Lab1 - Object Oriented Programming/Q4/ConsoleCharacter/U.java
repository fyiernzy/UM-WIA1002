package consolecharacter;

public class U extends ConsoleCharacter {

    public boolean[][] getUppercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 3, 4);
        plotVerticalLine(buff, 0, 3, 0);
        plotVerticalLine(buff, 0, 3, 4);
        return buff;
    }

    public boolean[][] getLowercase() {
        int column = 5;
        boolean[][] buff = getBuff(column + 2);

        plotHorizontalLine(buff, 1, 3, 3);
        plotVerticalLine(buff, 0, 2, 0);
        plotVerticalLine(buff, 0, 4, 4);
        return buff;
    }
}
