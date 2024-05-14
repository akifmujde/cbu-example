package com.cbu.project.repository;

import com.cbu.project.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    @Query(nativeQuery = true, value = "select * from address where member_id = ?1")
    List<AddressEntity> findAllByMemberId(Long memberId);

    @Query(nativeQuery = true, value = "select exists(select * from address where member_id = ?1 and title = ?2)")
    Boolean isExistsByMemberIdAndTitle(Long memberId, String title);
}
