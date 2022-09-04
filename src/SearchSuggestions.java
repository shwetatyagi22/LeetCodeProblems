import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1268. Search Suggestions System
 * Medium
 *
 * 3684
 *
 * 181
 *
 * Add to List
 *
 * Share
 * You are given an array of strings products and a string searchWord.
 *
 * Design a system that suggests at most three product names from products after each character of searchWord is typed. Suggested products should have common prefix with searchWord. If there are more than three products with a common prefix return the three lexicographically minimums products.
 *
 * Return a list of lists of the suggested products after each character of searchWord is typed.*
 */

public class SearchSuggestions {
  public List<List<String>> suggestedProducts(String[] products, String searchWord) {

    List<List<String>> list = new ArrayList<>();
    List<String> pList = Arrays.asList(products);
    Collections.sort(pList);
    for(int i = 0; i < searchWord.length(); i++){
      String s = searchWord.substring(0, i+1);
      pList = find( pList,  s);
      list.add(pList.size() > 3 ? pList.subList(0,3) :pList );
    }
    return list;
  }

  public List<String> find(List<String> products, String searchWord) {
    List<String> list = new ArrayList<>();
    for(int i = 0; i < products.size(); i++){
      String word = products.get(i);
      if(word.startsWith(searchWord)){
        list.add(word);
      }
    }
    return list;
  }
}
