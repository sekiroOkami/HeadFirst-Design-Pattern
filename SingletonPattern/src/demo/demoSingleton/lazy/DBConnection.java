package demo.demoSingleton.lazy;

/**
 * the problem is :
 * if thread 1 and thread2 visible uniqueObj both will go inside and will call the new DBConnection()
 * so 2 objects will be created in the memory.
 */
public class DBConnection {
    private static DBConnection uniqueObj;
    private static DBConnection getInstance(){
        if (uniqueObj == null) {
            uniqueObj = new DBConnection();
        }
        return uniqueObj;
    }
    private DBConnection() {
    }
}
