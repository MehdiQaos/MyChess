package dev.mehdi.mychess.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User whitePlayer;

    @ManyToOne
    private User blackPlayer;

    private String pgn;
    private LocalDateTime date;
}
