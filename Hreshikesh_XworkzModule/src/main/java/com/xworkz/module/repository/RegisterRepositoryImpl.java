package com.xworkz.module.repository;

import com.mysql.cj.x.protobuf.MysqlxExpr;
import com.xworkz.module.entity.RegisterEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class RegisterRepositoryImpl implements RegisterRepository{
    EntityManagerFactory factory= Persistence.createEntityManagerFactory("module");
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
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }

        return false;
    }

    @Override
    public RegisterEntity find(String name, String password) {
        EntityManager manager=null;
        EntityTransaction transaction=null;
        RegisterEntity register=new RegisterEntity();

        try {
            manager= factory.createEntityManager();
            transaction=manager.getTransaction();
            transaction.begin();

            Query query=manager.createNamedQuery("getSignUpDetails");
            query.setParameter("nameBy",name);
            query.setParameter("passwordBy",password);

           register= (RegisterEntity)query.getSingleResult();

            System.out.println(register);




            transaction.commit();

        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            manager.close();
        }

        return register;

    }
}
