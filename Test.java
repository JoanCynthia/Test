import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr = {16, 2, 5, 4, 8, 20, 40};
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
		
		
	}

}
