package EnglishAndMorse;

import java.util.HashMap;

import static java.lang.String.valueOf;

public class EnglishArray {

    private HashMap<String,String> eng = new HashMap<>();

    //constructor
    public EnglishArray() {
        eng.put("A","*-");
        eng.put("B","-***");
        eng.put("C","-*-*");
        eng.put("D","-**");
        eng.put("E","*");
        eng.put("F","**-*");
        eng.put("G","--*");
        eng.put("H","****");
        eng.put("I","**");
        eng.put("J","*---");
        eng.put("K","-*-");
        eng.put("L","*-**");
        eng.put("M","--");
        eng.put("N","-*");
        eng.put("O","---");
        eng.put("P","*--*");
        eng.put("Q","--*-");
        eng.put("R","*-*");
        eng.put("S","***");
        eng.put("T","-");
        eng.put("U","**-");
        eng.put("V","***-");
        eng.put("W","*--");
        eng.put("X","-**-");
        eng.put("Y","-*--");
        eng.put("Z","--**");
        eng.put("1","*----");
        eng.put("2","**---");
        eng.put("3","***--");
        eng.put("4","****-");
        eng.put("5","*****");
        eng.put("6","-****");
        eng.put("7","--***");
        eng.put("8","---**");
        eng.put("9","----*");
        eng.put("0","-----");
        eng.put(".","*-*-*-");
        eng.put(",","--**--");
        eng.put("?","**--**");
    }


    public String[] splitWord(String s) {
        String[] myTab = new String[99];
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            myTab[i] = String.valueOf(c);
        }
        return myTab;

    }
    public String checkLetter(String s) {
        String test = eng.get(s);
        if (!(test == null)){
            test = "English";
        }
        return test;

    }
    public String searchEnglish (String s) {
        return eng.get(s);
    }
}
