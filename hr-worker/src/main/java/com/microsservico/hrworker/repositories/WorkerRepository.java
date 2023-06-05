package com.microsservico.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsservico.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
