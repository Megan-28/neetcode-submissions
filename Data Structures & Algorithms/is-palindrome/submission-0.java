class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r){
            char cl=s.charAt(l);
            char rl=s.charAt(r);
            if(!Character.isLetterOrDigit(cl)){
                l++;
            }
            else if(!Character.isLetterOrDigit(rl)){
                r--;
            }
            else{
                if(Character.toLowerCase(cl)!=Character.toLowerCase(rl)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
