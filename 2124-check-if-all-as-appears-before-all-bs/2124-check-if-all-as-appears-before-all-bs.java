class Solution {
    public boolean checkString(String s) {
        boolean foundB=false;
        for(char c : s.toCharArray()) {
            if(c=='b')
                foundB =true;
            if(c=='a'&&foundB)
                return false;
        }
        return true;
    }
}