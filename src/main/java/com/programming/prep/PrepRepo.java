package com.programming.prep;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrepRepo extends JpaRepository<Model, Integer> {
}
