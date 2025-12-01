import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethodTimeTesting {

    private final ArrayList<Integer> arrayList;
    private final int rightDiapason;
    private final int leftDiapason;

    public ArrayListMethodTimeTesting(ArrayList<Integer> arrayList, int rightDiapason, int leftDiapason) {
        this.arrayList = arrayList;
        this.leftDiapason = Objects.requireNonNullElse(leftDiapason, 0);
        this.rightDiapason = Objects.requireNonNullElse(rightDiapason, 1000);
    }

    public String testMethodAdd(int countIteration) {
        var startTime = System.nanoTime();
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.arrayList.add(index, randomElement);
        }
        var endTime = System.nanoTime();
        this.arrayList.clear();
        return """
                --------------------------------------------
                ArrayList method - ADD by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }

    public String testMethodDelete(int countIteration) {
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.arrayList.add(index, randomElement);
        }

        var startTime = System.nanoTime();
        for (int index = countIteration - 1; index > 0; index--) {
            this.arrayList.remove(index);
        }
        var endTime = System.nanoTime();
        this.arrayList.clear();
        return """
                --------------------------------------------
                ArrayList method - DELETE by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }

    public String testMethodGet(int countIteration) {
        for (int index = 0; index < countIteration; index++) {
            var randomElement = this.leftDiapason + (int)(Math.random() * ((this.rightDiapason - this.leftDiapason) + 1));
            this.arrayList.add(index, randomElement);
        }

        var startTime = System.nanoTime();
        for (int index = countIteration - 1; index > 0; index--) {
            this.arrayList.get(index);
        }
        var endTime = System.nanoTime();
        this.arrayList.clear();
        return """
                --------------------------------------------
                ArrayList method - GET by index \n
                count iteration: %d \n
                time iteration: %d nanoseconds.
                --------------------------------------------
                """.formatted(countIteration, (endTime - startTime));
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public int getRightDiapason() {
        return rightDiapason;
    }

    public int getLeftDiapason() {
        return leftDiapason;
    }
}
