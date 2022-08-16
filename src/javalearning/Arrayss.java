package javalearning;

public class Arrayss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
	//declare,create,assign, acess
		int d[]= {1,2,23,44,56};
		for(int i:d ){
		System.out.println(i);
		}
		int v[][]= {{1,23,43,32,99,76},{54,34,23,23}};
	    for(int row=0;row<v.length;row++)
	    {
	    	for(int col=0;col<v[row].length;col++)
	    	{
	    		System.out.println(v[row][col]);//1,23..76
	    	}
	    }
	    String[] t= {"fgh","jggy"};
	    System.out.print(t[4]);
		
	}

}
