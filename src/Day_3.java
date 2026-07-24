import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Day_3 {

    public static void main(String[] args) {

        ArrayList<lib_items> list = new ArrayList<>();
        HashMap<String, lib_items> map = new HashMap<>();
        HashSet<String> authors = new HashSet<>();

        Library lib = new Library("Public Library", list);

        for (int i = 1; i <= 250; i++) {
            Book b = new Book(
                    "Book " + i,
                    "Author " + (i % 20),
                    String.format("BK%04d", i),
                    i % 2 == 0
            );

            list.add(b);
            map.put(b.getSr_no(), b);
            authors.add(b.getAuthor());
        }

        for (int i = 1; i <= 250; i++) {
            Novel n = new Novel(
                    "Novel " + i,
                    "Author " + (i % 20),
                    String.format("NV%04d", i),
                    i % 2 != 0
            );

            list.add(n);
            map.put(n.getSr_no(), n);
            authors.add(n.getAuthor());
        }

        System.out.println("Total Items : " + list.size());
        System.out.println("Unique Authors : " + authors.size());

        lib_items removed = map.remove("BK0100");
        if (removed != null) {
            list.remove(removed);
            System.out.println("BK0100 Removed.");
        }

        String search = "NV0200";
        boolean found = false;

        /*
         * Slow Search (O(n))
         * Checks every item one by one.
         * Faster way: HashMap because lookup by key is O(1) on average.
         */

        for (lib_items item : list) {

            if (item instanceof Book) {
                Book b = (Book) item;
                if (b.getSr_no().equals(search)) {
                    b.ShowDetail();
                    found = true;
                    break;
                }
            }

            if (item instanceof Novel) {
                Novel n = (Novel) item;
                if (n.getSr_no().equals(search)) {
                    n.ShowDetail();
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Item Not Found");
        }

        System.out.println("\nHashMap Search");

        lib_items item = map.get(search);

        if (item != null) {
            item.ShowDetail();
        } else {
            System.out.println("Item Not Found");
        }
    }
}