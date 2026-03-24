package ex240326;

public class DataBaseConnection {
    private String type;
    private String connectionString;
    private boolean connected;

    public DataBaseConnection(String type, String conStr){
        this.type = type;
        this.connectionString = conStr;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getConnectionString() {
        return connectionString;
    }
    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    // methods:
    public boolean isConnected(){
        return this.connected;
    }
    public void connect(){
        this.connected = true;
    }
    public void disconnect(){
        this.connected = false;
    }
    public void makeQuery(String query){
        // פה נבדוק האם אנחנו מחוברים
        // ורק אם כן- אז נבצע שאילתא על הבסיס נתונים
    }

    @Override
    public String toString() {
        return "DataBaseConnection{" +
                "type='" + type + '\'' +
                ", connectionString='" + connectionString + '\'' +
                ", connected=" + connected +
                '}';
    }
}
