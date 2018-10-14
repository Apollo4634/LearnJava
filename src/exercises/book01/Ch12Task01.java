package exercises.book01;

public class Ch12Task01 {
	public static void main(String[] args) {
		Student student = new Student();
		try {
			student.speak(1200);
		}catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class Student {
	void speak(int m) throws MyException {
		if(m > 1000) {
			throw new MyException("����1000");
		}		
	}
}

class MyException extends Exception {
	/**
	 * serialVersionUID ���ں��������Խ��н���
	 */
	private static final long serialVersionUID = 7454612752238585499L;

	MyException(String msg){
		super(msg);
		System.out.println("test");
	}
}
