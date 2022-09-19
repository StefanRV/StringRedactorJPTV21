/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringredactorjptv21;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class StringRedactorJPTV21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====StringEdit====");
        System.out.println("Enter text in English: ");
        int counter = 0;
        String str = scanner.nextLine();
        OUTER:
        do {
            System.out.println("Choose number of function: ");
            System.out.println("0. Exit programm");
            System.out.println("1. Number of symbols in text");
            System.out.println("2. Number of words in text");
            System.out.println("3. Find substring in text");
            System.out.println("4. Replace substring on other substring");
            int numberFun = scanner.nextInt();
            Scanner scan = new Scanner(System.in);
            Scanner sym = new Scanner(System.in);
            Scanner rep = new Scanner(System.in);
            
            switch (numberFun) {
                case 0:
                    System.out.println("Goodbye");
                    break OUTER;
                case 1:
                    System.out.println("You have chosen function 1");
                    char[] strChar = str.toCharArray();
                    System.out.println("Number of chars: " + strChar.length);
                    break;
                case 2:
                    System.out.println("You have chosen function 2");
                    String[] words = str.split(" ");
                    for (String word: words){
                        counter +=1;
                        System.out.println(counter);
                    }
                    break;
                case 3:
                    System.out.println("You have chosen function 3");
                    String numSub = scan.nextLine();
                    int index = str.indexOf(numSub);
                    index++;
                    if(index == 0){
                        System.out.println("No such line in text");
                    }
                    else{
                        System.out.println("It lies in" + index + "position");
                    }
                    System.out.println(index);
                    break;
                case 4:
                    String sy = sym.nextLine();
                    String re = rep.nextLine();
                    System.out.println("You have chosen function 4");
                    String str2 = str.replace(sy, re);
                    System.out.println("Chanded line is: "+ str2);
                    
                    break;
                default:
                    break;
            }
            
            
            counter = 0;
            System.out.println("----------------------------");
        } while (true);
    }
    
}
