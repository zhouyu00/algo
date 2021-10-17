/*
 * @lc app=leetcode.cn id=26 lang=rust
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
impl Solution {
    pub fn remove_duplicates(nums: &mut Vec<i32>) -> i32 {
        if nums.len()==0 {return 0;}
        let mut p =0;
        for q in 1..nums.len(){
            if nums[p]!=nums[q]{
                p+=1;
                nums[p]=nums[q];
            }
        }
        return (p+1) as i32;
    }
}
// @lc code=end

