package com.cmedinaa.authentication.server.repositories;

import com.cmedinaa.authentication.server.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    /**
     *
     * @param loginName
     * @return
     */
    User findByLoginName(String loginName);
}
