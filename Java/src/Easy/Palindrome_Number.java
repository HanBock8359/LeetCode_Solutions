package Easy;

public class Palindrome_Number {
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		System.out.println(sol.isPalindrome(-121));
	}
}

class Solution {
    public boolean isPalindrome(int x) {
    	boolean result = false;
    	
        String str = Integer.toString(x);
        char[] chr = str.toCharArray();
        
        return isPalindrome(chr, 0);
    }
    
    public boolean isPalindrome(char[] chr, int index) {
    	if(index == chr.length / 2)
    		return true;
    	else {
    		if(chr[index] == chr[chr.length - 1 - index])
    			return isPalindrome(chr, index+1);
    		else
    			return false;
    	}
    }
}