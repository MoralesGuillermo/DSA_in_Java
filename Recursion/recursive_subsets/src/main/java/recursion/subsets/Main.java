package recursion.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// {1, 2, 3, 4, 5}
// {1, 2, 3, 4, 5}
// {1, _, _, _}
// {1, _, _}
// {1, _}
// {1}
// {2, _, _, _}

public class Main {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        subsets(data, 0, new ArrayList<>(), res);

        for (ArrayList<Integer> subset : res) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void subsets(int[] data, int index, List<Integer> currentList, List<ArrayList<Integer>> res){
        if (index == data.length){
            res.add(new ArrayList<>(currentList));
            return;
        }
        // Include the number into the subset
        currentList.add(data[index]);
        subsets(data, index + 1, currentList, res);

        currentList.remove(currentList.size() - 1);
        subsets(data, index + 1, currentList, res);
        
    }
}