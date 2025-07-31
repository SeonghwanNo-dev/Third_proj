package com.example.thirdProject.repository;
import org.springframework.data.repository.CrudRepository;
import com.example.thirdProject.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
