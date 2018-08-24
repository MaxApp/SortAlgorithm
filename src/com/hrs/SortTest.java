package com.hrs;

public class SortTest {

	private static int[] arr = {47,23,1,2,44,52,26,13,18,31};
	
	public static void main(String[] args) {

//		insertSort(arr);
//		bubleSort(arr);
		quickSort(arr, 0, arr.length-1);
		for(int data : arr){
			System.out.print(data+" ");
		}
		
	}
	
	// 插入排序
	private static void insertSort(int[] arr){
		
		int len = arr.length;
		int j=1;
		int i;
		int low,high;
		int tmp;
		for(;j<len; j++){
			low = 0;
			high=j-1;
			tmp = arr[j];
			
			while(low<=high){
				int index = (low+high)/2;
				if(tmp<arr[index]) high=index-1;
				else low=index+1;
			}
			
			for(int data : arr){
				System.out.print(data+" ");
			}
			System.out.println();
			System.out.println("-- 目标数："+arr[high+1]+ "  置换数："+tmp);
			
			i=j-1;
			while(i>low-1){
				arr[i+1]=arr[i];
				i--;
			}
			
			arr[i+1]=tmp;
			for(int data : arr){
				System.out.print(data+" ");
			}
			System.out.println();
			System.out.println();
			
		}
	}
	
	
	// 交换排序：冒泡
	private static void bubleSort(int[] arr){
		int len = arr.length;
		for(int j=len-1; j>1; j--){
			for(int i=0; i<j; i++){
				if(arr[i]>arr[i+1]){
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		}
		
	}
	
	
	// 交换排序：快速
	private static void quickSort(int[] arr, int l, int h){
		int low = l;
		int high = h;
		
		int pivot = arr[l];
		int pivotIndex = l;
//		l = l+1; // start index
		System.out.println("-- pivot: "+pivot);
		while(l<h){
			while(l<h && arr[h]>=pivot){
				h--;
			}
			while(l<h && arr[l]<=pivot){
				l++;
			}
//			System.out.println("-- 交换: "+arr[h]);
			arr[pivotIndex] = arr[h];
//			System.out.println("-- 交换: "+arr[l]);
			arr[h]=arr[l];
			pivotIndex=l;
			
//			h--;
//			l++;
//			if(l<h)
//				System.out.println("   下个数: "+arr[h-1]+" "+arr[l+1]);
//			for(int data : arr){
//				System.out.print(data+" ");
//			}
//			System.out.println();
		}
		arr[pivotIndex] = pivot;
		for(int data : arr){
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println();
		
		if(pivotIndex-1>low)
			quickSort(arr, low, pivotIndex-1);
		if(pivotIndex+1<high)
			quickSort(arr, pivotIndex+1, high);
	}
}








