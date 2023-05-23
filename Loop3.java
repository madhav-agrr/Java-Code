class Loop3{
	public static void main(String agrs[]){
		int i;
		for(i=1; ;i++){
			System.out.print(i+" ");
			if(i%10==0)break;
			System.out.println("");
		}
	}
}
//break and continue