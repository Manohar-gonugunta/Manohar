package lambda;


import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class question5 {
    public static void main(String[] args) {
        Consumer<StringBuilder>  PrintFirstLetter = (item->{
            System.out.print(item.charAt(0));
        });


        List<StringBuilder> list= new LinkedList<>();
        list.add(new StringBuilder("foot"));
        list.add(new StringBuilder("basket"));
        list.add(new StringBuilder("sam"));
        list.add(new StringBuilder("chai"));
        
        list.forEach(PrintFirstLetter);
    }

}
