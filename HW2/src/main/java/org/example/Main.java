package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.

public static String getNewString(String s){
AAASSDDFFRRTGGBNHYUUU -> 3A2S2D2F2R1T2G1B1N1H1Y3U
**Добавить проверку
return null;
}

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Main
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "AAASSDDFFRRTGGBNHYUUU";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //напишите тут ваш код

        for(Character character : alphabet){
            int count = 0;
            for (String s : list)
            {
                for (int i = 0; i < s.length(); i++)
                {
                    if(s.charAt(i) == character)
                    {
                        count++;
                    }
                }
            }
            System.out.println(character + " " + count);
        }
    }

}