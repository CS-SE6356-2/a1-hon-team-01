package assignment;

public class Main {

    public static void main(String[] args) {
        new NamePrinter().printNames();
    }
}

class NamePrinter {
    /**
     * Prints the names of the group members separated by dashes.
     */
    public void printNames() {
        String separator = "-";

        String[] names = {
                "Antonio Mendiola",
                "Ben Grawe",
                "Name 3"};

        System.out.println(String.join(separator, names));
    }
}