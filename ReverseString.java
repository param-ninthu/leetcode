//// s = ["h" , "e" ,"l" ,"l"] input
//// s = ["l" ,"l" , "e", "h"] output

class Solution {
    public void reverseString(char[] s) {
     

        int left =0 ;
        int right = s.length -1 ;
        if(s.length >= 2){
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right]= temp;


            left++;
            right--;
        }
        }
    }
}

