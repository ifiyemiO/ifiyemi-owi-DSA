package DoubleDimensionalArray;

public class DoubleDimension {
        int[][] arr = null;

    // constructor
    public DoubleDimension(int numRows, int numColumns) {
        this.arr = new int[numRows][numColumns];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                arr[i][j] =Integer.MIN_VALUE;
            }
        }
    }

    // insert
    public void insert(int numRows, int numColumns, int valueToInsert) {
        try {
            if (arr[numRows][numColumns] == Integer.MIN_VALUE) {
                arr[numRows][numColumns] = valueToInsert;
                System.out.println("Successfully inserted " + valueToInsert + " at [" + numRows + "][" + numColumns + "]");
            } else {
                System.out.println("This cell is already occupied at [" + numRows + "][" + numColumns + "]");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array.");
        }
    }

    // Traverse
    public void traverse() {
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists.");
        }
    }
    // Search
    public void searchElement(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == valueToSearch) {
                    System.out.println("Value is found at the index of [" + i + "][" + j + "]");
                    return;
                }
            }
        }
        System.out.println(valueToSearch + " is not found.");
    }

    //Delete
    public void deleteElement(int numRows, int numColumns) {
        try {
            arr[numRows][numColumns] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully at [" + numRows + "][" + numColumns + "]");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array.");
        }
    }


    public static void main(String[] args) {

        DoubleDimension doubleDimension = new DoubleDimension(1, 1);


        // Test
        doubleDimension.insert(0, 0, 2);
        doubleDimension.insert(0, 1, 4);
        doubleDimension.insert(1, 0, 6);
        doubleDimension.insert(1, 1, 8);

        // Test Traverse
        doubleDimension.traverse();

        // Test SearchElement
        doubleDimension.searchElement(2);

        // Test Delete
        doubleDimension.deleteElement(1, 1);
        doubleDimension.traverse();


    }
}
