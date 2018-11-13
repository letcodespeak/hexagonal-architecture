
package com.codespeaks.hexagonal.adapter.console;

import com.codespeaks.hexagonal.adapter.repository.InMemoryCusotmerRepositoryImpl;
import com.codespeaks.hexagonal.repository.CustomerRepository;
import com.codespeaks.hexagonal.service.CustomerService;
import com.codespeaks.hexagonal.service.CustomerServiceImpl;
import com.google.inject.AbstractModule;

/**
 * Guice module for binding production dependencies
 */
public class CommandConsoleModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(CustomerRepository.class).to(InMemoryCusotmerRepositoryImpl.class);
        bind(CustomerService.class).to(CustomerServiceImpl.class);
        bind(CommandInterface.class).to(CommandInterfaceImpl.class);
    }
}
