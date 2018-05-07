/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trials;

/**
 *
 * @author MSAUDI
 */
public class Student implements Comparable<Student>{
    int id;
    String name = "Nimo";

    private int myId;

    /**
     * Get the value of myId
     *
     * @return the value of myId
     */
    public int getMyId() {
        return myId;
    }

    /**
     * Set the value of myId
     *
     * @param myId new value of myId
     */
    public void setMyId(int myId) {
        this.myId = myId;
    }

    @Override
    public int compareTo(Student o) {
        
        if(o.id > id ) return -1;
        if(o.id < id ) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return id +"-" +name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
