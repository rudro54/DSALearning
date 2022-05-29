package DSA;

public class BinarySearch
{

	public static int binarySearchIfAscending(int[] a, int number) // from smaller to bigger
	{

		int left, right, mid;

		left = 0;
		right = a.length - 1; // i am working with index so length is size or numer of elements and length-1
								// is the last index

		while (left <= right) // index number
		{
			mid = (left + right) / 2;
			if (a[mid] == number)
			{
				return mid;

			} else if (number > a[mid])
			{
				left = mid + 1;
			} else
			{
				right = mid - 1;
			}
		}
		return -1;

	}

	public static int binarySearchIfDescending(int[] a, int number) // from bigger to smaller
	{

		int left, right, mid;

		left = 0;
		right = a.length - 1;

		while (left <= right) // index number
		{

			mid = (right + left) / 2;

			if (a[mid] == number)
			{
				return mid;
			}

			else if (number < a[mid])
			{
				left = mid + 1;
			} else
			{
				right = mid - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args)
	{
//		System.out.println(binarySearchIfAscending(new int[]
//		{ 1, 4, 6, 7, 10, 19, 22, 23, 30, 35, 39, 46, 49, 50, 52, 55, 61, 67, 70, 71 }, 4));

		System.out.println(binarySearchIfDescending(new int[]
		{ 71, 70, 67, 61, 55, 52, 50, 49, 46, 39, 35, 30, 23, 22, 19, 10, 7, 6, 4, 1 }, 4));
	}

}
