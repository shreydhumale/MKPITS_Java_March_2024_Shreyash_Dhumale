package JavaAssignment_9;

public interface DatabaseOperations {
    //CRUD
    public void create();
    public void read();
    public void update();
    public void delete();

    public static void main(String[] args) {
        MySqlDatabase sqlDatabase=new MySqlDatabase();
        sqlDatabase.create();
        sqlDatabase.read();
        sqlDatabase.update();
        sqlDatabase.delete();

        OracleDatabase oracleDatabase=new OracleDatabase();
        oracleDatabase.create();
        oracleDatabase.read();
        oracleDatabase.update();
        oracleDatabase.delete();
    }
}
