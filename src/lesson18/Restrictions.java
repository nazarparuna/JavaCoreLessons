package lesson18;

public class Restrictions<T extends Number> {

    T[] nums;

    public Restrictions(T[] nums) {
        super();
        this.nums = nums;
    }

    Number average() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return ((Number) Double.valueOf(sum / nums.length));
    }


}