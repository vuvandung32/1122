import java.util.Arrays;

public class _1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length, c = 0, temp;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr2[i] == arr1[j]){
                    temp = arr1[c];
                    arr1[c] = arr1[j];
                    arr1[j] = temp;
                    c++;
                }
            }
        }
        while(c < n-1){
            int index = c;
            for(int i = c+1; i < n; i++){
                if(arr1[i] < arr1[index]){
                    index = i;
                }
            }
            temp = arr1[index];
            arr1[index] = arr1[c];
            arr1[c] = temp;
            c++;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2= {2,1,4,3,9,6};
        relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(arr1));
    }
}
