// command: lệnh
// line: dòng
// Argument: đối số
// args: Argument String: Chuỗi tham số 

// Biên dịch: javac tên file.java
// Chạy code: java tên file + đối số
public class BinarySearch {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;

        while (start != end) {
            mid = (start + end) / 2;

            if (arr[mid] == value) {
                return mid;
            }

            if (arr[mid] > value) {
                end = mid -1 ;
            }

            if (arr[mid] < value) {
                start = mid + 1;
            }
        }

        if (arr[mid] == value) {
            return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.print("Input array: ");
        for (String s : args) {
            System.out.print(s + " ");
        }

        int[] arr = new int[args.length];
        // Ép kiểu từ String sang int
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        System.out.print("\nArray after sorting: ");
        sort(arr);
        display(arr);

        int value = 7;
        int position = binarySearch(arr, value);
        if (position != -1) {
            System.out.println(value + " appears at position " + position);
        } else {
            System.out.println(value + " doesn't appear in array");
        }

        value = 100;
        position = binarySearch(arr, value);
        if (position != -1) {
            System.out.println(value + " appears at position " + position);
        } else {
            System.out.println(value + " doesn't appear in array");
        }
    }
}
