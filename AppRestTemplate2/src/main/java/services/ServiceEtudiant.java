package services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class ServiceEtudiant {
    RestTemplate restTemplate = new RestTemplate();
    String  url = "http://localhost:8080/etudiants/" ;
    public List<Map<String, Object>> getAllEtudiants() {
       Map result = restTemplate.getForObject(url, Map.class);
       return (List<Map<String, Object>>) ((Map)result.get("_embedded")).get("etudiants");
    }
}
