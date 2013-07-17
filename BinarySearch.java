package NthDimenzion.assignment.sorting;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] intArray = {1,2,3,5,7,10,3,2};
		int searchValue =10, index;

		index = binarySearch(intArray, searchValue);
		if (index != -1) {
			System.out.println("Found at index: " + index);
		} 
		else {
			System.out.println("Not Found");
		}
	}

	static int binarySearch(int[] search, int find) {
		int start, end, midPt;
		start = 0;
		end = search.length - 1;
		while (start <= end) {
			midPt = (start + end) / 2;
			if (search[midPt] == find) {
				return midPt;
			} else if (search[midPt] < find) {
				start = midPt + 1;
			} else {
				end = midPt - 1;
			}
		}
		return -1;
	}
}


