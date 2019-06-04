package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.entity.UserEntity;

public interface UserRepository 
	extends JpaRepository<UserEntity, Long> {
	// User findById(); ==> 자동으로 생성됨
	// find ==> select문
	UserEntity findByUserId(String userId);	// id : 자동증가번호, userId : 회원가입 시 생성 id
	List<UserEntity> findByName(String name);
	List<UserEntity> findByNameOrderByIdAsc(String name);
	List<UserEntity> findByCompany(String company);
}
