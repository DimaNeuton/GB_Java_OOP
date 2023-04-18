package Work01;

public class Numbers {
    int x, y;
    private int z;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Numbers(int valueX, int valueY) {
        this.x = valueX;
        this.y = valueY;
    }
    public Numbers() {
        this.x = 0;
        this.y = 0;
    }

    public Numbers(int value) {
        this.x = value;
        this.y = value;
    }


}
