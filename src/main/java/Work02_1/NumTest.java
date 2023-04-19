package Work02_1;

public class NumTest implements Test {

    int start;
    int val;
    int prev;

    public NumTest() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public int getNext() {
        prev = val;
        val += 2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;
        prev = -2;
    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
    }

    int getPrev() {
        return prev;
    }
}
