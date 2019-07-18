import java.util.*;

public class Thanos {

    public static void main(String[] args) {
        // TODO 1 : Create an empty heroes list
        List<Hero> heros = new ArrayList<>();
        // TODO 2 : Add those heroes to the list
        heros.add(new Hero("Black Widow",34));
        heros.add(new Hero("Captain America",100));
        heros.add( new Hero("Vision",3));
        heros.add( new Hero("Iron Man",48));
        heros.add( new Hero("Scarlet Witch",29));
        heros.add( new Hero("Thor",1500));
        heros.add( new Hero("Spider-Man",18));
        heros.add( new Hero("Hulk",49));
        heros.add( new Hero("Doctor Strange",42));

        // TODO 3 : It's Thor birthday, now he's 1501
        Hero myHero = heros.get(5);  // Get class @ of this hero
        myHero.setAge(myHero.getAge()+1);       // Happy birthday my hero !
        // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heros);
        // TODO 5 : Keep only the half of the list (we use the Spliterator class to do that)
        Spliterator<Hero> splitIter = heros.spliterator();  // Get spliter iterator on the list
        Spliterator<Hero> halfHeros = splitIter.trySplit(); // Get the half of the list
        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("Remaining heros:");
        // Note: Hero.toString() is overloaded to display him with the name and the age
        halfHeros.forEachRemaining((i_Hero -> System.out.println(i_Hero.toString())));
    }
}