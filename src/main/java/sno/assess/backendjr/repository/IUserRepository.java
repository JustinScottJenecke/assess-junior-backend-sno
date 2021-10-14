package sno.assess.backendjr.repository;

/**
 * Author: Justin Scott Jenecke
 * Repository interface for persisting User entities to a database
 * Date: 13/10/2021
 * */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sno.assess.backendjr.entity.User;

@Repository
public interface IUserRepository extends JpaRepository <User, String> {
}
