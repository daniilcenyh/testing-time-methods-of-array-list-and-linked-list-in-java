import java.util.LinkedList;
import java.util.Objects;

public class LinkedListMethodTimeTesting {

    private final LinkedList<Integer> linkedList;
    private final int rightDiapason;
    private final int leftDiapason;

    public LinkedListMethodTimeTesting(LinkedList<Integer> linkedList, Integer leftDiapason, Integer rightDiapason) {
        this.linkedList = linkedList;
        this.leftDiapason = Objects.requireNonNullElse(leftDiapason, 0);
        this.rightDiapason = Objects.requireNonNullElse(rightDiapason, 1000);

    }

    public String testMethodAdd(int countIteration) {
        var startTime = System.nanoTime();
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.linkedList.add(index, randomElement);
        }
        var endTime = System.nanoTime();
        this.linkedList.clear();
        return """
                --------------------------------------------
                LinkedList method - ADD by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }

    public String testMethodDelete(int countIteration) {
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.linkedList.add(index, randomElement);
        }

        var startTime = System.nanoTime();
        for (int index = countIteration - 1; index > 0; index--) {
            this.linkedList.remove(index);
        }
        var endTime = System.nanoTime();
        this.linkedList.clear();
        return """
                --------------------------------------------
                LinkedList method - DELETE by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }

    public String testMethodGet(int countIteration) {
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.linkedList.add(index, randomElement);
        }

        var startTime = System.nanoTime();
        for (int index = countIteration - 1; index > 0; index--) {
            this.linkedList.get(index);
        }
        var endTime = System.nanoTime();
        this.linkedList.clear();
        return """
                --------------------------------------------
                LinkedList method - GET by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }


    public int getRightDiapason() {
        return rightDiapason;
    }

    public int getLeftDiapason() {
        return leftDiapason;
    }

    public LinkedList<Integer> getLinkedList() {
        return linkedList;
    }
}
