/*
 * Create the Player class having fields:  Name (String) and Score (integer).Given an array of n Player objects, write a comparator that sorts them in order of decreasing Score. If one or more players have the same Score, sort those players alphabetically by Name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method  implementing the Comparator.compare(T o1, T o2) method.
 */
package exercise4player;
import java.util.*;
/**
 *
 * @author sunil
 */
public class Exercise4Player {


    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. Of Players : ");
        int n = sc.nextInt();
        List<Player> pl= new ArrayList<Player>(n);//declaring list n no. of of players 
        for (int i = 0; i < n; i++) {
            pl.add(i,new Player(sc.next(),sc.nextInt()));
        }
        sc.close();
        
        Checker ch = new Checker();//Checker Class instance
        
        Collections.sort(pl,ch);
        
        System.out.println("Player After Sorting :");
        for (int i = 0; i < n; i++) {
            System.out.println(pl.get(i).Name+" "+pl.get(i).Score);
        }
    }

   

}
