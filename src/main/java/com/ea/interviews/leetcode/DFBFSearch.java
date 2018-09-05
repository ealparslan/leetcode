package com.ea.interviews.leetcode;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DFBFSearch {

    public static void main(String args[]){
        Graph graph = new Graph();
        graph.nodes.put("a",new GraphNode("a") );
        graph.nodes.put("b",new GraphNode("b") );
        graph.nodes.put("c",new GraphNode("c") );
        graph.nodes.put("d",new GraphNode("d") );
        graph.nodes.put("e",new GraphNode("e") );
        graph.nodes.put("f",new GraphNode("f") );
        graph.nodes.put("g",new GraphNode("g") );
        graph.nodes.put("h",new GraphNode("h") );
        graph.nodes.get("a").adjecents.add(graph.nodes.get("b"));
        graph.nodes.get("a").adjecents.add(graph.nodes.get("c"));
        graph.nodes.get("c").adjecents.add(graph.nodes.get("e"));
        graph.nodes.get("e").adjecents.add(graph.nodes.get("f"));
        graph.nodes.get("f").adjecents.add(graph.nodes.get("b"));
        graph.nodes.get("e").adjecents.add(graph.nodes.get("g"));
        graph.nodes.get("g").adjecents.add(graph.nodes.get("h"));
        graph.nodes.get("b").adjecents.add(graph.nodes.get("h"));

        System.out.println(graph);

//        System.out.println(DFsearch(graph.nodes.get("a"),"c" ));

        System.out.println(BFSearch(graph.nodes.get("a"),"f" ));
    }

    private static GraphNode BFSearch(GraphNode node, String what){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.addAll(node.adjecents);
        while (queue.size()>0){
            GraphNode onIt= queue.getFirst();
            if(!onIt.visited){
                System.out.println(onIt.name);
                onIt.visited=true;
                if(onIt.name.equals(what))
                    return onIt;
                queue.removeFirst();
                queue.addAll(onIt.adjecents);
            }
        }
        return null;
    }

    private static GraphNode DFsearch(GraphNode node, String what){
        GraphNode found = null;
        for (GraphNode adj:node.adjecents) {
            if(!adj.visited){
                adj.visited = true;
                System.out.println(adj.name);
                if(adj.name.equals(what))
                    return adj;
                found = DFsearch(adj, what);
                if(found != null) break;
            }
        }
        return found;
    }
}


class Graph{
    HashMap<String,GraphNode> nodes = new HashMap<>();
}

class GraphNode{
    String name;
    boolean visited = false;
    List<GraphNode> adjecents = new ArrayList<>();
    GraphNode(String name){
        this.name = name;
    }
}
