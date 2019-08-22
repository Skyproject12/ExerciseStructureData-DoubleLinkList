package com.company;

public class link <T> implements dll <T> {
    private Node head;
    private Node tail;
    int size;

    public link() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isonedata() {
        return false;
    }

    @Override
    public boolean isnumberexist(int number) {
        return false;
    }

    @Override
    public void insertnull(T newinfo) {

    }

    @Override
    public void insertdfirs(T data) {
        Node newnode = new Node(data);
        if(size==0){
            head=newnode;
            tail=newnode;
        }
        else {
            head.setNext(newnode);
            newnode.setNext(head);
            head = newnode;
        }
        size++;

}

    @Override
    public void insertlast(T data) {
        Node newnode= new Node( data);
        if(size==0) {
            head=tail=null;
            newnode.prev=tail;
            tail=newnode;
        }
        size++;

    }

    @Override
    public void deletelast() {

    }

    @Override
    public void deletenull() {

    }

    @Override
    public void deletefirs() {

    }

    @Override
    public void deletebynumber(int number) {

    }

    @Override
    public Node findnode(int number) {
        return null;
    }

    @Override
    public T view() {

            Node current =  head;
            if(current==null){
                System.out.println("data anda kosong");
            }
            if(current!=null){
                current.tampil();
                while(current!=null){
                    current=current.next;
                }
            }
            return null;


    }

    @Override
    public void viewInverse() {

        Node current =  tail;
        if(current==null){
            System.out.println("data anda kosong");
        }
        if(current!=null){
            current.tampil();
            while(current!=null){
                current=current.prev;
            }
        }
        return;

    }
}
