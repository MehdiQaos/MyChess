package dev.mehdi.mychess.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "_user")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;

    private String firstName;
    private String lastName;

    @ManyToOne
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Rating> ratings;
}
