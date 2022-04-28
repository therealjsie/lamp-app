package de.jsie.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GreetingServiceTest {

    @Mock
    Jdbi jdbi;

    @Test
    void greeting() {
         final GreetingService greetingService = new GreetingService(jdbi);
         final String greeting = greetingService.greeting();
         assertThat(greeting).isEqualTo("Hello, World!");
    }
}