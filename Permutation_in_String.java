class Solution {
    public boolean checkInclusion(String s1, String s2) {
        s1 = sortS(s1);

        for(int i = 0 ; i <= s2.length() - s1.length() ; i ++){
            if(s1.equals(sortS(s2.substring(i,i+s1.length())))){
                return true;
            }
        }
        return false;
    }

    public String sortS(String s1Sort){
        char [] s = s1Sort.toCharArray();
        Arrays.sort(s);
        return new String(s);
    }
}
