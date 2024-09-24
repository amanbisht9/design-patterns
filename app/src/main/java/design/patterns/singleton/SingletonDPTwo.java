package design.patterns.singleton;

public class SingletonDPTwo {
    private static SingletonDPTwo singletonDPTwo;

    private SingletonDPTwo(){

    }


    // Makes the whole method synchronized

    // public synchronized static SingletonDPTwo getSingletonDPTwo(){
    //     if(singletonDPTwo == null){
    //         singletonDPTwo = new SingletonDPTwo();
    //         return singletonDPTwo;
    //     }
        
    //     return singletonDPTwo;
    // }


    // Makes a block of code synchronized
    public static SingletonDPTwo getSingletonDPTwo(){

        if(singletonDPTwo == null){

            synchronized(SingletonDPTwo.class){
                if(singletonDPTwo == null){
                    singletonDPTwo = new SingletonDPTwo();
                }
            }
            
        }
        
        
        return singletonDPTwo;
    }
}
