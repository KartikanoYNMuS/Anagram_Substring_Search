/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram_substring_search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jain
 */
public class Anagram_SubString_search {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String o_s="ABACDABCABA";
        String i_s="BA";
        Map <Character,Integer> m=new HashMap<>();
        Map <Character,Integer> m2=new HashMap<>();
        
        for(int j=0;j<i_s.length();j++){
            if(!m2.containsKey(i_s.charAt(j))) {                        
                    m2.put(i_s.charAt(j),1);
                } else {
                   m2.put(i_s.charAt(j),m2.get(i_s.charAt(j))+1);
                }
        }
        
        //System.out.println("m2 is "+m2);
        for(int i=0;i<=o_s.length()-i_s.length();i++){
            
            for(int k=i;k<i+i_s.length();k++){
                if(!m.containsKey(o_s.charAt(k))) {                        
                    m.put(o_s.charAt(k),1);
                } else {
                   m.put(o_s.charAt(k),m.get(o_s.charAt(k))+1);
                }
              //  System.out.println(m);
            }
            if(m.equals(m2))
                System.out.println("Found at Index "+i);
            m.clear();
            }
        
    }
    
}
