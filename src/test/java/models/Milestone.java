package models;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "Milestones")
public class Milestone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    public Milestone(String name, String description) {
        this.name = name;
        this.description = description;
    }
}