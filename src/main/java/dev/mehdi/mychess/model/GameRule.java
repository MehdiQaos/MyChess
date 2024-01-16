//package dev.mehdi.mychess.model;
//
//import dev.mehdi.mychess.model.enums.IncrementType;
//import jakarta.persistence.*;
//import lombok.*;
//
//@Entity
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter @Setter
//public class GameRule {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Integer order;
//
//    @ManyToOne
//    private GameType gameType;
//
//    private Integer time; // TODO: find better name
//
//    @Enumerated(EnumType.STRING)
//    private IncrementType incrementType;
//    private Integer increment;
//}