package com.arpit.contentmod.publishing;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends ListCrudRepository<Content, Long> {}
