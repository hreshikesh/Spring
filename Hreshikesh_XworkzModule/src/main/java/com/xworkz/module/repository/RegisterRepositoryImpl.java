package com.xworkz.module.repository;

import com.xworkz.module.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository{
   @Autowired
    EntityManagerFactory factory;
    @Override
    public boolean save(RegisterEntity entity) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();

            transaction.begin();

            manager.persist(entity);

            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction!=null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }

        return false;
    }

    @Override
    public RegisterEntity find(String name) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        RegisterEntity register=new RegisterEntity();

        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();
            try {
                Query query = manager.createNamedQuery("getSignUpDetails");
                query.setParameter("nameBy", name);
                register= (RegisterEntity)query.getSingleResult();
            }catch (NoResultException e){
                return null;
            }


            transaction.commit();

        }catch (Exception e){

            if(transaction!=null && transaction.isActive()){
                transaction.rollback();
            } e.printStackTrace();

        }finally {
            manager.close();
        }

        return register;

    }

    @Override
    public RegisterEntity findByEmail(String email) {
        EntityManager entityManager=null;
        EntityTransaction transaction=null;
        RegisterEntity register=new RegisterEntity();
        try{
            entityManager=factory.createEntityManager();
            transaction= entityManager.getTransaction();
            transaction.begin();

           Query query= entityManager.createNamedQuery("checkEmail");
           query.setParameter("emailBy",email);
            register=(RegisterEntity) query.getSingleResult();

            transaction.commit();


        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            entityManager.close();
        }

        return register;
    }

    @Override
    public boolean updatePassword(String email, String password) {
        EntityManager entityManager=null;
        EntityTransaction transaction=null;
        RegisterEntity register=new RegisterEntity();
        try{
            entityManager=factory.createEntityManager();
            transaction= entityManager.getTransaction();
            transaction.begin();



            register=findByEmail(email);
            register.setPassword(password);
            register.setLoginAttempt(0);
            register.setLocalDateTime(null);

            entityManager.merge(register);
            transaction.commit();

            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            entityManager.close();
        }

        return false;
    }

    @Override
    public boolean updateProfile(RegisterEntity register) {
        EntityManager entityManager=null;
        EntityTransaction transaction=null;
        RegisterEntity register1=new RegisterEntity();
        try{
            entityManager=factory.createEntityManager();
            transaction= entityManager.getTransaction();
            transaction.begin();
            register1=findByEmail(register.getEmail());
            register1.setName(register.getName());
            register1.setEmail(register.getEmail());
            register1.setPhone(register.getPhone());
            register1.setAge(register.getAge());
            register1.setAddress(register.getAddress());
            register1.setImagePath(register.getImagePath());


            entityManager.merge(register1);

            transaction.commit();

            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return false;
    }

    @Override
    public void updateTable(RegisterEntity entity) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();

            manager.merge(entity);

            transaction.commit();
        }catch (Exception e){
            if(transaction!=null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }

    }

    @Override
    public Long countEmail(String email) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        long count = 0;
        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();

            Query query=manager.createNamedQuery("countEmail");
            query.setParameter("email",email);
             count=(Long) query.getSingleResult();

            transaction.commit();
        }catch (Exception e){
            if(transaction!=null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }
        return count;
    }

    @Override
    public List<String> checkPassword(String password) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        List<String> fetchedPassword=new ArrayList<>();
        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();

           Query query= manager.createNamedQuery("fetchPassword");
            fetchedPassword= query.getResultList();

            transaction.commit();
        }catch (Exception e){
            if(transaction!=null && transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }
        return fetchedPassword;
    }
}


