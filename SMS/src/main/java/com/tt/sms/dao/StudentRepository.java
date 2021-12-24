package com.tt.sms.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tt.sms.vo.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

	// 根据班级id，获取学生
	List<Student> findByClassId(Long classId, Pageable pageable);
	
}
