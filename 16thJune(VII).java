import java.util.ArrayList;
import java.util.List;
public class PascalTriangle {
    static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1);  // the 1st element will always be 0
        for(int i=1; i<numRows; i++){

            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = tri.get(i-1);

            //1st element of the row will always 1
            row.add(1);

            for(int j = 1; j<i; j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }

            //last element of the row will always 1
            row.add(1);
            tri.add(row);
        }

        return tri;

    }

    public static void main(String[] args) {
        List<List<Integer>> res = generate(5);
        System.out.println(res);
    }
}



// res = [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
