package home.konstantin.tarletski.tallink.repository;

import home.konstantin.tarletski.tallink.model.Participant;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ParticipantRepository extends CrudRepository<Participant, Long> {

    Optional<Participant> findByFirstNameAndLastName(String firstName, String lastName);

}
