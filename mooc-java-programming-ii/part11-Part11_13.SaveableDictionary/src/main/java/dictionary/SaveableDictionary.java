package dictionary;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SaveableDictionary {

    private HashMap<String, String> forwardDictionary = new HashMap<String, String>();
    private HashMap<String, String> reverseDictionary = new HashMap<String, String>();
    private ArrayList<String> deletedWords = new ArrayList<String>();

    private String file;

    public SaveableDictionary(String file){
        this.file = file;
    }

    public SaveableDictionary(  ){

    }

    public boolean load()   {
        File myObj = new File( this.file);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner( myObj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return false;
        }

        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();

            String[] parts = line.split(":");   // split the line based on the ':' character

            String key = parts[0].toString();
            String value = parts[1];

            add(key,value);
        }
        fileReader.close();
        return true;




    }

    public void add(String words, String translation){

        if (!forwardDictionary.containsKey(words)){
        forwardDictionary.put(words, translation);
        }

     }

     private void findReverse( ){

        for(Map.Entry<String, String> forwardEntry: forwardDictionary.entrySet()){
            reverseDictionary.put(forwardEntry.getValue(),forwardEntry.getKey());

        }
    }

    public void delete(String word){
        String translation = forwardDictionary.get(word);

        forwardDictionary.remove(word);
        reverseDictionary.remove(translation);
         ;
        deletedWords.add(word);

    }

    public String translate(String word){
        findReverse();

        String forwardWord = forwardDictionary.get(word);
        String reverseWord = reverseDictionary.get(word);

        if(reverseDictionary.containsKey(word)){
            return reverseWord;
        } else {
            return forwardWord;
        }



    }

    public boolean save()   {

            File myObj = new File(this.file);
        try {
            myObj.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(deletedWords);
        try {
            PrintWriter writer = new PrintWriter(this.file);

            for(Map.Entry<String, String> forwardEntry: forwardDictionary.entrySet()){
                String result = String.format("%s:%s",forwardEntry.getValue(),forwardEntry.getKey());

                if(!deletedWords.contains(forwardEntry.getValue())) {

                    writer.println(result);
                }

            }
            writer.close();


            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }



    }

}
