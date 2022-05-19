import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
      char[] c = ransomNote.toCharArray();
      char[] cm = magazine.toCharArray();
      Map<Character, Integer> map = new HashMap<>();
      for(int i = 0; i < c.length; i++){
        char ch = c[i];
        map.put(ch, map.getOrDefault(ch, 0)+1);
      }

      for(int i = 0; i < cm.length; i++){
        if(map.get(cm[i]) != null){
          map.put(cm[i], map.get(cm[i]) - 1);
        }
      }

      return map.values().stream().noneMatch(value -> value > 0);
    }
  }

