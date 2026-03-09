import java.util.*;;
class gusser{
    int gnum;

    int gussingNUm()
    {
        System.out.println("guss the number");
        Scanner scan = new Scanner(System.in);
        gnum = scan.nextInt();
        return gnum;
    }
}

class player{
    int pnum;
    
    int predictingNum()
    {
        System.out.println("Player, please predict a number.");
        Scanner scan = new Scanner(System.in);
        pnum = scan.nextInt();
        return pnum;

    }
}
class umpire {
    int pnum1;
    int pnum2;
    int pnum3;
    int gussnum;

    void collectingNumberFromGusser()
    {
        gusser g = new gusser();
        gussnum = g.gussingNUm();
    }
    
    void collectingNumberFromPlayer()
    {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

        pnum1 = p1.predictingNum();
        pnum2 = p2.predictingNum();
        pnum3 = p3.predictingNum();

    }

    void compare()
    {
        if (gussnum == pnum1)
        {
            System.out.println("congratulations player1 you won the game...!");
        }
        else if (gussnum == pnum2)
        {
            System.out.println("congratulations player2 you won the game...!");
        }
        else if (gussnum == pnum3)
        {
            System.out.println("congratulations player3 you won the game...!");
        }
        else 
        {
            System.out.println("oops..! No one won the game please try again");
        }
    }
}
public class gusserGameApplication{

    public static void main(String[] args) {
        umpire u = new umpire();
        u.collectingNumberFromGusser();
        u.collectingNumberFromPlayer();
        u.compare();
    }
    
}