package day01_grupCalismasi;

public class C0004_Calýsma {

	public static void main(String[] args) {
		String str="Javaisalsoeasy";
	    String girilenHarf="abcdefghijklmnoprstuvyzwq";
		  int toplam=0;
			for (int i = 0; i < str.length(); i++) {	
				
				if (!girilenHarf.contains(str)){
					for(int j = i+1; j< str.length(); j++) {
								
				if(str.equals(girilenHarf)) {
					toplam++;
				}
				} 
					System.out.print(i);
					toplam+=i;
				}
			
			}
	}
}
				