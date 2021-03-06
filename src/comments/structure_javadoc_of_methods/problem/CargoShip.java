/***
 * Excerpted from "Java By Comparison",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material,
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose.
 * Visit http://www.pragmaticprogrammer.com/titles/javacomp for more book information.
***/
package comments.structure_javadoc_of_methods.problem;

import java.util.Queue;
import java.util.Stack;

import general.Supply;

interface CargoShip {
    
    Stack<Supply> unload();

    /**
     * Loads {@link Supply}.
     *
     * @param supplies the supplies of type {@link Queue}
     * @return not loaded supplies of type {@link Queue}
     */
    Queue<Supply> load(Queue<Supply> supplies);

    int getRemainingCapacity();
}
