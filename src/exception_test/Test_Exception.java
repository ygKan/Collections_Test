package exception_test;
import java.util.*;//����java����
public class Test_Exception {


/*ͼ����ҳ���
 * 1.��ʾ�û����룬�ֱ�������ͼ�����������ͼ��
 * 2.����������Ϣ�����ʵ����쳣����
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
		
		
	}
	public static void books(String bookname){
        String[] book={"����","����","����","Ӣ��","����"};
        
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
            System.out.println("����ѯ�����������ڣ� "+"\n" + "������Ҫ������ѡ��");    
            show();
        }
    }


	public static void bookNum(int BookNum){
		String[] book={"����","����","����","Ӣ��","����"};
		try{
			if(BookNum >0 && BookNum<book.length){
				System.out.println("book:"+book[BookNum-1]);
			}else{
				throw new Exception();
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("����ѯ���鼮�����ڣ� "+"\n" + "������Ҫ������ѡ��");	
			show();
		}
	}
	public static void bookname(String bookname){
		Scanner input2 = new Scanner(System.in);
		try{
			System.out.println("�������������������");
			String name1 =input2.next();
			books(name1);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("����������������");
			return;
		}
	}
		
	public static void booknum(int num){
		Scanner input3 = new Scanner(System.in);
		try{
			System.out.println("���������������ţ�");
			int n =input3.nextInt();
			bookNum(n);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("������������ţ�");
			return;
		}
	}
	
	public static void show(){
		System.out.println("��ӭ�������Ķ����ְɣ�������ѯ��ѡ1����Ų�ѯ��ѡ2");
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
		 System.out.println("���������Ϣ�������������룺");
		 show();
	     }
     }

}
