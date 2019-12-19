/*
分支结构中的if-else（条件判断结构）
一、三种结构
第一种：
if(条件表达式){
	执行表达式1
}

第二种：二选一
if(条件表达式){
	执行表达式1
}else{
	执行表达式2
}

第三种：n选一



*/

class IfTest{
	public static void main(String[] args){
		
		//举例1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("进一步检查");
		}
		System.out.println("检查结束");
		
		//举例2
		int age = 23;
		if(age < 18){
			System.out.println("动画片");
		}
		else{
			System.out.println("成人电影");
		}
		
		//举例3
		if(age < 0){
			System.out.println("非法");
		}
		else if(age < 18){
			System.out.println("青少年");
		}
		else if(age < 35){
			System.out.println("青壮年");
		}
		else if(age < 60){
			System.out.println("中年");
		}
		else if(age < 120){
			System.out.println("老年");
		}
		else{
			System.out.println("仙");
		}
	}
}