public class Aloha{
	public static void main(String[] args) {
		String[] names ={"a","b","c","d","e"};
		String msg;
		String username;
		System.out.print("名前を入力してください>>");
		username = new java.util.Scanner(System.in).nextLine();
		msg = username + "さん、アロハ！";

		for(int i = 0; i<names.length; i++){
			if (username.equals(names[i])){
				msg = username + "tuan ngoai kieu";
			}
		}
		System.out.println(msg);
	}
}