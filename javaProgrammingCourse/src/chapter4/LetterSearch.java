package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]){

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter some text:");
        String text = reader.next().toUpperCase();
        reader.close();

        boolean letterFound = false;

        for(int i=0; !letterFound && i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A'){
                letterFound = true;
            }
        }

        if(letterFound){
            System.out.println("This text contains the letter 'A'");
        }
        else{
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}