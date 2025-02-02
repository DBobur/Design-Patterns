package creational.factory_method.database.model_factory;

import creational.factory_method.database.DatabaseConnection;
import creational.factory_method.database.DatabaseConnectionFactory;
import creational.factory_method.database.model.MysqlConnection;

public class MysqlConnectionFactory extends DatabaseConnectionFactory {
    @Override
    public DatabaseConnection getConnection() {
        return new MysqlConnection();
    }
}
