package DSA;

import java.util.Arrays;

public class SelectionSort
{

	// this also works with index

	public static int[] selectionSortIfAscending(int[] a)
	{

		int minimumIndex;

		for (int i = 0; i < a.length; i++)
		{
			minimumIndex = i;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] < a[minimumIndex])
				{
					minimumIndex = j;
				}
			}

			if (minimumIndex != i)
			{
				int temp = a[i];
				a[i] = a[minimumIndex];
				a[minimumIndex] = temp;
			}

		}
		return a;
	}

	public static int[] selectionSortIfDescending(int[] a)
	{
		int maximumIndex;

		for (int i = 0; i < a.length; i++)
		{
			maximumIndex = i;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[j] > a[maximumIndex])
				{
					maximumIndex = j;
				}
			}
			if (maximumIndex != i)
			{
				int temp = a[i];
				a[i] = a[maximumIndex];
				a[maximumIndex] = temp;
			}
		}
		return a;
	}

	public static void main(String[] args)
	{
//		System.out.println(Arrays.toString(selectionSortIfAscending(new int[]
//		{ 5, 2, 6, 3, 4 })));

		System.out.println(Arrays.toString(selectionSortIfDescending(new int[]
		{ 5, 2, 6, 3, 4 })));
	}

}
