package dev.chojo.guice;

import com.google.inject.AbstractModule;
import dev.chojo.configuration.Configuration;

public class ElpisModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Configuration.class).toInstance(new Configuration());
    }
}
