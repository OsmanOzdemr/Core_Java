package day19_LoopPractices;
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str= "aabcccd";

        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i); //each character from string
            int count=0;
            for (int j = 0; j <str.length() ; j++) {//to find frequency of each character
                char each=str.charAt(j);
                if(each==ch){
                    count++;
                }

            }
            if(result.contains(""+ch))
                continue;
            result+=ch;
            result+=count;

        }
        System.out.println(result);
    }
}
