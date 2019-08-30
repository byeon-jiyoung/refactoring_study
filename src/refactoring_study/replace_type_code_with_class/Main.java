package refactoring_study.replace_type_code_with_class;

public class Main {
	public static void main(String[] args) {
		Item book = new Item(ItemType.BOOK, "¼¼°è¿ª»ç", 4800);
		Item dvd = new Item(ItemType.DVD, "´º¿åÀÇ²ÞÆ¯º°ÆÇ", 3000);
		Item soft = new Item(ItemType.SOFTWARE, "Æ©¸µ¸Ó½Å", 3200);
		
		System.out.printf("%5s = %s%n","book", book);
		System.out.printf("%5s = %s%n","dvd", dvd);
		System.out.printf("%5s = %s%n","soft", soft);
	}
}
