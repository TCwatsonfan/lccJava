
public class DemoTest {
	public static void main(String[] args) {
		
		/**
		 *  流程判斷
		 *  
		 *    if (布林判斷式){
		 *    
		 *       成立時才執行的區段程式
		 *       
		 *    }
		 *    
		 *    
		 *    if (布林判斷式) {
		 *    
		 *        成立時才執行的區段程式
		 *    
		 *    }else{
		 *    
		 *        不成立時才執行的區段程式
		 *    
		 *    }
		 *    
		 */
		
		
		int age = 22;
		
		if (age >= 18) {
			System.out.println("可以考駕照");
			System.out.println("可以看限制級電影");
		}
		System.out.println("程式執行完畢");
		
		System.out.println();
		
		int password = 1234567;
		int count = 2;
		
		if ( (password == 1234567)  && (count == 1) ) {
			System.out.println("歡迎回來！");
			System.out.println("登入成功！");
		}else {
			System.out.println("帳密錯誤！！");
		}
		
		System.out.println("程式執行完畢");
		
		
	}

}
