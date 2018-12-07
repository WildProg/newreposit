package com.company;

import com.company.WeaponPicture.Picture;
import java.util.Scanner;

public class menu{
    Bot bot=new Bot();
    Variant user=new Variant();



    public void Message(){
        bot.SetAttack();
        System.out.println("bot had choose her weapon\nNow is your way {!}");
    }

    public void MessageToAttack() {

        Scanner gt=new Scanner(System.in);
        int wep;
        System.out.println("1.Stone\n2.Paper\n3.Sump\n4.Cutters\n");
        wep=gt.nextInt();
        user.SetWeapon(wep);


    }

    public void fault(){
        System.out.println("You lose");
    }

    public void win(){
        System.out.println("Win");
    }

    public void draw(){
        System.out.println("Draw");
    }

    public void Result(){

        int us=user.GetWeapon();
        int bt=bot.GetAttack();

        Picture pict=new Picture();

        System.out.println("Bot Weapon\n");
        pict.SetChoose(bt);pict.DrawWeapon(bt);

        pict.VS();

        System.out.println("Your weapon\n");
        pict.SetChoose(us);pict.DrawWeapon(us);

        if(us==bt){
           draw();
        }
        else if(us==1&&bt==2||us==1&&bt==3||us==2&&bt==4||us==3&&bt==2||us==4&&bt==1||us==4&&bt==3)
        {
           fault();
        }

        else if(us==1&&bt==4||us==2&&bt==1||us==2&&bt==3||us==3&&bt==1||us==3&&bt==4||us==4&&bt==2)
        {
            win();
        }


    }

}
