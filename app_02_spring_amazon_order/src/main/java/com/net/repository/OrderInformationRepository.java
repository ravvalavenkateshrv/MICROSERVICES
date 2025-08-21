package com.net.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.net.entity.OrderInfo;


@Repository
public interface OrderInformationRepository extends JpaRepository<OrderInfo, Integer> {

}
