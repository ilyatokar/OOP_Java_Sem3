public class Main {

    public static void main(String[] args) {
	    Author a1 = new Author("ilya", "it@mail.ru", 'm');
        System.out.println(a1);
        a1.setEmail("yan@yandex.ru");
        System.out.println(a1);
    }
}
