abstract class Memo{
		abstract void create();
		
		abstract void read();
		
		abstract void update();
		
		abstract void delete();
		
		abstract void showList();
		
		void deleteList(){
			delete();
			showList();
		} //�߻� Ŭ���� �ȿ��� �̷��� �޼����� ������ ������ �� ����
	}
	
	class Bbs extends Memo{

		@Override
		void create() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void read() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void update() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void delete() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void showList() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	abstract class MemoImpl extends Memo{

		@Override
		void create() {
			System.out.println("Create�� ȣ��");
		}

		@Override
		void read() {
			System.out.println("read�� ȣ��");
		}

		@Override
		void update() {
			System.out.println("update�� ȣ��");
		}

		@Override
		void delete() {
			System.out.println("delete�� ȣ��");
		}

		@Override
		void showList() {
			System.out.println("showList�� ȣ��");
		}
		
	}
	
	class Memo2 extends MemoImpl {
		@Override
		void read() {
			// TODO Auto-generated method stub
			update();
		} //���� Ŭ�������� �޼��尡 ���� �����Ǿ��µ� ����� �׷��� �ʴ�.

		@Override
		void create() {
			// TODO Auto-generated method stub
			super.create();
		}
		
		
		
	}


public class AbstractClass {	
	
	public static void main(String args[]){				
		Memo2 memo = new Memo2();		
		memo.read();
		memo.create();
		
	}
}
