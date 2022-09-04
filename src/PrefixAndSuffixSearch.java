import java.util.HashMap;

/**
 * * 745. Prefix and Suffix Search
 * Design a special dictionary that searches the words in it by a prefix and a suffix.
 *
 * Implement the WordFilter class:
 *
 * WordFilter(string[] words) Initializes the object with the words in the dictionary.
 * f(string pref, string suff) Returns the index of the word in the dictionary, which has the prefix pref and the suffix suff. If there is more than one valid index, return the largest of them. If there is no such word in the dictionary, return -1.
 *
 */
public class PrefixAndSuffixSearch {
  HashMap<String, Integer> mp;

  public PrefixAndSuffixSearch(String[] words) {
    mp = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < words[i].length(); j++) {

        String prefix = words[i].substring(0, j + 1);

        for (int k = words[i].length() - 1; k > -1; k--) {

          String suffix = words[i].substring(k);
          mp.put(prefix + "#" + suffix, i);
        }
      }
    }
  }

  public int f(String prefix, String suffix) {

    return mp.getOrDefault(prefix + "#" + suffix, -1);
  }
}
