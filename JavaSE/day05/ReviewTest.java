class ReviewTest{
	
	public static void main(String[] args){
		int sum = 0;//一定要赋值
		for(int i = 0; i <= 100; i++){
			if(i % 2 != 0){
				System.out.println(i);
				sum = i;
			}
			else{
				sum = 1;
			}
		}
		System.out.println(sum);
	}
}