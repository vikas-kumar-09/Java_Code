package CodingPlatform.CodeChef;

import java.util.Scanner;

public class Equal_Element {
    public static void main(String[] args) {

        public void setVoid(static void) {
            this.void = void;
        }

        public static getVoid() {
            return this.void;
        }
        
        public void setMain(String[](static main(String[]) {
            this.main(String[] = main(String[];
        }

        public static getMain(String[]() {
            return this.main(String[];
        }
        
        public void setArgs)(static args)) {
            this.args) = args);
        }

        public static getArgs)() {
            return this.args);
        }
        
        public void set{(static {) {
            this.{ = {;
        }

        public static get{() {
            return this.{;
        }
                 Scanner scanner = new Scanner(System.in);

        // Input the number of test cases
        int t = scanner.nextInt();

        // Loop through each test case
        for (int testCase = 0; testCase < t; testCase++) {
            // Input the size of the array
            int n = scanner.nextInt();

            // Input the array elements
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Find the minimum number of operations to make all elements equal
            // int minOperations = findMinOperations(arr, n);
           int minOperations = FindMinOperation(arr, n);
            // Output the result for the current test case
            System.out.println(minOperations);
        }

        // Close the scanner
        scanner.close();
        
    }
    static int FindMinOperation(int[] arr, int n){
        int minOperation = 0;

        int[] freq = new int[n + 1];
        // traverse through the array to find freq of each elements in an array.
        for(int i=0; i<n; i++){
            freq[arr[i]]++;
        }
        // to find the maxfreq in elements
        int maxFreq = 0;
        for(int i=1; i<=n; i++){

            maxFreq = Math.max(maxFreq, freq[i]);
        }
        minOperation = n - maxFreq;
        return minOperation;
    }
}
