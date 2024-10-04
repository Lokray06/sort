import sorters.Bubble;
import utils.Utils;

public class Main
{	
	public static void main(String[] args)
	{
		int[] array = new int[] {1, 2, 3};
		int[] result = Bubble.sort(array);
		Utils.print(result);  // Print sorted array
	}
}
