import java.util.Arrays;
import java.util.HashSet;

/**
 * * A valid encoding of an array of words is any reference string s and array of indices indices such that:
 *
 * words.length == indices.length
 * The reference string s ends with the '#' character.
 * For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].
 * Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
 */
public class ShortWordEncoding {
  public int minimumLengthEncoding(String[] words) {
    HashSet<String> hs = new HashSet<>(Arrays.asList(words));

    for(String s: words){
      for(int i=1; i<s.length(); i++)
        hs.remove(s.substring(i));
    }

    int length = 0;

    for(String s: hs)
      length += s.length()+1;

    return length;
  }
}
