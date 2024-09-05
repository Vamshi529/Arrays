public class Arrays {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        int max = arrays[0];
        int min = arrays[0];
        for(int i=0;i<arrays.length;i++){
            sum = sum+arrays[i];
        }
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]>max){
                max = arrays[i];
        }
        else{
            min = arrays[i];
    }   
    }
System.out.println("The sum of the arrays is :"+sum);
System.out.println("The Max of the arrays is :"+max);
System.out.println("The Min of the arrays is :"+min);
    }
}