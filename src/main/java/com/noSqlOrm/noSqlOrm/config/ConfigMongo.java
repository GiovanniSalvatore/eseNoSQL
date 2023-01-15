package com.noSqlOrm.noSqlOrm.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class ConfigMongo extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "develhope";
    }

    @Override
    protected Collection<String> getMappingBasePackages() {
        return Collections.singleton("co.develhope");
    }

    @Override
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://Giovanni:Giovanni@cluster0.nhvm1sg.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }
}
