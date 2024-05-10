// package DSACompanyWise_Parik_Jain;

// import java.util.ArrayList;

// // Intersection Of Two Sorted Arrays
// public class Insertion_2_Array {
//     public static void main(String[] args) {
//         ArrayList<Integer> arr1  = new ArrayList<>();
//         //   arr1.add(3);
//           arr1.add(6);
//           arr1.add(4);
//           arr1.add(5);

//           ArrayList<Integer> arr2  = new ArrayList<>();
//         //   arr2.add(3);
//           arr2.add(6);
//           arr2.add(1);
//           arr2.add(9);
//         // int n = arr1.length;
//           ArrayList<Integer> result = findArrayIntersection(arr1, 3, arr2, 3);
//           System.out.println(result);


//         // int [] arr2 = {3, 4, 2, 88, 66};
//         // int n = arr1.length;
//         // int m = arr1.length;

//         // System.out.println(findArrayIntersection(arr1, n, arr2, m));
        
//     }
//      static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
// 	{
//         // if(arr1.length && arr2.length){

//         // }
//         int i = 0; // point to arr1
//         int j = 0; // point to arr2
//         ArrayList<Integer> ans = new ArrayList<>();

//        while (i<arr1.size() && j<arr2.size()) {

//            if(arr1.get(i) < arr2.get(j)){
//             i++;
//            }
//            else if(arr1.get(i) > arr2.size()){
//             j++;
//            }
//            else{
//             ans.add(arr1.get(i));
//             i++;
//             j++;
//            }
//        }
//        return ans;

//     }
// }
