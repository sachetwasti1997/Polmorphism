package polymorphism;

import java.util.Random;

/*Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class
reference is used to refer to a child class object.*/

/*Polymorphism is the capability of a method to do different things based on the object that it is acting upon. In other words, polymorphism
allows you define one interface and have multiple implementations*/

/*Method Overloading in java is the compile time or static polymorphism*/
/*Method Overriding is an example of runtime polymorphism or dynamic polymorphism*/

class Movie{
    String name;
    public Movie(String name){
        this.name = name;
    }
    public void Plot(){
        System.out.println("No Plot here");
    }

    public String getName(){
        return name;
    }

}

class Jaw extends Movie{

    public Jaw(){
        super("Jaw");
    }

    public void Plot(){
        System.out.println("Shark eats a lot of people");
    }

}

class IndependanceDay extends Movie{

    public IndependanceDay(){
        super("Independance Day");
    }

    public void Plot(){
        System.out.println("Aliens attack the earth");
    }

}

class StarWars extends Movie{

    public StarWars(){
        super("StarWars");
    }

    public void Plot(){
        System.out.println("Extra Terrestial creatures try to conquire the Universe");
    }

}

class BhoolBhulaiya extends Movie{

    public BhoolBhulaiya(){
        super("Bhool Bhulaiya");
    }

    public void Plot(){
        System.out.println("A Doctor treats a psycopath who had been a reason of Fear of Ghosts");
    }

}

class NoPlot extends Movie{
    public NoPlot(){
        super("No Plot");
    }
}

public class PolyTest {
    public static void main(String[]a){

        Movie movie;
        for(int i=0; i<11; i++){
            movie = chooseMovie();
            if(movie!=null) {
                System.out.println("The movie selected is :" + movie.getName());
                System.out.print("The Plot: ");
                movie.Plot();
                System.out.println();
            }
        }


    }

    static Movie chooseMovie(){
        Random rand = new Random();
        int c = rand.nextInt(5)+1;
        System.out.println("Number selected #"+c);
        switch(c){
            case 1:

                return new Jaw();

            case 2:

                return new IndependanceDay();

            case 3:

                return new StarWars();

            case 4:

                return new BhoolBhulaiya();

            case 5:

                return new NoPlot();
        }
        return null;
    }
}
