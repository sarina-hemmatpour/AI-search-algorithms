package com.example.a8puzzleproblem;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.transform.Source;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("hey");

        ArrayList<Integer> integers=new ArrayList<>();
//        integers.add(3);
//        integers.add(1);
//        integers.add(2);
//        integers.add(6);
//        integers.add(4);
//        integers.add(5);
//        integers.add(7);
//        integers.add(0);
//        integers.add(8);
//        integers.add(3);
//        integers.add(1);
//        integers.add(2);
//        integers.add(6);
//        integers.add(4);
//        integers.add(5);
//        integers.add(7);
//        integers.add(8);
//        integers.add(0);


//        Node startNode=new Node(new State(integers) , 0 ,0 ,0 ,null );
//


        System.out.println("**********************************");

        ArrayList<Integer> integers2=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(0);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);


        integers2.add(8);
        integers2.add(1);
        integers2.add(2);
        integers2.add(0);
        integers2.add(4);
        integers2.add(3);
        integers2.add(7);
        integers2.add(6);
        integers2.add(5);


//        AStarSearch aStarSearch=new AStarSearch(startNode);
//        aStarSearch.search(2);

//
//        System.out.println(RandomNumbers.randomPuzzle());
        Node startNode=new Node(new State(integers) , 0 ,0 ,0 ,null );



        long s=System.currentTimeMillis();

//        UniformCostSearch uniformCostSearch=new UniformCostSearch(startNode);
//        uniformCostSearch.search();

        System.out.println("IDS:");
        IterativeDeepeningSearch iterativeDeepeningSearch=new IterativeDeepeningSearch(startNode);
        iterativeDeepeningSearch.search();
        System.out.println(Time.timeDuration(s,System.currentTimeMillis()));

        s=System.currentTimeMillis();
        System.out.println("A*:");
        AStarSearch aStarSearch=new AStarSearch(startNode);
        aStarSearch.search(1);
        System.out.println(Time.timeDuration(s,System.currentTimeMillis()));


        s=System.currentTimeMillis();
        System.out.println("IDA*:");
        IterativeDeepeningAStarSearch ida=new IterativeDeepeningAStarSearch(startNode);
        ida.search(1);
        System.out.println(Time.timeDuration(s,System.currentTimeMillis()));



    }
}
