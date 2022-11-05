package simple.binarySearch;

public class BinarySearchTest {

    public static int binarySearch(int data[], int x, int low, int higt) {

        if (x < data[low] || x > data[higt] || low > higt) {
            return -1;
        }

        int mid = (low + higt) / 2;
        if (x < data[mid]) {
            return binarySearch(data, x, low, mid - 1);
        } else if (x > data[mid]) {
            return binarySearch(data, x, mid + 1, higt);
        } else {
            return mid;
        }

    }

    public static int binarySearch(int data[], int x) {
        int low = 0;
        int higt = data.length - 1;

        while (low <= higt) {
            int mid = (low + higt) / 2;

            if (x == data[mid]) {
                return mid;
            }
            if (x < data[mid]) {
                higt = mid - 1;

            } else if (x > data[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }

        }


        return -1;
    }

    public static void main(String[] args) {

        int data[] = {1,3,5,7,9,11};
        System.out.println("while=" + binarySearch(data, 11));
        System.out.println("digui=" + binarySearch(data, 9, 0, 5));
    }

}
