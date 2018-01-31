package cases;

public class SelectionSort {
	public static void main(String[] args) {
		int[] myArray = {13,45,56,98,10,24,90,67,03};
		for(int i=0;i<myArray.length-1;i++) {
			/*for(int j=i;j<myArray.length-1;j++) {
				if(myArray[i]>myArray[j+1]) {
					int temp = myArray[j+1];
					myArray[j+1]=myArray[i];
					myArray[i]=temp;
				}
			}*/
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[i]>myArray[j]) {
					int temp = myArray[j];
					myArray[j]=myArray[i];
					myArray[i]=temp;
				}
			}
			for(int c:myArray) {
				System.out.print("["+c+"] ");
			}
			System.out.println(" ");
		}
	}
}
