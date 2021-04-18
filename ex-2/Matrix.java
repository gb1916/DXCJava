public class Matrix
{
	public static void main(String[] args) 
	{
		//first matrix
		int x[][]={{7,8,9},{1,2,3},{4,5,6}};  
		//second matrix
		int y[][]={{11,12,13},{14,15,16},{18,19,20}}; 
		//matrix which stores multiplication of the two
		int z[][]=new int[3][3];  
		
		for(int i=0,j=2;i<3;i++,j--)
			for(int k=0,l=2;k<3;k++,l--)
				z[i][k]=x[i][k]*y[j][l];
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
	}
}