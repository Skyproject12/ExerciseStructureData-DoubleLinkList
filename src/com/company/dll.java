package com.company;

public interface dll <T> {
    public boolean isEmpty ();
    public boolean isonedata();
    public boolean isnumberexist (int number);
    public void insertnull (T newinfo);
    public void insertdfirs (T data);
    public void insertlast (T data);
    public void deletelast();
    public void deletenull ();
    public void deletefirs ();
    public void deletebynumber (int number);
    public Node findnode (int number);
    public T view ();
    public void viewInverse ();
}