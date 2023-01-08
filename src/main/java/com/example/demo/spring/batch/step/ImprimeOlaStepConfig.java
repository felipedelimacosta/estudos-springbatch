package com.example.demo.spring.batch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.batch.item.support.IteratorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeOlaStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step imprimeParImpartep(IteratorItemReader<Integer> contaAteDezReader,
                                   FunctionItemProcessor<Integer, String> parOuImparProcessor,
                                   ItemWriter<String> imprimeWriter) {
        return stepBuilderFactory
                .get("imprimeOlaStep")
                .<Integer, String> chunk(1) //<LIDO, ESCRITO> chunk
                .reader(contaAteDezReader)
                .processor(parOuImparProcessor)
                .writer(imprimeWriter)
                .build();

    }
}
