package com.r1.rulesRepoService;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// this attribute is used by the mongo rest library; it will create 
// all routes (GET/POST/PUT/PATCH/DELETE) and use the collection as 
// defined in the parameter.
@RepositoryRestResource(collectionResourceRel = "rule", path = "rules")
public interface RuleRepository extends MongoRepository<Rule, String> {

    List<Rule> findByRuleName(@Param("ruleName") String ruleName);
}