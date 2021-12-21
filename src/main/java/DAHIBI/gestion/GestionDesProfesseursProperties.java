package DAHIBI.gestion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/GestionDesProfesseurs")
public class GestionDesProfesseursProperties {
	@GetMapping("/DefaultProfile")
	public static Map<String, String> main(String[] args) {
		String propertiesFilename = "C://configrepo//localconfig//gestionDesEnseignants.properties";
		Map<String, String> properties = new HashMap<>();

		try (InputStream stream = new FileInputStream(propertiesFilename)) {
			Properties prop = new Properties() {

				private static final long serialVersionUID = -8656303820230014042L;

				@Override
				public synchronized Object put(Object key, Object value) {
					return properties.put(key.toString(), value.toString());
				}
			};
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}
	@GetMapping("/DevProfile")
	public static Map<String, String> main1(String[] args) {
		String propertiesFilename = "C://configrepo//localconfig//gestionDesEnseignants-developpement.properties";
		Map<String, String> properties = new HashMap<>();

		try (InputStream stream = new FileInputStream(propertiesFilename)) {
			Properties prop = new Properties() {

				private static final long serialVersionUID = -8656303820230014042L;

				@Override
				public synchronized Object put(Object key, Object value) {
					return properties.put(key.toString(), value.toString());
				}
			};
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}
	@GetMapping("/TestProfile")
	public static Map<String, String> main2(String[] args) {
		String propertiesFilename = "C://configrepo//localconfig//gestionDesEnseignants-test.properties";
		Map<String, String> properties = new HashMap<>();

		try (InputStream stream = new FileInputStream(propertiesFilename)) {
			Properties prop = new Properties() {

				private static final long serialVersionUID = -8656303820230014042L;

				@Override
				public synchronized Object put(Object key, Object value) {
					return properties.put(key.toString(), value.toString());
				}
			};
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}
	@GetMapping("/ProdProfile")
	public static Map<String, String> main3(String[] args) {
		String propertiesFilename = "C://configrepo//localconfig//gestionDesEnseignants-production.properties";
		Map<String, String> properties = new HashMap<>();

		try (InputStream stream = new FileInputStream(propertiesFilename)) {
			Properties prop = new Properties() {

				private static final long serialVersionUID = -8656303820230014042L;

				@Override
				public synchronized Object put(Object key, Object value) {
					return properties.put(key.toString(), value.toString());
				}
			};
			prop.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}

}
