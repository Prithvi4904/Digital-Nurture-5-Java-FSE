
package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Skill;
import com.cognizant.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repository;

    public List<Skill> getAllSkills() {
        return repository.findAll();
    }

    public Skill save(Skill skill) {
        return repository.save(skill);
    }

}