package home.konstantin.tarletski.tallink.api;

import home.konstantin.tarletski.tallink.dto.CreateParticipantDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${application.api.participant-mapping}")
@RequiredArgsConstructor
@Slf4j
public class ParticipantApi {

    @PostMapping
    public void createParticipant(@RequestBody CreateParticipantDto createParticipantDto) {
        log.info("POST createParticipant");
    }

    @GetMapping
    public String createParticipant() {
        return "hello";
    }

}
