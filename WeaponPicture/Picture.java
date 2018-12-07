package com.company.WeaponPicture;

public class Picture {

    private int choose;

    public void SetChoose(int choose){this.choose=choose;}

    private void Stone(){
        System.out.print("\n******\n********\n********\n\n\n");
    }

    private void Paper(){
        System.out.print("\n---------\n|       |\n |        |\n  |        |\n  |        |\n |        |\n ----------\n\n\n");
    }

    private void Kolodjaz(){
        System.out.print("\n /-------|\n/~~~~~~~~|\n+--------+\n| |    | |\n| |____| |\n+/----/--+\n\n\n");
    }

    private void Cutters(){
        System.out.print("{]_____\n{]-----\n\n\n");
    }

    public void VS(){
        System.out.print("---    ---  +---/\n\\ \\ /  /  |--+\n \\\\| /    ---|\n\n\n");

    }

    public void DrawWeapon(int ans){
        if(ans==1){
            Stone();
        }
        else if(ans==2){
            Paper();
        }

        else if(ans==3){
            Kolodjaz();
        }

        else if(ans==4){
            Cutters();
        }
    }
}
