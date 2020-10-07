package collection4;

import java.util.Stack;

public class BookDetails {

	
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(new Book());
		st.push(new Book(11,"ABC","Akanksha",456.6f));
		st.push(new Book(11,"PQR","Gautami",496.1f));
		st.push(new Book(11,"XYZ","Kiran",556.0f));
		st.push(new Book(11,"LMN","Manish",956.3f));
		st.push(new Book(11,"STU","Akshay",496.7f));
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
	}

}
