package sort;

/**
 * @author Apollo4634
 * @create 2019/02/04
 * @see SortUtils
 * @see InsertionSort
 */

public class ShellSort {
	
	public static <T extends Comparable<? super T>> 
	void sort(T[] arr) {
		int arrLen = arr.length;
		int h = 1;
		while (h<arrLen/3) h = 3*h +1;//1,4,13,40,...
		while (h>=1) {
			for (int i = h; i < arrLen; i++) {
				for (int j = i; j >= h; j -= h) {
					if(!SortUtils.less(arr[j], arr[j-h])) break;
					SortUtils.swap(arr, j, j-h);
				}
			}
			h /= 3;
		}
	}
	
	
}
