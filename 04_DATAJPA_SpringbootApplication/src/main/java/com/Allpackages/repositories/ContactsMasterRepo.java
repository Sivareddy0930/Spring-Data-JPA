package com.Allpackages.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.Allpackages.entities.ContactsMasterEntity;

//public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity, Number> {
//
//}

public interface ContactsMasterRepo extends CrudRepository<ContactsMasterEntity,Serializable> {

}