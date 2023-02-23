package Templates.Creacionales.Singleton;

public class Singleton {
    //1) attribute same type
    private static Singleton instance = null;

    //2) constructor private
    private Singleton(){
        System.out.println("Creacion deberia mostrarse 1 sola vez  SINGLETON 3");
    }

    private synchronized static void create(){
        if (instance == null){
            instance = new Singleton();
        }
    }


    // global access
    public static Singleton getInstance(){
        if (instance == null){
            create();
        }
        return instance;
    }
}
