package cases;

public class Triangle {
	public static void main(String[] args) {
		char[][] array = new char[4][7];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				int m = i+j;
				if(i==0&&m==3) {
					array[i][j] = '*';
				}else if(i==1&&(m>=3&&m<=5)) {
					array[i][j] = '*';
				}else if(i==2&&(m>=3&&m<=7)) {
					array[i][j] = '*';
				}else if(i==3&&(m>=3&&m<=9)) {
					array[i][j] = '*';
				}else {
					array[i][j] = ' ';
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println(" ");
		}
	}
}
