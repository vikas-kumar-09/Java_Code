package DSACompanyWise_Parik_Jain;

// To find the Peak element in the array
public class Peak_Element {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 6, 4, 3, 2};
        System.out.println(peak_Element(arr));
    }

    static int peak_Element(int [] arr){

        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            // to find the mid element
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // you are in decresing part of an array
                end = mid;
            }
            else{
                // you are in inceasing part of an array
                start = mid + 1;
            }
        }
        return start;
    }
}
