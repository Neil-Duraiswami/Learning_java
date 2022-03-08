import java.util.Scanner;



class search
{
	
search(){}
int Mid;
int Low=0;
int High;
int toSearch(int arr[],int f)
{
	High=arr.length;
	
 while(Low<=High)
 {
	 Mid=Low+(High-Low)/2;
	 if(arr[Mid]==f)
	 {
		 return Mid;
	 }
	 if(f<arr[Mid])
	 {
		 High=Mid-1;
	 }
	 if(f>arr[Mid])
	 {
		 Low=Mid+1;
	 }
	 
 }
return -1;

}




}










public class BSA {

	public static void main(String[] args)
	{
	Scanner in= new Scanner(System.in); 
    int arr[]=new int[10];
    int toFind;
    int dis;
    int i;
    for(i=0;i<10;i++)
    {
    	arr[i]=in.nextInt();
    }
    System.out.println("Enter the number to be found");
    toFind=in.nextInt();
    search s= new search();
    dis=s.toSearch(arr,toFind);
    if(dis!=-1)
    {
    	System.out.println(" The number to be found at " + dis + "Index");
    	
    }
    else {
    	System.out.println("Number not found");
    	
    }
    
	}

}
