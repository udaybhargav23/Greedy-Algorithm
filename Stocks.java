import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner inp = new Scanner(System.in);
					  int n = inp.nextInt();
					  int [] arr = new int[n];
					  for (int i=0;i<n;i++){
						  arr[i] = inp.nextInt();
					  }
					  boolean buy = true;
					  ArrayList<Integer> arr2 = new ArrayList<Integer>();
					  for (int i=0;i<n-1;i++){
						  if (arr[i]<arr[i+1]){
							  if (buy){
								arr2.add(i);
								buy = false;
							  }
						  }else{
							  if (!buy){
								arr2.add(i);
								buy = true;
							  }
						  }
					  }
					  if (arr2.size()%2!=0){
						  arr2.add(n-1);
					  }
					  if (arr2.size()==0){
						  System.out.println("null");
					  }else{
						  for (int i=0;i<arr2.size();i+=2){
							  System.out.println(arr2.get(i)+" "+arr2.get(i+1));
						  }
					  }
	}
}
