package DSACompanyWise_Parik_Jain;

/**
 * Equilibrium_Index
 */
public class Equilibrium_Index {

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(equilibriumIndex(arr));
        
    }
    static int equilibriumIndex(int[] arr){
       
        int num = arr.length-1;

        // int mid = start + (end - start) /2;
           for(int i=0; i<num; i++){
            int leftSum = 0; int rightSum = 0;
 
        for(int j=0; j<i; j++){
             leftSum = leftSum+ arr[j];
        }
        for(int k=i+1; k<num; k++){
            rightSum = rightSum + arr[k];
        }

        if(leftSum!=0 && rightSum!=0 && leftSum == rightSum){
            return i;
        }
    }
    return -1;
}
}