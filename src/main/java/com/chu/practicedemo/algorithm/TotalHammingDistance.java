package com.chu.practicedemo.algorithm;

/**
 * @ClassName TotalHammingDistance
 * @Description 两个整数的 汉明距离 指的是这两个数字的二进制数对应位不同的数量。
 * <p>
 * 计算一个数组中，任意两个数之间汉明距离的总和。
 * <p>
 * 示例:
 * <p>
 * 输入: 4, 14, 2
 * <p>
 * 输出: 6
 * <p>
 * 解释: 在二进制表示中，4表示为0100，14表示为1110，2表示为0010。（这样表示是为了体现后四位之间关系）
 * 所以答案为：
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * @Author chufule
 * @Date 2021/5/28 10:12
 * @Version 1.0
 */
public class TotalHammingDistance {

    /**
     * 暴力解法 超时了
     * @param nums
     * @return
     */
    public static int totalHammingDistance(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                //首先求出两个数异或之后 相同位置为1的变为了0，然后再求异或之后数中有几个1
                int tem = nums[i] ^ nums[j];
                while (tem != 0) {
                    //result为tem中最小位为1的数
                    int result = tem & (~tem +1);
                    //result == 0说明位数中没有1，那就继续下一个数
                    if (result == 0) {
                        continue;
                    }
                    count += result != 0 ? 1:0;
                    tem = tem ^ result;
                }

            }
        }
        return count;
    }

    /**
     * /**
     *      * 4表示为  0100
     *      * 14表示为 1110
     *      * 2表示为  0010
     *      *
     *      * i=0 时 表示计算每个元素第i+1位是否是1
     *      * count+= 0100>>0 &1  count = 0;
     *      * count+= 1110>>0 &1  count = 0
     *      * count+= 0010>>0 &1  count = 0
     *      * 即i+1位为1的为0个,那么为为0的有3-0=3个，距离  0*3
     *      *
     *      * i=1 时 表示计算每个元素第i+1位是否是1
     *      * count+= 0100>>1 &1  count = 0;
     *      * count+= 1110>>1 &1  count = 1
     *      * count+= 0010>>1 &1  count = 1
     *      * 即i+1位为1的为2个,那么为为0的有3-2=1个，距离  2*1=2
     *      *
     *      *
     *      *i=2 时 表示计算每个元素第i+1位是否是1
     *      *count+= 0100>>1 &1  count = 1;
     *      *count+= 1110>>1 &1  count = 1
     *      *count+= 0010>>1 &1  count = 0
     *      *即i+1位为1的为2个,那么为为0的有3-2=1个，距离  2*1=2
     *      *
     *      *i=3 时 表示计算每个元素第i+1位是否是1
     *      *count+= 0100>>1 &1  count = 0;
     *      *count+= 1110>>1 &1  count = 1
     *      *count+= 0010>>1 &1  count = 0
     *      *即i+1位为1的为1个,那么为为0的有3-1=2个，距离  1*2=2
     *      * i=4...
     * @param nums
     * @return
     */
    public static int totalHammingDistance2(int[] nums){
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int total = 0;
        int length = nums.length;
        for (int i = 0; i < 30; i++) {
            int count = 0;
            for (int num : nums) {
                count += ((num >> i) & 1);
            }
            total += count * (length-count);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {4,14,4,14};
        int i = totalHammingDistance2(nums);
        System.out.println(i);
    }
}
