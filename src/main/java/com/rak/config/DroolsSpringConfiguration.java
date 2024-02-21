package com.rak.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsSpringConfiguration {

	    private static final String RULES_DRL_PATH = "src/main/resources/workflow.drl";
	    private static final KieServices kieServices = KieServices.Factory.get();
	 
	    @Bean
	    public KieContainer kieContainer() {
	        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
	        kieFileSystem.write(RULES_DRL_PATH, 
	                kieServices.getResources().newClassPathResource("workflow.drl"));
	        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
	        kb.buildAll();
	        KieModule kieModule = kb.getKieModule();
	        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
	        return kieContainer;
	    }
}
