package com.company;

public class Main {

    public static void main(String[] args) {
	 MySet mySet = new MySet();
        mySet.addCharacter('s');
        mySet.addCharacter('t');
        mySet.addCharacter('t');
        MySet mySet1 = new MySet();
        mySet1.addCharacter('s');
        mySet1.addCharacter('t');
        mySet1.addCharacter('t');
        mySet.equals(mySet1);
        mySet.showAll();
    }
}
