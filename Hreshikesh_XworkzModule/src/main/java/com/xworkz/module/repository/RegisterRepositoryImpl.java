package com.xworkz.module.repository;

import com.xworkz.module.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

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

            Query query=manager.createNamedQuery("getSignUpDetails");
            query.setParameter("nameBy",name);


           register= (RegisterEntity)query.getSingleResult();





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
            System.out.println(register);

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


            Query query=entityManager.createNamedQuery("updateQuery");
            query.setParameter("passwordBy",password);
            query.setParameter("emailBy",email);

            query.executeUpdate();





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
    public RegisterEntity updateProfile(RegisterEntity register) {
        EntityManager entityManager=null;
        EntityTransaction transaction=null;
        RegisterEntity register2=new RegisterEntity();
        try{
            entityManager=factory.createEntityManager();
            transaction= entityManager.getTransaction();
            transaction.begin();
            RegisterEntity register1=findByEmail(register.getEmail());
            register1.setName(register.getName());
            register1.setEmail(register.getEmail());
            register1.setPhone(register.getPhone());
            register1.setAge(register.getAge());
            register1.setAddress(register.getAddress());
            register1.setPassword(register.getPassword());

            entityManager.merge(register1);

            transaction.commit();
            transaction.begin();

            register2=findByEmail(register.getEmail());
            System.out.println(register2);


            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return register2;
    }
}
