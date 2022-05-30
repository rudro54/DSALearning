package DSA;

import java.util.Arrays;

public class BuubleSort
{

	public static int[] bubbleSortIfAscending(int[] a)
	{
		int temp;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < (a.length - i - 1); j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public static int[] bubbleSortIfDescending(int[] a)
	{
		int temp;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < (a.length - i - 1); j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(bubbleSortIfAscending(new int[]
		{ 3, 44, 38, 5, 47, 15, 36, 26, 27, 2 })));

		System.out.println(Arrays.toString(bubbleSortIfDescending(new int[]
		{ 3, 44, 38, 5, 47, 15, 36, 26, 27, 2 })));
	}

}
