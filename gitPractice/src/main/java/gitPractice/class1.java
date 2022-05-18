package gitPractice;



public class class1 {

	public static void main(String[] args) {
		 int [] ar= {1,4,2,5,2};
		int osum=0;
		int esum=0;
		 for(int i=0; i<ar.length; i++) {
			 
			 if(ar[i]==0) {
				 esum=esum+ar[i];
			 }
			 else {
				 osum=osum+ar[i];
			 }
		 }
		 System.out.println(osum);
		 System.out.println(esum);
	}
}
