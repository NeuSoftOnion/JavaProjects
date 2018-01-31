package cases;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = {23,14,56,21,33};
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			for(int a:array) {
				System.out.print("["+a+"] ");
				
			}
			System.out.println();
		}
		
	}
}
