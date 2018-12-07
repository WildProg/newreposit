    package com.company;


    public class Bot {
    private int attack;

    public void SetAttack(){
        int a=1,b=4;
        this.attack=a+(int)(Math.random()*b);
    }

    public int GetAttack(){return attack;}
}
