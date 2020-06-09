package home.konstantin.tarletski.tallink.api;

import home.konstantin.tarletski.tallink.dto.CreateParticipantDto;
import home.konstantin.tarletski.tallink.repository.ParticipantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${application.api.participant-mapping}")
@RequiredArgsConstructor
@Slf4j
public class ParticipantApi {

    private final ParticipantRepository participantRepository;

    @PostMapping
    public void createParticipant(@RequestBody CreateParticipantDto createParticipantDto) {
        log.info("POST createParticipant");
    }

    //TODO delete, only for test
    @GetMapping
    public String createParticipant() {
        return "hello world";
    }

}
