package HashTable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class HashTableTest {

    @Test
    public void find_words() {
            HashTable<String,Integer> hashTable= new HashTable<>();
            String sentence="To be or not to be";
            String[] words= sentence.toLowerCase().split(" ");

        for(String word : words){
            Integer value=hashTable.get(word);
            if(value == null){
                value=1;
            }
            else {
                value=value+1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("to");
        System.out.println(hashTable);
        Assertions.assertEquals(2,frequency);
        }
}