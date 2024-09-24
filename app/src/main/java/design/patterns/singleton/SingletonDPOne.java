package design.patterns.singleton;

//Intialize an object following singleton design pattern
//Object will be created only once
//Problem : When multiple thread call getSingletonDPOne() at the same time then it will create seperate objects which voilates singleton pattern
//Check SingletonDPTwo.java for above problem

public class SingletonDPOne {

    private static SingletonDPOne singletonDPOne;

    private SingletonDPOne(){

    }

    public static SingletonDPOne getSingletonDPOne(){
        if(singletonDPOne == null){
            singletonDPOne = new SingletonDPOne();
            return singletonDPOne;
        }
        
        return singletonDPOne;
    }
    
}
