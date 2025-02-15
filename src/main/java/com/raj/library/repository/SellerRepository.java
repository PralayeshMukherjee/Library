package com.raj.library.repository;

import com.raj.library.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {
//    add a JPQL to use query
    @Query("SELECT s FROM Seller s JOIN s.books b WHERE b.title LIKE %:title%")
    List<Seller> findSellersByBookTitle(@Param("title")String title);
    Seller findByUsernameAndPassword(String userName,String password);
}
