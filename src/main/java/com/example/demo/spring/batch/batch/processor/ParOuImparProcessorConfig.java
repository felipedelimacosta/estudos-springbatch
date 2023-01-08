package com.example.demo.spring.batch.batch.processor;

import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParOuImparProcessorConfig {


    @Bean
    public FunctionItemProcessor<Integer, String> parOuImparProcessor() {
        return new FunctionItemProcessor<Integer, String>
                (integer -> integer % 2 == 0 ? String.format("Item %s, é Par", integer) :String.format("Item %s, é Impar", integer));

    }

}
