package leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Andrey Ananskiy
 */
public class FindAllNumbersDissapearedInArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDisappearedNumbers(nums));
    }


//    public static List<Integer> findDisappearedNumbers(int[] nums) {
//        Set<Integer> numSet = new HashSet<>();
//        for (int i = 1; i <= nums.length; i++) {
//            numSet.add(i);
//        }
//        for (int num : nums) {
//            numSet.remove(num);
//        }
//        return numSet.stream().toList();
//    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer> ansList = new ArrayList<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int i = 1; i < nums.length; i++ ) {
            if (!numSet.contains(i)){
                ansList.add(i);
            }
        }
        return ansList;
    }
}
