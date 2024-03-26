package fr.uga.l3miage.tp4.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity@Data
@NoArgsConstructor
@AllArgsConstructor


public class EcosSessionProgrammationEntity {
    @Id
    private Long id;
    private String label;

    @OneToMany(mappedBy = "ecosSessionProgrammationEntity")
    private Set<EcosSessionProgrammationStepEntity> ecosSessionProgrammationStepEntities;
}