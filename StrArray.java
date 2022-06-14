public class StrArray {
    public static void main(String[] args) {
        String[] arr = fun1(5);
        //prints fun1 for input length 5
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String[] arr1 = fun2(5);
        //prints fun2 fr input length 5
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");

        }
    }

    //Function returns string array of integers
    static String[] fun1(int n) {
        String[] arr = new String[n];
        String newVal = "";
        for (int i = 0; i <n; i++) {
            String val = "";
            for (int j = 1; j <= i+1; j++) {
                val += String.valueOf(j);
            }
            arr[i] = val + strRev(val); //function implemented below
        }
        return arr;
    }

    //Function returns String array of strings
    static String[] fun2(int n){
        String[] arr = new String[n];
        int count = 0;
        for(char i = 65;i<65+n;i++){
            String str = "";
            for(char j = 65; j<=i;j++){
                str += j;
            }
            arr[count] = str + strRev(str);//function implemented below
            count++;
        }
        return arr;
    }

    //Function to reverse a string
    static String strRev(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
           char t =arr[start];
           arr[start] = arr[end];
           arr[end] = t;
                start++;
                end--;
        }
        return String.valueOf(arr);
    }
}
