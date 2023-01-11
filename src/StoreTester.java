public class StoreTester {
        public static void main(String[] args) {
            Store store = new Store();
            Book book = new Book("Harry Potter", "Top", 100, "Description", 523, "26/6/1997", "JK Rowling", "9780590353427", "First", "HP1");
            store.addBook(book);
            Phone phone = new Phone("Iphone 14", "Top", 6000, "Description", 50, "Model 14", "Apple", "Some Operating System", "Some Network Type", 14);
            store.addPhone(phone);
            store.showAllInfo();
        }
}
