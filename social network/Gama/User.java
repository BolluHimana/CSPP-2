import java.util.*;
class User{
    private String name;
    private User[] connections;
    private int NoOfConnections; 
User(final String n,final User[] con,final int c){
    this.name=n;
    this.connections=con;
    this.NoOfConnections=c;
}
public String getName(){
    return this.name;
}
public User[] getConnections(){
    return this.connections;
}
public int getNoConnections(){
    return this.NoOfConnections;
}
public void setName(final String toSet) {
    this.name = toSet;
}
public void setConnections(final User[] toSet ) {
    this.connections = toSet;
}
public void setNoOfConnections(final int toSet) {
    this.NoOfConnections = toSet;
}
public String toString(){
    return this.name +" is connected to"+ this.connections; 
}
}