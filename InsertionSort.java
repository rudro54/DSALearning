package DSA;

import java.util.Arrays;

public class InsertionSort
{

	public static int[] insertionSortIfAscending(int[] a)
	{

		for (int i = 1; i < a.length; i++)
		{

			int item = a[i];

			int j = i - 1;

			while (j >= 0 && a[j] > item)
			{
				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = item;

		}

		return a;

	}

	public static int[] insertionSortIfDescending(int[] a)
	{

		for (int i = 1; i < a.length; i++)
		{

			int item = a[i];

			int j = i - 1;

			while (j >= 0 && a[j] < item)
			{

				a[j + 1] = a[j];
				j = j - 1;
			}

			a[j + 1] = item;
		}

		return a;
	}

	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(insertionSortIfAscending(new int[]
		{ 3, 44, 38, 5, 47, 15, 36, 26, 27, 2 })));

		System.out.println(Arrays.toString(insertionSortIfDescending(new int[]
		{ 3, 44, 38, 5, 47, 15, 36, 26, 27, 2 })));

	}

}
