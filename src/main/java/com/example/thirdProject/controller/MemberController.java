package com.example.thirdProject.controller;

import com.example.thirdProject.entity.Article;
import com.example.thirdProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.thirdProject.dto.MemberForm;
import com.example.thirdProject.entity.Member;
import com.example.thirdProject.repository.MemberRepository;

import java.util.ArrayList;


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

    @GetMapping("/members/{id}")
    public String show(@PathVariable Long id, Model model)
    {
        System.out.println(id);
        Member memberEntity = memberRepository.findById(id).orElse(null);
        model.addAttribute("member", memberEntity);
        return "members/show";
    }

    @GetMapping("/members")
    public String index(Model model)
    {
        ArrayList<Member> memberEntityList = memberRepository.findAll();
        model.addAttribute("memberList", memberEntityList);
        return "members/index";
    }

}
