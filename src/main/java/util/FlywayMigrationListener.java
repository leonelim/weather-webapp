package util;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;


@WebListener
public class FlywayMigrationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("org.postgresql.Driver");
            Flyway flyway = Flyway.configure().dataSource("jdbc:postgresql://localhost:5432/weather_app", "postgres", "lobanoff").load();
            flyway.migrate();
            System.out.println("MIGRATION SUCCESSFUL");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("MIGRATION FAILED");
        }
    }


}
