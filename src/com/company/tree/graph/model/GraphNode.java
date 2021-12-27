package com.company.tree.graph.model;

import java.util.ArrayList;

public class GraphNode {
    ArrayList<GraphNode> neighbors = new ArrayList<>();
    boolean hasObject;

    public ArrayList<GraphNode> getNeighbors() {
        return neighbors;
    }

    public boolean hasObject() {
        return hasObject;
    }
}