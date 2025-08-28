package inverted;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import map.SortedTableMap;

public class InvertedFile {
    private SortedTableMap<String, ArrayList<Integer>> map = new SortedTableMap<>();
    
    InvertedFile(File file) throws IOException{
        if(!file.canRead() && file.isDirectory()){
            throw new IOException("An incorrect filepath or file type was given");
        }
        buildInvertedFile(file);
    }
    
    private void buildInvertedFile(File file) throws FileNotFoundException{
        Scanner scanner = new Scanner(file);
        int wordIndex = 0;
        while (scanner.hasNext()){
            String word = scanner.next();
            ArrayList<Integer> wordIndices = map.get(word);
            if (map.get(word) == null){
                // The word is not in the map yet
                wordIndices = new ArrayList<>();
            }
            wordIndices.add(wordIndex++);
            map.put(word, wordIndices);
        }
        scanner.close();
    }

    public List<Integer> search(String word){
        return map.get(word);
    }
}
