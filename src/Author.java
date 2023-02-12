public class Author {
    String firstNameAuthor;
    String surnameAuthor;

    public Author(String firstNameAuthor, String surnameAuthor) {
        this.firstNameAuthor=firstNameAuthor;
        this.surnameAuthor=surnameAuthor;
    }

    public String getFirstNameAuthor() {
        return this.firstNameAuthor;
    }
    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }

    /*Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
    Напишите конструкторы для обоих классов, заполняющие все поля.
    Создайте геттеры для всех полей автора и всех полей книги.
    Создайте сеттер для поля «Год публикации» у книги.
    В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
    Метод main не должен находиться в классах Book и Author.
    Создайте отдельный класс для запуска приложения и объявите метод main в нем.
    В том же методе main измените год публикации одной из книг с помощью сеттера.*/
}
