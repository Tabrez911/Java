package collection5;

public class Customer implements Comparable<Customer> {
int customer_id;
String customer_name,product;
float product_price;
public Customer()
{
	customer_id=11;
	customer_name="Ankita";
	product="Smartphone";
	product_price=32499.4f;
	
}
public Customer(int customer_id, String customer_name, String product,
		float product_price) {
	super();
	this.customer_id = customer_id;
	this.customer_name = customer_name;
	this.product = product;
	this.product_price = product_price;
}

@Override
public int compareTo (Customer o)
{
	if(this.product_price==o.product_price)
		return 0;
	else if(this.product_price>o.product_price)
		return 1;
	else
		return -1;
}
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public float getProduct_price() {
	return product_price;
}
public void setProduct_price(float product_price) {
	this.product_price = product_price;
}
@Override
public String toString() {
	return "Customer [customer_id=" + customer_id + ", customer_name="
			+ customer_name + ", product=" + product + ", product_price="
			+ product_price + "]";
}
}
