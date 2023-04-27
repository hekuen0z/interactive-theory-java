package practice.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.backend.entities.InformationEntity;
import practice.backend.specification.InformationSpecification;

import java.util.List;

public interface InformationRepository {

    void addInformation(InformationEntity informationEntity);
    void removeInformation(InformationEntity informationEntity);
    void updateInformation(InformationEntity informationEntity);

    List query(InformationSpecification specification);

}
