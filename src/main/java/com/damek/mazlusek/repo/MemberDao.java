package com.damek.mazlusek.repo;

import java.util.List;

import com.damek.mazlusek.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
