package Work02_2;

public class iConstPlay implements iConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];
        for (int i = 0; i < 11; i++) {
            if (i >= MAX) {
                System.out.println(ERROR);
            } else {
                nums[i] = i;
                System.out.println(nums[i] + " ");
            }
        }
    }
}
