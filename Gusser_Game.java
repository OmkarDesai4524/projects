package Z_Projects;

import java.util.Scanner;

class Gusser{
    int GusserNum;
    @SuppressWarnings("resource")
    public int GusserNumb(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gusser kindly guess a number : ");
        GusserNum = scanner.nextInt();
        return GusserNum;
    }
}

class Player{
    int PlayerrNum;
    @SuppressWarnings("resource")
    public int PlayerNumb(){
        Scanner scanner = new Scanner(System.in);
        PlayerrNum = scanner.nextInt();
        return PlayerrNum;
    }
}

class umpire{
    int Gussernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;
    
    public void CollectNumFromGusser(){
        Gusser Gu = new Gusser();
        Gussernum = Gu.GusserNumb();
    }

    public void CollectNumFromPlayer(){
        System.out.print("Player1 guess your number : ");
        Player P1 = new Player();
        Playernum1 = P1.PlayerNumb();

        System.out.print("Player2 guess your number : ");
        Player P2 = new Player();
        Playernum2 = P2.PlayerNumb();
        
        System.out.print("Player3 guess your number : ");
        Player P3 = new Player();
        Playernum3 = P3.PlayerNumb();
        
    }

    public void compare(){
        if(Gussernum == Playernum1){
            if(Gussernum == Playernum2 && Gussernum == Playernum3){
                System.out.println("All players won the game");
            }

            else if(Gussernum==Playernum2){
                System.out.println("Player1 and Player2 won the game");
            }

            else if(Gussernum==Playernum3){
                System.out.println("Player1 and Player3 won the game");
            }
            else{
                System.out.println("Only Player1 won the game");
            }
        }

        else if(Gussernum == Playernum2){
            if(Gussernum == Playernum3){
                System.out.println("Player2 and Player3 won the game");
            }
            else{
                System.out.println("Only player 2 won the game");
            }
        }

        else if(Gussernum == Playernum3){
            System.out.println("Only player3 won the game");
        }

        else{
            System.out.println("All players lost the game");
        }
    }
}
class Gusser_Game{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("------Game Started------");
        System.out.println();
        umpire um = new umpire();
        um.CollectNumFromGusser();
        um.CollectNumFromPlayer();
        um.compare();
        System.out.println();
        System.out.println("-----Game over-----");
        
    }

}