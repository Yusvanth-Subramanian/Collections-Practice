package IterableInterface.exWithOutInterableInterface;

public class Main {

    public static void main(String args[]){

        GenericList<Object> lst = new GenericList<>();
        lst.items[0]=1;
        lst.items[1]=2;
        lst.items[2]=3;
        lst.add(4);

        for(Object i:lst.items){
            System.out.print(i+" ");
        }


    }
}
