// package ArrayList1;

public class SLE {      // SLE = Second largest element
    public static void main(String[] args) {
        int[] a = {12, 3, 5, 10, 17};
        int total = 5;
        System.out.println(secondLargest(a, total));
    }
    static int secondLargest(int a[], int total){

        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[total-2];  
        }  
    }
// }
