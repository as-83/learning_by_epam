package com.abdsul.concurency.deadlock;

public class DeadlockMain {
    public static void main(String[] args) {
        InviteAction invite1 = new InviteAction("first");
        InviteAction invite2 = new InviteAction("second");
        new Thread(() -> invite1.invite(invite2)).start();
        //Removes deadlock
        /* try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        new Thread(() -> invite2.invite(invite1)).start();
    }
}

