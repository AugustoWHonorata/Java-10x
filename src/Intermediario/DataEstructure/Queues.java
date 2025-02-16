package Intermediario.DataEstructure;


import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Kakashi");
        System.out.println(ninjasQueue);

        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println(ninjasQueue);
        System.out.println(ninjasQueue.peek());

        ninjasQueue.offer("Tobirama Senju");
        System.out.println(ninjasQueue);

    }
}
