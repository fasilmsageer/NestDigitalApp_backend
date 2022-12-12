package com.nest.NestDigitalApp_backend.dao;


import com.nest.NestDigitalApp_backend.model.Security;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository <Security,Integer> {

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `security` WHERE `id` =:id",nativeQuery = true)
    void deleteSecurity(@Param("id")Integer id);

    @Query(value = "SELECT `id`, `email`, `phone`, `seccode`, `secname`, `secpassword`, `secusername` FROM `security` WHERE `seccode` LIKE %:seccode%",nativeQuery = true)
    List<Security> SearchSecurity(@Param("seccode") String seccode);
}
