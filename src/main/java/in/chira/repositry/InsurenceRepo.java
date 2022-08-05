package in.chira.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chira.entity.Insurence;

public interface InsurenceRepo extends JpaRepository<Insurence, Serializable> {

}
