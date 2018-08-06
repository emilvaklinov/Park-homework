package Attractions;


import Visitors.Visitor;

import java.util.ArrayList;

public abstract class Attraction  {

    private String name;
    protected ArrayList<Visitor> visitors;
    private int rating;


    public Attraction(String name){
        this.name = name;
        this.visitors = new ArrayList<>();
    }

    @Override
    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public int getVisitorsCount(){
        return visitors.size();
    }

    public void addVisitor(Visitor visitor){
        visitors.add(visitor);
    }

    public void removeVisitor(Visitor visitor){
        visitors.remove(visitor);
    }

}
