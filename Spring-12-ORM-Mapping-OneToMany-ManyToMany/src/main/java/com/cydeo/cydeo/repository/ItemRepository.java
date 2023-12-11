package com.cydeo.cydeo.repository;

import com.cydeo.cydeo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
