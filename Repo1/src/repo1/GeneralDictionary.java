package repo1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 1306794
 */
public class GeneralDictionary implements Dictionary{
    private SortedMap<String, String>map;

    public GeneralDictionary() {
        map = new TreeMap<String, String>();
        map.put("book", "a set of printed pages, bound with a cover");
        map.put("editor", "a person who edits");
    }
    
    
    
    @Override
    public String getDefinition(String str) {
        return map.get(str);
    }
    
}
