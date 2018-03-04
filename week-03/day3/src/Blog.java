import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> blogPostsList = new ArrayList<>();

  public void add (BlogPost blogPost){
    blogPostsList.add(blogPost);
  }
  public void deleteItem (int index){
    blogPostsList.remove(index);
  }
  public void updateItem (int index, BlogPost blogPost) {
    blogPostsList.add(index,blogPost);
  }
  public List<BlogPost> getBlogposts (){
    return blogPostsList;
  }
}
