package javaOO.examples;

/**
 * Inner Class Example.
 *
 * @author dannong
 * @since 2017年06月12日 21:25
 */
public class DataStructure {

    private static final int SIZE = 15;

    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        // Print out values of even indices of the array
        // 实例化一个内部类
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {}

    /**
     * Inner class implements the DataStructureIterator interface,
     * which extends the Iterator<Integer> interface.
     */
    // 私有内部类 - 辅助类(helper classes)
    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            // Check if the current element is the last in the array
            return nextIndex < SIZE;
        }

        @Override
        public Integer next() {
            // Record a value of an even index of the array
            // 访问外部闭包类的实例变量
            // Note that the EvenIterator class refers directly to the arrayOfInts
            // instance variable of the DataStructure object
            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        // Fill the array with integer values and print out only values of even indices
        DataStructure dataStructure = new DataStructure();
        dataStructure.printEven();
    }
}
