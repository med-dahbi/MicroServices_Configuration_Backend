package DAHIBI.controller;

import java.io.Serializable;

public class Constants implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1489390404040245851L;
	String prefix;
	String suffix;
	String defaultValue;
	String message;
    String  username;
    String url;
    String password;
    int port;
    String nom_application;
    String config;
    String Db;
    
    
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getNom_application() {
		return nom_application;
	}
	public void setNom_application(String nom_application) {
		this.nom_application = nom_application;
	}
	
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getConfig() {
		return config;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public String getDb() {
		return Db;
	}
	public void setDb(String db) {
		Db = db;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}