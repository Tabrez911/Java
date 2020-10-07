package collection4;

public class Book {
int code;
String title,author;
float price;
public Book()
{
	code=12;
	title="2 States";
	author="Chetan Bhagat";
	price=346.8f;

}
public Book(int code, String title, String author, float price) {
	this.code = code;
	this.title = title;
	this.author = author;
	this.price = price;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
@Override
public String toString() {
	return "Book [code=" + code + ", title=" + title + ", author=" + author
			+ ", price=" + price + "]";
}


}
