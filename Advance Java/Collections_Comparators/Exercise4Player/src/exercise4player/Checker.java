/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4player;

import java.util.Comparator;

/**
 *
 * @author sunil
 */
    class Checker implements Comparator<Player> {

  @Override
  public int compare(Player p1, Player p2) {
    if (p1.Score < p2.Score) {
      return 1;
    } else if (p1.Score > p2.Score) {
      return -1;
    } else {
      return p1.Name.compareTo(p2.Name);
    }
  }
}
