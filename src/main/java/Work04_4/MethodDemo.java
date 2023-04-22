package Work04_4;

public class MethodDemo {
    static <T extends Comparable<T>, V extends T> boolean array(T[] x, V[] y) {
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer nums1[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 3, 5, 5};
        Integer nums4[] = {1, 2, 3, 4, 5, 6};

        if (array(nums1, nums2)) {
            System.out.println("nums1 and nums2 - equiwal");
        }
        if (array(nums1, nums3)) {
            System.out.println("nums1 and nums3 - equiwal");
        }
        if (array(nums1, nums4)) {
            System.out.println("nums1 and nums4 - equiwal");
        }
        Double nums5[] = {1.1, 1.2, 1.3, 1.4, 1.5};
        if (array(nums5, nums5)) {
            System.out.println("nums5 and nums5 - equiwal");
        }
    }
}


