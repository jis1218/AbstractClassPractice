abstract class Memo{
		abstract void create();
		
		abstract void read();
		
		abstract void update();
		
		abstract void delete();
		
		abstract void showList();
		
		void deleteList(){
			delete();
			showList();
		} //추상 클래스 안에는 이렇게 메서드의 역할을 정의할 수 있음
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
			System.out.println("Create가 호출");
		}

		@Override
		void read() {
			System.out.println("read가 호출");
		}

		@Override
		void update() {
			System.out.println("update가 호출");
		}

		@Override
		void delete() {
			System.out.println("delete가 호출");
		}

		@Override
		void showList() {
			System.out.println("showList가 호출");
		}
		
	}
	
	class Memo2 extends MemoImpl {
		@Override
		void read() {
			// TODO Auto-generated method stub
			update();
		} //상위 클래스에는 메서드가 강제 구현되었는데 여기는 그렇지 않다.

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
