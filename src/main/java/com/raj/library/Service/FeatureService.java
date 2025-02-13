package com.raj.library.Service;

import com.raj.library.entity.Seller;
import com.raj.library.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatureService {
    @Autowired
    private SellerRepository sellerRepository;
    public ResponseEntity<List<Seller>> searchSellersByBook(String title){
        List<Seller> sellers = sellerRepository.findSellersByBookTitle(title);
        return ResponseEntity.ok(sellers);
    }
}
