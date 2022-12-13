package com.nest.NestDigitalApp_backend.dao;

import com.nest.NestDigitalApp_backend.model.LeaveCount;
import org.springframework.data.repository.CrudRepository;

public interface LeaveCountDao extends CrudRepository <LeaveCount, Integer> {


}
