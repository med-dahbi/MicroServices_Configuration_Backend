package DAHIBI.controller;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/GestionDesEnseignants")
public class UpdatePropertiesGestionEnseignants {
	
	@PostMapping("/Default")
	public static PropertiesConfiguration main(@RequestBody Constants cns) throws org.apache.commons.configuration.ConfigurationException, ConfigurationException {
        PropertiesConfiguration properties = new PropertiesConfiguration("C://configrepo//localconfig//gestionDesEnseignants.properties");
        properties.setProperty("defaultValue", cns.getDefaultValue());
        properties.setProperty("prefix", cns.getPrefix());
		properties.setProperty("suffix", cns.getSuffix());
		properties.setProperty("message", cns.getMessage());
        properties.setProperty("defaultValue", cns.getDefaultValue());
		properties.setProperty("username", cns.getUsername());
		properties.setProperty("url", cns.getUrl());
		properties.setProperty("password", cns.getPassword());
		properties.setProperty("port", cns.getPort());
		properties.setProperty("nom_application", cns.getNom_application());
		properties.setProperty("config", cns.getConfig());
		
	
		properties.setProperty("spring.datasource.url", cns.getUrl());
		
		properties.setProperty("spring.datasource.password", cns.getPassword());
		
		properties.setProperty("server.port", cns.getPort());
		
		properties.setProperty("spring.application.name", cns.getNom_application());
		
		properties.setProperty("spring.cloud.config.uri", cns.getConfig());
		properties.setProperty("spring.datasource.username", cns.getUsername());
		properties.save();
		return properties;
     
    }
	@PostMapping("/Production")
	public static PropertiesConfiguration main1(@RequestBody Constants cns) throws org.apache.commons.configuration.ConfigurationException, ConfigurationException {
        PropertiesConfiguration properties = new PropertiesConfiguration("C://configrepo//localconfig//gestionDesEnseignants-production.properties");
        properties.setProperty("defaultValue", cns.getDefaultValue());
        properties.setProperty("prefix", cns.getPrefix());
		properties.setProperty("suffix", cns.getSuffix());
		properties.setProperty("message", cns.getMessage());
        properties.setProperty("defaultValue", cns.getDefaultValue());
		properties.setProperty("username", cns.getUsername());
		properties.setProperty("url", cns.getUrl());
		properties.setProperty("password", cns.getPassword());
		properties.setProperty("port", cns.getPort());
		properties.setProperty("nom_application", cns.getNom_application());
		properties.setProperty("config", cns.getConfig());
		
	
		properties.setProperty("spring.datasource.url", cns.getUrl());
		
		properties.setProperty("spring.datasource.password", cns.getPassword());
		
		properties.setProperty("server.port", cns.getPort());
		
		properties.setProperty("spring.application.name", cns.getNom_application());
		
		properties.setProperty("spring.cloud.config.uri", cns.getConfig());
		properties.setProperty("spring.datasource.username", cns.getUsername());
		properties.save();
		return properties;
     
    }
	@PostMapping("/Developpement")
	public static PropertiesConfiguration main2(@RequestBody Constants cns) throws org.apache.commons.configuration.ConfigurationException, ConfigurationException {
        PropertiesConfiguration properties = new PropertiesConfiguration("C://configrepo//localconfig//gestionDesEnseignants-developpement.properties");
        properties.setProperty("defaultValue", cns.getDefaultValue());
        properties.setProperty("prefix", cns.getPrefix());
		properties.setProperty("suffix", cns.getSuffix());
		properties.setProperty("message", cns.getMessage());
        properties.setProperty("defaultValue", cns.getDefaultValue());
		properties.setProperty("username", cns.getUsername());
		properties.setProperty("url", cns.getUrl());
		properties.setProperty("password", cns.getPassword());
		properties.setProperty("port", cns.getPort());
		properties.setProperty("nom_application", cns.getNom_application());
		properties.setProperty("config", cns.getConfig());
		
	
		properties.setProperty("spring.datasource.url", cns.getUrl());
		
		properties.setProperty("spring.datasource.password", cns.getPassword());
		
		properties.setProperty("server.port", cns.getPort());
		
		properties.setProperty("spring.application.name", cns.getNom_application());
		
		properties.setProperty("spring.cloud.config.uri", cns.getConfig());
		properties.setProperty("spring.datasource.username", cns.getUsername());
		properties.save();
		return properties;
     
    }
	@PostMapping("/Test")
	public static PropertiesConfiguration main3(@RequestBody Constants cns) throws org.apache.commons.configuration.ConfigurationException, ConfigurationException {
        PropertiesConfiguration properties = new PropertiesConfiguration("C://configrepo//localconfig//gestionDesEnseignants-test.properties");
        properties.setProperty("defaultValue", cns.getDefaultValue());
        properties.setProperty("prefix", cns.getPrefix());
		properties.setProperty("suffix", cns.getSuffix());
		properties.setProperty("message", cns.getMessage());
        properties.setProperty("defaultValue", cns.getDefaultValue());
		properties.setProperty("username", cns.getUsername());
		properties.setProperty("url", cns.getUrl());
		properties.setProperty("password", cns.getPassword());
		properties.setProperty("port", cns.getPort());
		properties.setProperty("nom_application", cns.getNom_application());
		properties.setProperty("config", cns.getConfig());
		
	
		properties.setProperty("spring.datasource.url", cns.getUrl());
		
		properties.setProperty("spring.datasource.password", cns.getPassword());
		
		properties.setProperty("server.port", cns.getPort());
		
		properties.setProperty("spring.application.name", cns.getNom_application());
		
		properties.setProperty("spring.cloud.config.uri", cns.getConfig());
		properties.setProperty("spring.datasource.username", cns.getUsername());
		properties.save();
		return properties;
     
    }

}
