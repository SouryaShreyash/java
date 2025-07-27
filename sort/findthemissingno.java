//find the missing no.in an array
public class findthemissingno{
public static int findthemissingno(int[] arr) {
    int i = 0;
    while (i < arr.length) {
      int correct = arr[i];
      if (arr[i]<arr.length && arr[i] != arr[correct]) {
        swap(arr, i, correct);
      } else {
        i++;
      }
    }
    //case 1:search for missing number(any middle number)
    for(int index=0;index<arr.length;index++){
       if(arr[index]!=index){
           return index;
       } 
    }
     //cse 2:if the last no. is missing
    return arr.length;
  }
  public static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
  public static void main(String[] args) {
    int[] arr = { 3,0,2,1 };
    int ans=findthemissingno(arr);
    System.out.println(ans);
  }
}