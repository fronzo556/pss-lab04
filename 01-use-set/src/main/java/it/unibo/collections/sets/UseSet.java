package it.unibo.collections.sets;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
      TreeSet<String> set = new TreeSet<>();

        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        for (int i = 1; i <= ELEMS; i++) {
            set.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        /*
 * 3) Prints its content using StringBuilder
 */
StringBuilder sb = new StringBuilder();
sb.append("Set iniziale: [");

for (String s : set) {
    sb.append(s).append(", ");
}

// Rimuove l’ultima virgola e spazio
if (!set.isEmpty()) {
    sb.setLength(sb.length() - 2);
}

sb.append("]");
System.out.println(sb.toString());

        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
        String element = iterator.next();
        int number = Integer.parseInt(element);
        if (number % 3 == 0) {
        iterator.remove();
    }
}


        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        /*
 * 5) Prints the content of the Set using a for-each construct (with StringBuilder)
 */
StringBuilder sb2 = new StringBuilder();
sb2.append("Set dopo la rimozione dei multipli di 3: [");

for (String s : set) {
    sb2.append(s).append(", ");
}

if (!set.isEmpty()) {
    sb2.setLength(sb2.length() - 2);
}

sb2.append("]");
System.out.println(sb2.toString());

        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean allEven = true;
for (String s : set) {
    int number = Integer.parseInt(s);
    if (number % 2 != 0) {
        allEven = false;
        break;
    }
}
System.out.println("Tutti i numeri rimanenti sono pari? " + allEven);

    }
}
