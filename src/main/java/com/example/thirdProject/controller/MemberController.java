package com.example.thirdProject.controller;

import com.example.thirdProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thirdProject.dto.MemberForm;
import com.example.thirdProject.entity.Member;
import com.example.thirdProject.repository.MemberRepository;


@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public String signUpPage()
    {
        return "members/new";
    }

    @PostMapping("/join")
    public String createMember(MemberForm form)
    {
        Member member = form.toEntity();
        Member saved = memberRepository.save(member);
        return "";
    }
}
