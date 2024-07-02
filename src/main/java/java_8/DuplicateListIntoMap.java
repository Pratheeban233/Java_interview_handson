package java_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateListIntoMap {
    public static void main(String[] args) {
        List<Notes> noteList = new ArrayList<>();
        noteList.add(new Notes(1, "note1", 11));
        noteList.add(new Notes(2, "note2", 22));
        noteList.add(new Notes(3, "note3", 33));
        noteList.add(new Notes(4, "note4", 44));
        noteList.add(new Notes(5, "note5", 55));
        noteList.add(new Notes(6, "note4", 66));


        /*
        convert a List of objects into a Map by considering
        duplicated keys and store them in sorted order?
         */

        noteList
                .stream()
                .sorted(Comparator.comparing(Notes::getN3).reversed())
                .collect(Collectors.toMap(Notes::getN2, Notes::getN3,
                        (oldObj, newObj) -> newObj, LinkedHashMap::new))
                .forEach((key, value) -> System.out.println(key + " : " + value));

    }
}

class Notes {
    int n1;
    String n2;
    int n3;

    public Notes(int i, String note1, int i1) {
        this.n1 = i;
        this.n2 = note1;
        this.n3 = i1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
}