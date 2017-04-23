package com.company;


public class PetRock {

    private String name ;
    private boolean happy = false;


    public PetRock(String name) {

        this.name = name;

        if (name.isEmpty())
        {

            throw  new IllegalArgumentException();

        }
    }

    public String getName() {
        return name;
    }




    public boolean isHappy() {

        return happy;

    }

    public void playWithRock() {

        happy = true;
    }


    public String getHappyMessage()
    {
/*        if (!happy)
        {

            throw  new IllegalStateException();

        }*/

        return "Happy :D" ;
    }


    public void waitTillHappy()
    {
        while (!happy)
        {

        }
    }

    public int getFavNumber() {
        return 42;
    }
}
