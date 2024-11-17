import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        // [5, 4, 3, 2, 1]

        // example 2
        // indexOf()

        String inputString = "abracadabra";
        String targetsubString = "adab";

        int index = inputString.indexOf(targetsubString);// if exist -> return -1

        while (index != -1) {// condition : can find the index from inputstring
            System.out.println(index);
            index = inputString.indexOf(targetsubString, index + 1);
            // indexOf (substring, fromIndex): finds the next occurrence starting from form
            // index.
            // the loop contineues until no more occurrence
        }

        // Example 3
        // split the sentence
        String sentence = "Learning Java is fun.";
        String[] strArr = sentence.split(" "); // input param of .split (String regex)

        // Approach 1
        System.out.println(Arrays.toString(Arrays.toString(strArr)));

        // QQQ,VOO, TSLA
        String stockList = "QQQ, VOO, TSLA, TQQQ, SQQQ";

        String[] splitStocklist = stockList.split(",");
        System.out.println("Stock list :" + Arrays.toString(splitStocklist));

        // other syntax of for-loop
        for (String arr2 : splitStocklist) {// for-each , for (: source) . loop all the element
            System.out.println(arr2);
        } // QQQ
        // VOO
        // TSLA
        // TQQQ
        // SQQQ

        int[] arr3 = new int[] { 1, 2, 3, 4, 5, 67, 8 };
        for (int i : arr3) {
            System.out.println(i);
        }

        for (int i : arr3) {
            System.out.println("Before Break : " + i);
        }
    }
}