package Lesson11.task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateList {

    public Map<Integer, Integer> getDuplicateListWithNumberOfRepeats(List<Integer> list){

        Map<Integer, Integer> mapNumbers = new HashMap<>();

        for(var value : list){
            int counter = 1;
            if(mapNumbers.containsKey(value)){
                counter += mapNumbers.get(value);
            }
            mapNumbers.put(value, counter);
        }
        return mapNumbers;
    }
}
