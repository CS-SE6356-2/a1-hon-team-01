package assignment;

public class Main {

    public static void main(String[] args) {
        new NamePrinter().printNames();
    }
}

class NamePrinter {
    /**
     * Prints the names of the group members separated by pluses.
     */
    public void printNames() {
        String separator = "+";

        String[] names = {
                "Antonio Mendiola,
                "Name 2",
                "Name 3"};

        System.out.println(String.join(separator, names));
    }
}