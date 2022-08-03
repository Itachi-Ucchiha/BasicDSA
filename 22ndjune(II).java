import java.util.HashMap;

public class rough {
  static public int[] kWeakestRows(int[][] mat, int k){
  // static public HashMap<Integer,Integer> kWeakestRows(int[][] mat, int k){
    int[] output = new int[k];
    int[] count = new int[mat.length];
    for(int i=0; i<mat.length; i++){
      int count_soldiers = 0;
      for(int j =0; j<mat[0].length; j++){
        if(mat[i][j]==1){
          count_soldiers+=1;
        }
      }
      count[i]=count_soldiers;
    }
    HashMap<Integer, Integer> hm = new HashMap<>();
    for(int i = 0; i<count.length; i++){
      hm.put(i,count[i]);
    }
    for(int i =0; i<k; i++){
      int min = Integer.MAX_VALUE;
      int index = 0;
      for(int j =0; j<hm.size()+i; j++){
        if(hm.containsKey(j) && hm.get(j)<min){
          min = hm.get(j);
          index = j;
        }
      }
      output[i]=index;
      hm.remove(index);
    }

    return output;
  }

   

  public static void main(String[] args) {
    int [][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
    int k = 3;
    int[] res = kWeakestRows(mat, k);
    for(int i : res){
      System.out.println(i);
    }
  }


//   Output: [2,0,3]
// Explanation: 
// The number of soldiers in each row is: 
// - Row 0: 2 
// - Row 1: 4 
// - Row 2: 1 
// - Row 3: 2 
// - Row 4: 5 
// The rows ordered from weakest to strongest are [2,0,3,1,4].
}
