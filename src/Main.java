import java.util.ArrayDeque;

public class Main{
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<String>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");
        System.out.println(states);
        System.out.println();
        // Great Britain
        //France
        //Germany
        //Spain
        //Italy

        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain

        String sLast = states.getLast();
        System.out.println(sLast + "\n");      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // Queue size: 5
        System.out.println();

        while(states.peek()!=null){
            System.out.println(states.pop());
        }
        System.out.println();
        // Great Britain
        //France
        //Germany
        //Spain
        //Italy

        System.out.println("\nКоллекция пустая:" + states + "\nРазмер коллекции:" + states.size());
        // Коллекция пустая:[]
        //Размер коллекции:0
        System.out.println();

        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        
        for(Person p : people){
            System.out.println(p.getName());
            // Tom
            // Nick
        }
    }
}