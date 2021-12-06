package day28_constructor;

public class C01 {


		    int x = 3;
		    int y = 5;
		    
		    C01() {
		        x += 1;
		        System.out.println("-x" + x);
		    }
		    C01(int i) {
		        this();
		        this.y = i;
		        x += y;
		        System.out.println("-x" + x);
		    }
		    C01(int i, int i2) {
		        this(3);
		        this.x -= 4;
		        System.out.println("-x" + x);
		    }
		    public static void main(String[]args) {
		        
		         C01 c01= new C01(4,3);
		          C01 co2=new C01();
		    }
		}








