import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 1642. Furthest Building You Can Reach*
 * You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
 *
 * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
 *
 * While moving from building i to building i+1 (0-indexed),
 *
 * If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
 * If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
 * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.*
 */
public class FurtherstBuilding {
  public int furthestBuilding(int[] heights, int bricks, int ladders) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    for (int i=0; i<heights.length-1; i++) {
      if (heights[i] >= heights[i+1]) continue;
      bricks -= heights[i+1] - heights[i];
      pq.add(heights[i+1] - heights[i]);

      if (bricks < 0) {
        bricks += pq.poll();
        if (ladders > 0) ladders--;
        else return i;
      }
    }

    return heights.length - 1;
  }
}
