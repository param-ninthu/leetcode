Mysolution but it'll not fulfill all testcases.
// class Solution {
//     public void moveZeroes(int[] nums) {
//         if(nums.length != 1){
//             for(int i=0 ; i < nums.length ; i++){
//                 if(nums[i] == 0){
//                     int index = i;
//                     while(index < nums.length-1){
//                         int temp = nums[index];
//                         nums[index]=nums[index+1];
//                         nums[index+1] = temp;
//                         index++;
//                     }
//                 }
//             }
//         }
//     }
// }
