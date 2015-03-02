package repo2;


import java.util.SortedMap;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1306794
 */
public class ExtendedDictionary implements Dictionary{
    private SortedMap<String, String>map;

    public ExtendedDictionary() {
        map = new TreeMap<String, String>();
        map.put("Journal", "a set of articles,usually bound with a soft cover");
        map.put("Author", "a person who writes");
        map.put("Georgi Koemdzhiev", "A super man");
    }
    
    
    
    @Override
    public String getDefinition(String str) {
        return map.get(str);
    }
}
