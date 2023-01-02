package org.week4.day12;

public class JavaStringQuestions1 {
    /**
     * 1- Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
     * Examples :
     * "Clarusway" → "ayayay"
     * "Florida" → "dadada"
     * "Hi" → "HiHiHi"
     */
public static void main(String[] args ) {
    String str =  "Clarusway";
    String s=str.substring(str.length()-2,str.length());
    System.out.println(s+s+s);



     /** 2- Given a string, return true if it’s ending with ‘a’. Otherwise return false. The string length will be at least 2.
     * Examples :
     * Apple –> false
     * Canada –> true
      * */
     String str1 = "Canada";
    System.out.println(str1.endsWith("a"));


     /** 3- Given a string, return the first index number of ‘a’. If there is no ‘a’ return -1.
     * Examples :
     * “Washington” → 1
     * “New York” → -1
     * “America” → 0
      */
    String str2 = "Washington";
    if (str2.contains("a"))
        System.out.println(str2.indexOf("a"));
    else {
        System.out.println(-1);
    }
     /** 4- Given a string, replace all is with was.
     * Examples :
     * “My name is Rajendra. My name is lamror. My name is Technolamror." →
      * “My name was Rajendra. My name was lamror. My name was Technolamror."
      */
    String str3 = "My name is Rajendra. My name is lamror. My name is Technolamror.";
    String replaceString=str3.replace("is","was");
    System.out.println(replaceString);


     /** 5- Given a string, remove the spaces between words.
     * Examples :
     * “My name is Arthur. I am 20 years old.” →”MynameisArthur.Iam20yearsold.”
      */
    String str4 = "My name is Arthur. I am 20 years old.";
    str4 = str4.replaceAll("\\s","");
    System.out.println(str4);


     /** 6- Given a string, split it from ‘:’ and return the new string.
      * If there is no ‘:’ return “There is no ‘:’ in the string”.
     * Examples :
     * “Name : Daniel” → “NameDaniel”
     * “My name is Deniel” → “There is no ‘:’ in the string”
      */
   String newStr = "Name : Daniel";
   String newStr1 = "My name is Daniel";
   String [] result1 = newStr.split(":");
   for(int i=0; i<=result1.length-1 ; i++) {
       System.out.print(result1[i].trim());
   }
    System.out.println();
   for(int i=0; i<newStr1.length() ; i++) {
       if(newStr1.charAt(i)!=':')
           System.out.println("There is no':' in the string");
   }

     /** 7- Given a string, return the new string after converting all char in string lower case.
     * Examples :
     * “New York City” → “new york city”
      */
    String str6 = "New York City";
    String s2 = str6.toLowerCase();
    System.out.println(s2);
     /** 8- Given a string, return the new string after converting all char in string UPPER case.
     * Examples :
     * “New York City” → “NEW YORK CITY”
      */
    String str7 = "New York City";
    String strup = str7.toUpperCase();
    System.out.println(strup);
     /** 9- Given a string, return the length of the string.
     * Examples :
     * “Clarusway SDET Course” → “The String length is 22”
     * “New York” → The String length is 8”
      */
    String str8 = "Clarusway SDET Course";
    int length = str8.length();
    System.out.println("String length is :" + str8.length());

     /** 10- Given 3 or 4 strings, return the new string after concatenation.
     * Examples :
     * New
     * York
     * City
     * → “New York City”
     * My
     * Name
     * Is
     * Alex
     * → “My name is Alex”
     */
     String word1 = "New ";
    String word2 = "York ";
    String word3 = "City";
    String Strnew = word1.concat(word2 + word3);
    System.out.println(Strnew);

    String word4 = "My ";
    String word5 = "name ";
    String word6 = "is ";
    String word7 = "Alex";
    String Strnew1 = word4.concat(word5 + word6 + word7);
    System.out.println(Strnew1);
     }
}
