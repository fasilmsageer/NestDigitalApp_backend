package com.nest.NestDigitalApp_backend.dao;

import com.nest.NestDigitalApp_backend.model.LeaveApplication;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LeaveApplicationDao extends CrudRepository<LeaveApplication,Integer> {

    @Query(value = "SELECT emp.`designation`, emp.`empcode`, emp.`empname`, lap.`applied_date`, lap.`from_date`, lap.`leavetype`,  lap.`status`, lap.`to_date` FROM `employee` emp JOIN `leaveapplication` lap ON emp.empcode=lap.empcode",nativeQuery = true)
    List<Map<String,String>> ViewAllLeave();

    @Modifying
    @Transactional
    @Query(value = "UPDATE `leaveapplication` SET  `status`= :status WHERE `empcode`= :empcode",nativeQuery = true)
    void UpdateStatus(@Param("empcode") String empcode, @Param("status") String status);

    @Query(value = "SELECT  lap.`empcode`, lap.`from_date`, lap.`leavetype`, lap.`remarks`, lap.`status`,lap.`applied_date`, lap.`to_date` FROM `leaveapplication` lap JOIN `employee` emp ON lap.`empcode`=emp.empcode",nativeQuery = true)
    List<Map<String,String>> LeaveById(@Param("id") Integer id);
}
