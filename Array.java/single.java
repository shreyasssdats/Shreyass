/**
 * single
 */
public class single {
public static void main(String[] args) {
    int[] numbers={10,40,60,28,47,-5};
    int smallest=numbers[0];

    for(int i= 1; i<numbers.length; i++)
    {
        if(numbers[i] < smallest)
        {
            smallest=numbers[i];
        }
    }
    System.out.println("The smallest number in the array is :"+smallest);
}
    
}