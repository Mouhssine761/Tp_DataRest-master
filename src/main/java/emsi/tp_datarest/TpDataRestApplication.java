package emsi.tp_datarest;





import emsi.tp_datarest.enums.Genre;
import emsi.tp_datarest.models.Centre;
import emsi.tp_datarest.models.Etudiant;
import emsi.tp_datarest.repositories.CentreRepository;
import emsi.tp_datarest.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpDataRestApplication implements CommandLineRunner {
    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpDataRestApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Centre c1 = Centre.builder()
                .nomCentre("Centre EMSI Casablanca")
                .adresse("Bd Ghandi, Casablanca")
                .build();
        centreRepository.save(c1);


        etudiantRepository.save(Etudiant.builder()
                .nom("agnaou")
                .prenom("ikram")
                .genre(Genre.Femme)
                .centre(c1)
                .build());

        etudiantRepository.save(Etudiant.builder()
                .nom("walid")
                .prenom("el amri")
                .genre(Genre.Homme)
                .centre(c1)
                .build());
    }
}

