import java.util.*;
import java.io.*;
public class PokemonBattle {
    public static void main(String[]args) {
        Random rand=new Random();
        int rc=0,p1mp,p1as,p2mp,p2as,p1hp,p2hp,p1wt=0,p2wt=0;
        String pokemon,move;
        Scanner console=new Scanner(System.in);
        System.out.println("Enter Rounds Desired: ");
        rc=Integer.parseInt(console.nextLine());
        System.out.println();

        for(int i=1; i<=rc;i++) {
            System.out.printf("Round %d\n",i);
            System.out.println("Player One: Select Pokemon and Enter stats");
            System.out.println("Enter Pokemon Name: ");
            pokemon=console.nextLine();
            System.out.println("Enter HP: ");
            p1hp= Integer.parseInt(console.nextLine());
            System.out.println("Enter Move: ");
            move= console.nextLine();
            System.out.println("Enter Move Power: ");
            p1mp=Integer.parseInt(console.nextLine());
            System.out.println("Enter Attack Speed");
            p1as= Integer.parseInt(console.nextLine());
            System.out.println();
            //rc++;
            System.out.printf("Round %d\n",i);
            System.out.println("Player Two: Select Pokemon and Enter stats: ");
            System.out.println("Enter Pokemon Name: ");
            pokemon=console.nextLine();
            System.out.println("Enter HP");
            p2hp=Integer.parseInt(console.nextLine());
            System.out.println("Enter Move: ");
            move= console.nextLine();
            System.out.println("Enter Move Power: ");
            p2mp=Integer.parseInt(console.nextLine());
            System.out.println("Enter Attack Speed: ");
            p2as= Integer.parseInt(console.nextLine());
            for(int j=0;j<1;j++) {
                if (p1as>p2as)
                {
                    p2hp = p2hp - p1mp;
                    if (p2hp <= 0) {
                        System.out.println("Player One Wins!");
                        ++p1wt;
                    }
                    p1hp = p1hp - p2mp;
                    if (p1hp <= 0) {
                        System.out.println("Player Two Wins!");
                        ++p2wt;
                    }

                }
                else if (p2as>p1as) {
                    p1hp = p1hp - p2mp;
                    if (p1hp <= 0) {
                        System.out.println("Player Two Wins!");
                        ++p2wt;
                    }
                    p2hp = p2hp - p1mp;
                    if (p2hp <= 0) {
                        System.out.println("Player One Wins!");
                        ++p1wt;
                    }
                }
                else {
                    int dr=rand.nextInt(2);
                    if(dr==0)
                    {
                        p2hp = p2hp - p1mp;
                        if (p2hp <= 0) {
                            System.out.println("Player One Wins!");
                            ++p1wt;
                        }
                        p1hp = p1hp - p2mp;
                        if (p1hp <= 0) {
                            System.out.println("Player Two Wins!");
                            ++p2wt;
                        }
                    }

                    else {
                        p1hp = p1hp - p2mp;
                        if (p1hp <= 0) {
                            System.out.println("Player Two Wins!");
                            ++p2wt;
                        }
                        p2hp = p2hp - p1mp;
                        if (p2hp <= 0) {
                            System.out.println("Player One Wins!");
                            ++p1wt;
                        }
                    }
                }

            }



                }
        System.out.printf("\nPlayer One Total Score: %d ",p1wt);
        System.out.printf("\nPlayer Two Total Score: %d ",p2wt);
        if(p1wt>p2wt) {
            System.out.println("\nPlayer One Wins! ");
        }
        else {
            System.out.println("\nPlayer Two Wins! ");
        }

    }




        }




