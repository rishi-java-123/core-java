/*There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus  or . The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered  if they are safe or  if they must be avoided.

Example

Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices  and . They could follow these two paths:  or . The first path takes  jumps while the second takes . Return .
Hint : as initiatio0n think of it will always start from  0 and will always jump 2 until and unless on +2 position 1 is present
 */

package com.learning.java;

import java.util.List;

public class JumpingOnClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int jump = -1;
        int length=c.size();
        for(int i =0;i<length;){
            if (i+2 < length && c.get(i+2) == 0){
                i++;
            }
            i++;
            jump++;
        }
        return jump;
    }
}
