class TestArray{
	public static void main(String args[]){
	int a[]={10,20,30,40,50};
	int i;
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
		}
		float sum=0,avg;
		for(i=0;i<a.length;i++)
			sum+=a[i];
		avg=sum/a.length;
		System.out.println("Average ="+ avg);
	}
}