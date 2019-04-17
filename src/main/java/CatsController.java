import java.util.ArrayList;
import java.util.List;

public class CatsController {

    static List<Cat> cats;

    public CatsController(){
        if(cats == null)
            cats = new ArrayList<>();
        init();
    }
public List<Cat> getAllCats(){
        return cats;
}

public void addCat(Cat cat){
        cats.add(cat);
}

public void updateCat(int id, Cat cat){
        cats.set(id,cat);
}



}
