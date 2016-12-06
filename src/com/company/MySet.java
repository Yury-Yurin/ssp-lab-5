package com.company;

import java.util.HashSet;

/**
 * Created by yury on 6.12.16.
 */
public class MySet {
    @Override
    public boolean equals(Object obj) {
        MySet eqSet = (MySet) obj;
        if( eqSet.getSet().size() != set.size()) {
            return false;
        }
        else {
            int k=0;
            for (int i = 0; i < eqSet.getSet().size(); i++) {
                if(eqSet.getSet().toArray()[i].equals(set.toArray()[i])) {
                    k++;
                }
            }
            if (k == set.size())
                return true;
            else return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        if( set.size() != 0 ) {
            stringBuilder.append("[");
            for (Character character : set) {
                stringBuilder.append( character );
                if (!character.equals(set.toArray()[set.size() - 2])) {
                    stringBuilder.append(",");
                }
            }
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }

    private HashSet<Character> set;

    MySet() {
        set = new HashSet<>();
    }

    MySet(HashSet<Character> set) {
        this.set = set;
    }


    public HashSet<Character> getSet() {
        return set;
    }

    public void setSet(HashSet<Character> set) {
        this.set = set;
    }

    public Integer getSize() {
        return set.size();
    }

    public void addCharacter(Character s) {
        set.add( s );
    }

    public void showAll() {
        System.out.println( set.toString() );
    }


}
