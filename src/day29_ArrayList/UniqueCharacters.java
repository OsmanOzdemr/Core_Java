package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";
        String[] arr= str.split("");
        ArrayList<String> list= new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);
        String unique="";
        for (String each : list) {
            if(Collections.frequency(list, each)==1){
                unique+=each;
            }
        }
        System.out.println(unique);




        /*
        list.removeIf(p-> Collections.frequency(list, p)>1);
        System.out.println(list);

         */
    }
}
