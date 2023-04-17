package Friday.Utils;

public class DateUnit {
    private int date;
    Object value;

    public DateUnit(int date, Object value) {
        this.date = date;
        this.value = value;
    }

    public int getDate() {
        return this.date;
    }

    public Object getValue() {
        return this.value;
    }
}
