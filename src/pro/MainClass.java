package pro;

public class MainClass extends TextView{
		void onText(String text) {
			System.out.println(text);
		}
		MainClass(){
			TextScanner ts=new TextScanner(this);
			ts.scan();
		}
		public static void main(String args[]) {
			MainClass s = new MainClass();
		}
}
