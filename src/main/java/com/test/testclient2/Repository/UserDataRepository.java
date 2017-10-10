package com.test.testclient2.Repository;

import com.test.testclient2.DataUserModel;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by ganumukkal.hemakumar on 9/28/2017.
 */@Transactional
public interface UserDataRepository extends CrudRepository<DataUserModel, Long> {

    public DataUserModel findByUsername(String name);


}
