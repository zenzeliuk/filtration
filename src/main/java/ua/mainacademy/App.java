package ua.mainacademy;

import java.util.ArrayList;
import java.util.Comparator;

public class App
{
    public static void main( String[] args ){

        ArrayList<Goroda> goroda = new ArrayList<>();
        goroda.add(new Goroda("Одесса", 4567));
        goroda.add(new Goroda("Луцк", 4321));
        goroda.add(new Goroda("Киев", 1111));
        goroda.add(new Goroda("Одесса", 1023));
        goroda.add(new Goroda("Ровно", 9826));
        goroda.add(new Goroda("Днепр", 2655));
        goroda.add(new Goroda("Киев", 3355));
        goroda.add(new Goroda("Одесса", 9900));
        goroda.add(new Goroda("Днепр", 3175));
        goroda.add(new Goroda("Киев", 2200));

        goroda.sort(Comparator.comparing(Goroda::getName).thenComparing(Goroda::getCode));

        for (Goroda gorod : goroda) {
            System.out.println(gorod.toString());
        }

    }



}


class Goroda {
    private String name;
    private Integer code;

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }

    public Goroda(String name, Integer code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Goroda{" +
                "name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}