package com.emtodo.leetcode;

import java.util.HashMap;

/**
 * 1-10题
 *
 * 1.两数之和
 * 2.两数相加
 * 3.无重复字符的最长字串
 * 4.寻找两个有序数组的中位数
 * 5.最长回文子串
 * 6.Z 字形变换
 * 7.整数反转
 * 8.字符串转换整数 (atoi)
 * 9.回文数
 * 10.正则表达式匹配
 *
 * @author EM
 * @version [v1.0]
 * @date: Created in 2020/1/13 0013 下午 2:29
 */
public class OneToTenQuestions {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-151));

    }

    /**
     * <p>两数之和</p>
     * 1.暴力破解：双层循环。第一层用target-nums[i]得到差。第二层去寻找数组里是否有这个差值 时间复杂度O(N²)
     *            优化的地方时第二层j可以等i+1。前面的数已经计算过了，第二层循环不必每次都计算一遍
     * 2.哈希表：一层循环，把差值作为key，下标作为value。不存在差值则先存到哈希表。
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> resultMap = new HashMap();
        for(int i=0;nums.length>i;i++){
            int a = target - nums[i];
            if(null !=resultMap.get(a)){
                return new int[]{i,resultMap.get(a)};
            }
            resultMap.put(nums[i],i);
        }
        return null;
    }


    /**
     * <p>两数反转</p>
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String a = new String(x+"");
        StringBuffer sb = new StringBuffer();
        Boolean strResult = x<0;
        for(int i=a.length()-1;i>=0;i--){
            if("0".equals(a.charAt(i))){
                continue;
            }
            if(strResult && i==0){
                continue;
            }
            sb.append(a.charAt(i));
        }
        try{
            if (strResult){
                return Integer.parseInt("-"+sb.toString());
            }else{
                return Integer.parseInt(sb.toString());
            }
        }catch (Exception e){//整数溢出
            return 0;
        }
    }

    /**
     * 回文数
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        String a = new String(x+"");
        StringBuffer sb = new StringBuffer();
        for(int i=a.length()-1;i>=0;i--){
            sb.append(a.charAt(i));
        }
        return a.equals(sb.toString());
    }
}
