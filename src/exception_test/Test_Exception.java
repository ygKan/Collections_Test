package exception_test;
import java.util.*;//导入java工具
public class Test_Exception {


/*图书查找程序：
 * 1.提示用户输入，分别按书名及图书序号来查找图书
 * 2.根据输入信息进行适当的异常处理
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		
		
	}
	public static void books(String bookname){
        String[] book={"论语","高数","日语","英语","汉语"};
        
        try{
            for(int i =0;i<book.length;i++){
            if(book[i].equals(bookname)){
                System.out.println("book:"+book[i]);
                break;
            }else {
                throw new Exception();
            }
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("您查询的书名不存在： "+"\n" + "如有需要请重新选择：");    
            show();
        }
    }


	public static void bookNum(int BookNum){
		String[] book={"论语","高数","日语","英语","汉语"};
		try{
			if(BookNum >0 && BookNum<book.length){
				System.out.println("book:"+book[BookNum-1]);
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("您查询的书籍不存在： "+"\n" + "如有需要请重新选择：");	
			show();
		}
	}
	public static void bookname(String bookname){
		Scanner input2 = new Scanner(System.in);
		try{
			System.out.println("请输入您所需的书名：");
			String name1 =input2.next();
			books(name1);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("请重新输入书名：");
			return;
		}
	}
		
	public static void booknum(int num){
		Scanner input3 = new Scanner(System.in);
		try{
			System.out.println("请输入您所需的书号：");
			int n =input3.nextInt();
			bookNum(n);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("请重新输入书号：");
			return;
		}
	}
	
	public static void show(){
		System.out.println("欢迎您来到阅读快乐吧：书名查询请选1；序号查询请选2");
		Scanner input =new Scanner(System.in);
		int Num =input.nextInt();
		try{
		   if(Num ==1){
			bookname(null);
		  }else if (Num==2){
			booknum(Num);
		  }else{
			  throw new Exception();
		  }
	   }catch(Exception e){
		 System.out.println("您输入的信息有误，请重新输入：");
		 show();
	     }
     }

}
