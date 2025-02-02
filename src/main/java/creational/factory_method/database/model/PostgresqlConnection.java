package creational.factory_method.database.model;

import creational.factory_method.database.DatabaseConnection;

public class PostgresqlConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to Postgresql");
    }
}
