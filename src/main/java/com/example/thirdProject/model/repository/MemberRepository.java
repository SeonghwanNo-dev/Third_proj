package com.example.thirdProject.model.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.thirdProject.model.entity.Member;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member, Long> {
    @Override
    ArrayList<Member> findAll();
}
