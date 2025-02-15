package com.raj.library.Service;

import com.raj.library.entity.Seller;
import com.raj.library.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepo;

    public boolean registerSellerService(String userName,String password,String name,String phoneNumber,String emailId){
        try {
            Seller seller = new Seller();
            seller.setUserName(userName);
            seller.setPassword(password);
            seller.setName(name);
            seller.setPhoneNumber(phoneNumber);
            seller.setEmailId(emailId);
            sellerRepo.save(seller);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean sellerCheckerService(String userName, String password){
        try {
            Seller temp = sellerRepo.findByUsernameAndPassword(userName,password);
            if(temp!=null){
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return  false;
        }
    }
}
