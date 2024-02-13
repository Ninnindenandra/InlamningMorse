package EnglishAndMorse;

import java.util.Scanner;

public class EnglishAndMorseMain {

    public static void main(String[] args) {

        //Ett program som gör om morsekod till engelska och engelska till morsekod


        //Declare variables

        Scanner scan = new Scanner(System.in);
        String enteredWord;
        String myLanguage = new String();
        String[] myArray = new String[99];
        String[] myMorseArray = new String[99];
        String[] myEnglishArray = new String[99];

        //Get text to translate

        System.out.println("ÖVERSÄTTARE MELLAN ENGELSKA OCH MORSE");
        System.out.print("Skriv ett ord på antingen engelska eller morse som du vill översätta: ");
        enteredWord = scan.nextLine();

        //Check what language is used

        EnglishArray eng = new EnglishArray();
        //enteredWord = eng.toUpperCase(enteredWord);  //convert to capital letters
        enteredWord = enteredWord.toUpperCase();  //convert to capital letters

        try {
            myArray = eng.splitWord(enteredWord);                             //splits English word to an array of letters
            myLanguage = eng.checkLetter(myArray[0]);                         //checks if first position is an English letter or an * or -


            for (int i = 0; i < myArray.length; i++) {                        //print back the entered word
                if (!(myArray[i] == null)) {
                    System.out.print(myArray[i]);
                }
            }
            System.out.println(" ");

            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Ordet du skrev in var för långt.");
            } catch(Exception e) {
                System.out.println("Något gick fel.");
            }

        if (myLanguage == "English") {                                        //English to Morse
            System.out.print("Morsekoden är: ");
            
            //translates letter by letter

            for (int i=0;i<myArray.length;i++){                           
                myMorseArray[i] = eng.searchEnglish(myArray[i]);
                if (!(myMorseArray[i] == null)) {
                    System.out.print(myMorseArray[i] + " ");                //prints the Morse code
                }
            }

        } else{
            MorseArray morse = new MorseArray();
            myLanguage = morse.checkLetter(myArray[0]);

              if (myLanguage == "Morse") {                                 //Morse to English
                  System.out.print("Det engelska ordet är: ");

                  myArray = morse.splitMorse(enteredWord);
                  for (int i=0;i<myArray.length;i++){
                      myEnglishArray[i] = morse.searchMorse(myArray[i]);
                      if (!(myEnglishArray[i] == null)) {
                          System.out.print(myEnglishArray[i]);
                      }
                  }
                  if (myEnglishArray[0]==null){
                      System.out.println("Ordet hittades inte i tabellen.");
                  }
              }else {                                                                   //Neither English nor Morse
                System.out.println("Felaktig inmatning, försök igen.");
            }
        }
    }
}
