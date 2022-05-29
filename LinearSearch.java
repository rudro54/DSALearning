package DSA;

public class LinearSearch

{

	public static int linearSearch(int[] a, int number)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == number)
			{
				return i;
			}
		}
		return -1; // i = -1; return i;
	}

	public static void main(String[] args)
	{
		System.out.println(linearSearch(new int[]
		{ 60, 1, 88, 10, 11, 100 }, 0));

	}

}
