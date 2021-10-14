package sno.assess.backendjr.service;

/**
 * Author: Justin Scott Jenecke
 * Generic service interface to standardise base business logic into CRUD functions
 * Date: 13/10/2021
 * */


public interface IService <T, Id>{

    T create (T object);
    T read (Id id);
    T update (T object);
    Boolean delete (Id id);

}
