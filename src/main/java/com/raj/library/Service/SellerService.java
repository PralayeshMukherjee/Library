package com.raj.library.Service;

import com.raj.library.entity.Seller;
import com.raj.library.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepo;


//    public void addAdmin(Seller admin){
//        adminRepo.save(admin);
//    }
//
//    public boolean checkUserName(Seller admin){
//        if(adminRepo.existsById(admin.getUserName())){
//            return true;
//        }else{
//            return false;
//        }
//    }
//    private String adminUserName;
//    public boolean checkPassword(Seller admin){
//        Optional<Seller> byId = adminRepo.findById(admin.getUserName());
//        System.out.println(byId.get().getPassword());
//        System.out.println(admin.getPassword());
//        if(byId.get().getPassword().equals(admin.getPassword())){
//            adminUserName = byId.get().getUserName();
//            return true;
//        }else{
//            return false;
//        }
//    }
//    public Seller getAdmin(){
//        Optional<Seller> byId = adminRepo.findById(adminUserName);
//        return byId.get();
//    }
}
