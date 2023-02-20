package Lab1.Q4.ConsoleCharacter;

public class P extends ConsoleCharacter{
    
    public boolean [][] getUppercase() {
        int column = 4;
        boolean[][] buff = getBuff(column + 2);
        
        plotVerticalLine(buff, 0, ROW - 1 , 0);
        plotHorizontalLines(buff, 0, 2, 0);
        plotHorizontalLine(buff, 0, 2, 2);
        buff[1][3] = true;
        return buff;
    }
    
    public boolean [][] getLowercase() {
        int column = 4;
        boolean[][] buff = getBuff(column + 2);
        
        plotVerticalLine(buff, 1, ROW - 1 , 0);
        plotHorizontalLines(buff, 0, 2, 1);
        plotHorizontalLine(buff, 0, 2, 3);
        buff[2][3] = true;
        return buff;
    }
}
