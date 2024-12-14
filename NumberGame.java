import java.util.*;

class NumberGame{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    Random rd=new Random();
    int guesses=5;
    System.out.println("--------------Welcome to Game-------------");
    int com=rd.nextInt(100);
    System.out.println("     Guess the number between 1 to 100    ");
    System.out.println("    Be careful, you only have 5 guesses   ");
    int user=sc.nextInt();
    while(user!=com && guesses>0){
        guesses=guesses-1;
        if(user>com){
            System.out.println("Too high");
        }
        if(user<com){
            System.out.println("Too low");
        }
        System.out.println("Guess Again");
        user=sc.nextInt();
        
    }if(guesses==0 && com!=user){
        System.out.println("Game Over");
    }
    if(user==com){
        System.out.println("You Won");
    }
    sc.close();
}  
}
