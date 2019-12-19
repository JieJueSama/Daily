/*
分支结构之二

1.格式
switch(表达式){
	
	case 常量1
		执行语句1
		//break;
	
	case 常量2
		执行语句2
		//break;
	.......
	default:
		执行语句n;
		//break;
}

2.说明：
根据switch表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应的case结构，调用其执行语句
当调用完执行语句后，则仍然继续向下执行其他case结构中的执行语句
直到遇到break关键字或此switch-case结构末尾为止


break  可以使用在switch-case结构中，一旦遇到此关键字，就跳出switch-case结构

switch结构中的表达式，只能是如下的6种数据类型：byte short char int 枚举类型(JDK5.0) String类型(JDK7.0)
case之后只能声明常量，不能声明范围
break关键字是可选的
default相当于if-else中的else  default也是可选的位置也是灵活的


凡是可以使用switch-case的结构都可以转变成if-else
我们写分支结构时，当发现可以使用switch-case（switch中表达式取值情况不太多）又可以使用if-else，我们优先使用switch-case
原因：switch-case执行效率高
*/
class SwitchTest{
	public static void main(String[] args){
		int num = 2;
		switch(num){
			case 0: 
				System.out.println("zero");
				break;
			case 1: 
				System.out.println("one");
				break;
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
			default:
				System.out.println("other");
		}
		
		
		//***************************************
		//error
		/*
		boolean isHandsome = true;
		
		switch(isHandsome){
			case true:
				System.out.println("456");
			case false:
				System.out.println("5555");
		}
		*/
		
		//error
		/*
		int num = 50;
		int i = 1;
		switch(num){
			case num > 10 :
				System.out.println("10");
		}
		*/
		
		
	}
}