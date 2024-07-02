package logical;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FindSequenceOfNumbers {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 6, 1, 8, 9, 10, 5, 7, -3, -2, -1};

        List<List<Integer>> seqLists = new ArrayList<>();
        List<Integer> seq = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];

            if (next - current == 1) {
                if (seq.isEmpty()) {
                    seq.add(current); // Add the start of the sequence
                }
                seq.add(next);
            } else {
                if (!seq.isEmpty()) {
                    seqLists.add(seq); // Add the complete sequence to the list
                    seq = new ArrayList<>(); // Start a new sequence
                }
            }
        }

// Check if there is a sequence at the end of the array
        if (!seq.isEmpty()) {
            seqLists.add(seq);
        }

        for (List<Integer> sequence : seqLists) {
            System.out.println(sequence);
        }


    }
}
