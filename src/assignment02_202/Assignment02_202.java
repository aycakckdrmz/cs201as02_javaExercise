/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment02_202;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ayca
 */
public class Assignment02_202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("                ***** Welcome to Assigment 2 Menu *****");
        System.out.println(" ");
        System.out.println("Please enter the number you want to display :)  ");
        System.out.println("    1. Get Integer");
        System.out.println("    2. Get String");
        System.out.println("    3. Game Pig");
        System.out.println("    4. Rock Paper Scissors Lizard Spock ");
        System.out.println("    5. Brute Triples - Pythagorean ");
        System.out.println("    6. Better Way to do 5 ");
        int menuChoice = (int) getInt("Please enter the number you want to display :)  ",0, 7);
        switch(menuChoice){
            case 1:
                long test = getInt("Please enter a valid positive integer:    ", 0, Integer.MAX_VALUE);
                System.out.println(" Welcome " + test );
                break;
            case 2:
                String test2 = getString("Please enter a string:    ");
                break;
            case 3:
                pig ();
                break;
            case 4:
                RPSLS();
                break;
            case 5: 
                bruteTriples();
                break;
            case 6:
                effectiveBT ();
                break; 
            default:
                System.out.println(" Oops! I cannot go with that value you've entered. Try again later! \\o/ ");
        }    
    }
    public static void RPSLS(){
        
        int compScore = 0;
        int userScore=0; 
        int tieTimes=0; 
        int round =0; 
        boolean keepPlay = false; 
        Scanner input = new Scanner(System.in);
        Random rand = new Random ();
        //Rock = 1 Paper = 2 Spock = 3 Lizard = 4 Scissors = 5
        while(keepPlay == false){
        startScreenRPS();
        int compChoice = rand.nextInt(5)+1; 
        int userChoice = input.nextInt();
        if(((compChoice==1)&&(userChoice ==5))||((compChoice==5)&&(userChoice ==1)))
        {                                                                               //Rock & Scissors
            System.out.println("Rock crushes Scissors!! "); 
            if(compChoice==1)
            {
                System.out.println("Oops! Get crushed huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println("Yaaay!! You won! Crush this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==1)&&(userChoice ==4))||((compChoice==4)&&(userChoice ==1)))
        {                                                                               //Rock & Lizard
            System.out.println("Rock crushes Lizard!! "); 
            if(compChoice==1)
            {
                System.out.println("Oops! Get crushed huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println("Yaaay!! You won! Crush this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==2)&&(userChoice ==1))||((compChoice==1)&&(userChoice ==2)))
        {                                                                               //Paper & Rock
            System.out.println("Paper covers Rock!! "); 
            if(compChoice==2)
            {
                System.out.println("Oops! Get covered huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println("Yaaay!! You won! Cover this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==3)&&(userChoice ==1))||((compChoice==1)&&(userChoice ==3)))
        {                                                                              //Spock & Rock
            System.out.println("Spock vaporizes Rock!! "); 
            if(compChoice==3)
            {
                System.out.println("Oops! Get vaporized huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println("Yaaay!! You won! Vaporize this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==5)&&(userChoice ==2))||((compChoice==2)&&(userChoice ==5)))
        {                                                                              //Scissors & Paper
            System.out.println("Scissors cuts Paper!! "); 
            if(compChoice==5)
            {
                System.out.println("Oops! Get cut huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Cut this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==5)&&(userChoice ==4))||((compChoice==4)&&(userChoice ==5)))
        {                                                                             //Scissors & Lizard
            System.out.println("Scissors decapitates Lizard!! "); 
            if(compChoice==5)
            {
                System.out.println("Oops! Get decapitated huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Decapitate this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==3)&&(userChoice ==5))||((compChoice==5)&&(userChoice ==3)))
        {                                                                              //Spock & Scissors 
            System.out.println("Spock smashes Scissors!! "); 
            if(compChoice==3)
            {
                System.out.println("Oops! Get smashed huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Smash this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==4)&&(userChoice ==2))||((compChoice==2)&&(userChoice ==4)))
        {                                                                              //Lizard & Paper
            System.out.println("Lizard eats Paper!! "); 
            if(compChoice==4)
            {
                System.out.println("Oops! Get eaten huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Eat this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==4)&&(userChoice ==3))||((compChoice==3)&&(userChoice ==4)))
        {                                                                              //Lizard & Spock
            System.out.println("Lizard poisons Spock!! "); 
            if(compChoice==4)
            {
                System.out.println("Oops! Get poisoned huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Poison this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if(((compChoice==2)&&(userChoice ==3))||((compChoice==3)&&(userChoice ==2)))
        {                                                                              //Lizard & Paper
            System.out.println("Paper disproves Spock!! "); 
            if(compChoice==2)
            {
                System.out.println("Oops! Get eaten huh? *** Computer Wins *** ");
                compScore++;
            }
            else
            {
                System.out.println(" Yaaay!! You won! Eat this computer up!  *** User Wins *** "); 
                userScore++;
            }
        }
        else if (compChoice==userChoice)
        {
            System.out.println("Oh, look computer got the same. We have a tie! ");
            tieTimes++;
        }
        else 
        System.out.println("Oops! you did something wron please try again :) ");
        round++;
        
        scoreRPS (userScore, compScore, tieTimes);
        keepPlay = endGameRPS(round, userScore, compScore, tieTimes);
        }
    }
    public static void scoreRPS (int us, int com, int t){
        System.out.println(" ");
        System.out.println(" SCORES:    ");
        System.out.println("         Player  : " + us + " times won! " );
        System.out.println("         Computer: " + com+ " times won! ");
        System.out.println("         P & C   : " + t + " times tied! " );
        System.out.println(" ");
        System.out.println(" ");
    }
    public static void startScreenRPS (){
        System.out.println(" ");
        System.out.println("    |   Rock   |   Paper    |     Spock    |    Lizard   |   Scissors");
        System.out.println("    |    1     |     2      |       3      |      4      |      5    ");
        System.out.println(" "); 
        System.out.println(" Let's Game! ");
        System.out.println(" Rock, paper, spock, lizard, scissors? Enter the number of the one you choose please :) ");
    }
    public static boolean endGameRPS( int round, int pl, int com, int t){
        Scanner input = new Scanner (System.in);
        boolean keepPlay = false;
        System.out.println(" Keep playing? Enter 'Y' or press any other key to exit! :)  "); 
        char roundwish = input.next().charAt(0);
        if (roundwish=='y' || roundwish=='Y'){
            keepPlay = false;
        }
         else  
        {
            keepPlay = true;
            System.out.println(" GAME ENDED! ");
            System.out.println(" Round played:    "+ round );
            System.out.println(" ");
            System.out.println("                    FINAL SCORES:  ");
            System.out.println("                                        Player  : " + pl+ " times won! " );
            System.out.println("                                        Computer: " + com + " times won! ");
            System.out.println("                                        P & C   : " + t + " times tied! " );
            System.out.println(" ");
            if (com < pl)
                System.out.println("                     Congrats Player! You won!!! \\o/  ");
            else if (pl < com)
                System.out.println("                     Computer won!!! \\o/  ");
            else if (com == pl)
                System.out.println("                     Super balance! We have 2 winners!!   ");
            }     
        return keepPlay;
    }
    public static int RollDie( int sides) {
         Random randomizer = new Random();
         int randomNum = randomizer.nextInt(sides)+1;
         return randomNum;
          }
    public static void pig ( ){
        int p1Score = 0; 
        int p2Score = 0; 
        boolean exit = false;
        System.out.println("  ");
        System.out.println("                     Welcome to Pig Game ");   
        System.out.println("  ");
        System.out.println("  ");
        do{ //main game loop            3
            p1Score = p1Score + onePlayerGame(1, p1Score, p2Score, exit );
            scoreScreen(p1Score, p2Score);
            p2Score = p2Score+ onePlayerGame(2, p2Score, p1Score, exit );
            if(p2Score>100 || p1Score>100)
            {
                exit = true;
                break;
            }
            exit = quitPigGame();
            if (exit == true)
                break;
        }while ( exit == false );       
        endGamePig(p1Score, p2Score);       
    }
    public static int onePlayerGame ( int oneortwo, int pl1, int pl2, boolean flag){ 
            int roll = 0;
            int turnScore = 0;
            while(pl1<100 && pl2<100){ //p2's loop
                char instore = getString(" Player "+ oneortwo + ":      'H' to hold or any other key to roll the die :) " ).charAt(0);
                roll = RollDie(5);
                if (instore == 'e' || instore =='E'){
                    flag = true;
                    break;
                }
                else if (instore == 'h' || instore == 'H')
                    break;
                if (roll==1)
                {
                    turnScore = 0;
                    System.out.println("Oops! Rolled 1 :( Switch turnes! ");
                    break;
                }
                else 
                {
                    System.out.println("Oh look Player "+ oneortwo + ":, you've rolled " + roll + "!!");
                    turnScore = turnScore + roll;
                }
                System.out.println("  ");
                System.out.println("Score from this turn: " + turnScore);
                System.out.println("  ");
            }
        return turnScore;
    }
    public static boolean quitPigGame(){
            boolean flag = false;
            char instore = getString(" Press 'E' to exit" ).charAt(0);
            if (instore == 'e' || instore =='E')
                    flag = true;
            
            return flag;
    }
    public static void scoreScreen (int a, int b){
                System.out.println(" ");
                System.out.println(" SCORES:    ");
                System.out.println("         Player 1: " + a );
                System.out.println("         Player 2: " + b );
                System.out.println(" ");
    }
    public static void endGamePig ( int a, int b){
        System.out.println(" GAME ENDED! ");
        System.out.println(" ");
        System.out.println("                    FINAL SCORES:  ");
        System.out.println("                                   Player 1: " + a );
        System.out.println("                                   Player 2: " + b);
        System.out.println(" ");
        if ( a > b )
            System.out.println("  Congrats Player 1! You won!!! \\o/  ");
        else if ( b > a )
            System.out.println("  Congrats Player 2! You won!!! \\o/  ");
        else if ( a == b )
            System.out.println("  Super balance! We have 2 winners!!   ");   
    }
    public static long getInt(String output, long a, long b)
    {
        boolean check = false;
        long userNum = 0;
        Scanner input = new Scanner (System.in);
        System.out.println(output);
        userNum = input.nextLong();
        while  (check == false){
        if (userNum<=a || userNum>b )
        {
            System.out.print("Nope! Not a valid integer. ");
            System.out.println(output);
            userNum = input.nextLong(); //so we can accept bigger values          
        }
        else if (userNum>a && userNum<b)
            check = true;
        else 
            System.out.print(" Invalid input!!  ");
        }
        return userNum;
    }
    public static String getString(String output)
    {
        String userInput = " ";
        Scanner input = new Scanner (System.in);
        System.out.println(output);
        userInput = input.nextLine();
        return userInput;
    }
    public static void bruteTriples (){
        int userN = 0;
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter the limit integer:  " );
        userN= input.nextInt();
        for (int i=1; i<userN; i++)
        {
            for(int j=1; j<userN; j++)
            {
                for(int k=1; k<userN; k++)
                {
                    if(k*k==j*j+i*i && j>i) 
                        System.out.println( k+", "+j+", "+i );   
                }
            }
        }
    }
    public static void effectiveBT (){ 
        int userN; int m=1; int n=1;
        //a=m*m-n*n   b=2mn   c=m*m+n*n
        Scanner input = new Scanner (System.in);
        System.out.println(" Please enter the limit integer:  " );
        userN= input.nextInt();
        int hip = 0;
        int b= 0; 
        int a =0;          
        for ( m=1; hip <userN; m++)
        {        
            for ( n=1; hip <userN; n++)
            {
                hip = m*m+n*n;
                b=2*m*n;
                a= Math.abs(m*m-n*n);
                if ((hip*hip == b*b + a*a) && (m!=n ) && hip<userN )
                    System.out.println( hip+", "+b+", "+a );
            }
        }
    }
}

