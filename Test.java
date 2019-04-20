import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = {56, 3, 10, 9, 10, 50, 90};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int diff = 0, bigDiff = 0;
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					diff = arr[i] - arr[j];
				}
				else
				{
					diff = arr[j] - arr[i];
				}
				if(diff > bigDiff)
				{
					bigDiff = diff;
				}
				
			}
		}
		System.out.println(bigDiff);
		System.out.println("This is how it looks");
		
	
		
	}

}
