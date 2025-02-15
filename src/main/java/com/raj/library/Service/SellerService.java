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
