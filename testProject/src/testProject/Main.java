package testProject;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        
        System.out.println("test Class");

        List<String> sentenceFirst = new ArrayList<String>();
        
        sentenceFirst.add("Hello");
        sentenceFirst.add("Beautiful");
        sentenceFirst.add("World!");
        
        System.out.println(sentenceFirst);
        
        List<String> sentenceSecond = new ArrayList<String>(); 
        
        sentenceSecond.add("Something");
        sentenceSecond.add("To");
        sentenceSecond.add("Test");
        
        System.out.println(sentenceSecond);
    }

}
