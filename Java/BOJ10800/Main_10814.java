package Baekjoon.Java.BOJ10800;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person> {
    int age;
    String name;

    public Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int compareTo(Person p) {
        return age - p.age;
    }


}
public class Main_10814 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Person> list = new ArrayList<Person>();
        int n = input.nextInt();

        for (int i =0; i < n; ++i) {
            Person p = new Person(input.nextInt(),input.next());
            list.add(p);
        }

        Collections.sort(list);

        for (int i = 0; i < n; ++i) {
            System.out.print(list.get(i).age + " ");
            System.out.println(list.get(i).name);
        }

    }

}
