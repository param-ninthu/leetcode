// Exceed time limit
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int[] outArray = new int[2];

//         for(int i =0 ; i < numbers.length ; i++){
//             for(int j = i+1 ; j < numbers.length ; j++){
//                 if(numbers[i]+numbers[j] == target){
//                     outArray[0]=i+1;
//                     outArray[1]= j+1;
//                     return outArray;
//                 }
//             }
//         }
//         return outArray;
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] outArray = new int[2];

        if(numbers.length == 0 || numbers.length < 2){
            return outArray;
        }

        int left = 0; 
        int right = numbers.length - 1;


        while(left < right){

            if( numbers[left] + numbers[right] == target){
                outArray[0] = left+1;
                outArray[1] = right+1;
                break;
            }

            else if(numbers[left] + numbers[right] > target){
                right --;
            }
            else{
                left ++;
            }

        }
        return outArray;
    }
}
