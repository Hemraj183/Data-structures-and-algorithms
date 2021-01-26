package assignment;

public class LinearSearchString {

    /*
        search name from names, return its index if found, otherwise return -1
     */
    public static int search(String[] names, String name) {
        // should be done by student
        int len = names.length;
        for (int i = 0; i < len; ++i) {
            if (names[i].equals(name)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] names = {"Ram", "Hari", "Shyam", "Raju", "Raj", "John", "Sita", "Gita",
                           "Roshan", "Josh", "Mike", "Alpha", "Lion", "Leo", "Covid"};
        String[] toBeSearched = {"Josh", "Covid", "Shyam", "Rita", "Sita", "Cena"};
        for (int i = 0; i < toBeSearched.length; ++i) {
            int index = search(names, toBeSearched[i]);
            if (index == -1) {
                System.out.println(toBeSearched[i] + " not found!");
            } else {
                System.out.println(toBeSearched[i] + " found at: " + index);
            }
        }

    }
}
