package com.guima.accessingdatarestapplication.repositories;

import com.guima.accessingdatarestapplication.entities.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "job", path = "job")
public interface JobRepository extends PagingAndSortingRepository<Job, Long>, CrudRepository<Job, Long> {
}
