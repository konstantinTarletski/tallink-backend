package home.konstantin.tarletski.tallink.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conference")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", length = 150, unique = true, nullable = false)
    private String name;

    @Column(name = "DATE", nullable = false)
    private LocalDate date;

    @Column(name = "TIME", nullable = false)
    private LocalTime time;

}
