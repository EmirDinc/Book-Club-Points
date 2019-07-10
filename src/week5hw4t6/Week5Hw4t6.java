package week5hw4t6;

import java.util.Scanner;

public class Week5Hw4t6 {
    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        int books;
        int points = 0;
        
        System.out.print("Please enter the number of books purchased this month: ");
        books = keyIn.nextInt();
        
        if(books < 0){
            System.out.println("Try Again.");
        } else{
        switch(books){
            case 0:
                points = 0;
                break;
            case 1:
                points = 5;
                break;
            case 2:
                points = 15;
                break;
            case 3:
                points = 30;
                break;
            default:
                points = 60;
                break;
        }
        }   
        System.out.println("You recieved " + points + " points this month!");
    }
    
}
