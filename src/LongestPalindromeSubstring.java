/**
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */
class LongestPalindromeSubstring {
  public String longestPalindrome(String s) {
    String result = "";
    for(int i = 0; i < s.length(); i++){
      String str = getPalindromeString( s,  i,  i);
      if(result.length() < str.length()){
        result = str;
      }
    }

    for(int i = 0; i < s.length(); i++){
      String str = getPalindromeString( s,  i,  i+1);
      if(result.length() < str.length()){
        result = str;
      }
    }
    return result;
  }


  public String getPalindromeString(String s, int i, int j){
    while(i >=0 && j < s.length()){
      if(s.charAt(i) != s.charAt(j)){
        break;
      }
      i--;
      j++;
    }
    return s.substring(i+1, j);
  }
}
