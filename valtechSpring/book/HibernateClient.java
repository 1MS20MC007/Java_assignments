package valtechSpring.book;
import java.util.Date;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



import valtechSpring.book.Article;
import valtechSpring.book.Address;
import valtechSpring.book.Author;
import valtechSpring.book.Blog;
import valtechSpring.book.Book;
import valtechSpring.book.Handbook;
import valtechSpring.book.Publisher;



public class HibernateClient {
    public static void main(String[] args) {
                SessionFactory sf= new AnnotationConfiguration()
                        .configure()
                        .addAnnotatedClass(Book.class)
                        .addAnnotatedClass(Publisher.class)
                        .addAnnotatedClass(Author.class).addAnnotatedClass(Address.class)
                        .addAnnotatedClass(Article.class).addAnnotatedClass(Blog.class)
                        .addAnnotatedClass(Handbook.class)
                        .buildSessionFactory();
        Session ses = sf.openSession();
        Transaction tx = ses.beginTransaction();
        
        Address a = new Address("JP nagar","Blr","Kar",560078);
      Author ar = new Author("shruti",92772876);
  
      Book b = new Book("xyz", new Date(1,2,90));
      Article ac =new Article("http://geeksforgeeks.com");
      Blog bg = new Blog("www.google.com", 3);
      Handbook hb = new Handbook("123",500,1990,4 );
        
      Publisher p = new Publisher("abc","jp nagar",906673661);
      a.setAuthor(ar);
      ar.setAddress(a);
      ses.save(a);
      ses.save(ar);
      ses.save(b);
      
      ses.save(ac);
      ses.save(bg);
      ses.save(hb);
     ses.save(p);    



       
        
        tx.commit();
        ses.close();
        sf.close();
    }
}

