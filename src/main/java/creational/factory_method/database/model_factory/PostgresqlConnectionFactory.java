package creational.factory_method.database.model_factory;

import creational.factory_method.database.DatabaseConnection;
import creational.factory_method.database.DatabaseConnectionFactory;
import creational.factory_method.database.model.PostgresqlConnection;

public class PostgresqlConnectionFactory extends DatabaseConnectionFactory {
    @Override
    public DatabaseConnection getConnection() {
        return new PostgresqlConnection();
    }
}
