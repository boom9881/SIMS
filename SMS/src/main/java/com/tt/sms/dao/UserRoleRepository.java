package com.tt.sms.dao;

import com.tt.sms.vo.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole,Long>{

    UserRole findByUserIdAndRoleId(Long userId,Long roleId);
}
