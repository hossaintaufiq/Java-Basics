
package quizmain;
public class Quiz {
        private int id;
    private int mark;

    public Quiz(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "ID:" + id + " mark:" + mark;
    }
}
