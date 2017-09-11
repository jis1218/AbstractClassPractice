# Abstract Class 공부

##### Abstract Class는 다음과 같이 선언한다.
```java
abstract class Memo{
		abstract void create();

		abstract void delete();

		abstract void showList();

		void deleteList(){
			delete();
			showList();
		} //추상 클래스 안에는 이렇게 메서드의 역할을 정의할 수 있음
	}
  ```
  ##### Abstract Class는 interface와는 달리 메서드를 정의해 줄 수 있다. 하지만 java에서 다중 상속이 허용이 안되기 때문에 Abstract Class 역시 다중상속을 할 수 없다는 것이 Interface와의 차이점이다.

  ## 새롭게 배운 점

  ##### 1. 상위 클래스의 메서드를 하위 클래스에서 그대로 사용하면 그 메서드는 상위 클래스의 메서드의 로직으로 실행이 된다. 하지만 오버라이드를 하게 되면 실행이 되지 않고 하위 클래스에서 새롭게 정의 되어야 한다.

  ```java
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
  }
  ```
  ```java
  class Memo2 extends MemoImpl {
  		@Override
  		void read() {
  			update();
  		} //상위 클래스에는 메서드가 강제 구현되었는데 여기는 그렇지 않다.  

      @Override
  		void create() {
  			super.create();
  		}
    ```



```java
public class AbstractClass {

	public static void main(String args[]){				
		Memo2 memo = new Memo2();		
		memo.read();
		memo.create();		
	}
}
```
##### 위의 코드를 실행시키면 'update가 호출, Create가 호출' 이라는 결과가 나온다.
##### 그 이유는 read는 override 되었기 때문이고, update()는 상위 클래스의 메서드를 그대로 실행했기 때문이다. create의 경우 override 된 함수 안에 super.create()를 넣음으로써 상위 메서드의 기능을 물려받았다.
