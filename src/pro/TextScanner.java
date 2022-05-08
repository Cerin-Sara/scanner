package pro;

	public class TextScanner {
		TextView tv;
		public TextScanner(TextView tv){
			this.tv=tv;
		}
		void scan() {
			String text ="Scanned text"; 
			tv.onText(text);
		}
	}

