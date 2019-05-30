package idu.cs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import idu.cs.domain.User;

public interface UserRepository 
	extends JpaRepository<User, Long> {
	// User findById(); ==> 자동으로 생성됨
	// find ==> select문
	User findByUserId(String userId);	// id : 자동증가번호, userId : 회원가입 시 생성 id
	List<User> findByName(String name);
	List<User> findByNameOrderByIdAsc(String name);
	List<User> findByCompany(String company);
}
