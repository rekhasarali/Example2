package Day3;

public class Largestoftwonumbers {

	public static void main(String[] args) {
int a=80;
int b=30;
int c=40;
int res =(a>b && a>c )?a:((b>c && b>a) ?b:c);
System.out.println(res);
	}

}
