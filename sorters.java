import java.util.*;

public class Sorters{
	public void mergesort(Task tasks, int start, int end, int flag){
		// base case: if 0 or 1 elements in arr, return
		if(start == end || end == 1){
			return;
		}
		int mid = (start + end)/2;
		mergesort(tasks, start, mid, flag); // first half
		mergesort(tasks, mid + 1, end, flag); // second half
		merge(tasks, start, mid, end, flag);
	}

	public void merge(Task tasks, int start, int mid, int end, int flag){
		
	}

	public Task sortByRating(int a, int b){
			
	}

	public Task sortByDate(LocalDate d1, LocalDate d2){
	}
}
