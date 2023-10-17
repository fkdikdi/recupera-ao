/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10092957137
 */
public class ProdutoDAO extends DAO_Abstract{

     @Override
    public void insert(Object object) {
         session.beginTransaction();
       session.save(object);
       session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
         session.beginTransaction();
        session.flush();
       session.clear();
       session.update(object);
       session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
         session.beginTransaction();
       session.flush();
       session.clear();
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
         session.beginTransaction();
        Criteria criteria = session.createCriteria(TipoDAO.class);
        criteria.add(Restrictions.eq("jl_Id_Produto", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    public List listAll() {
         session.beginTransaction();
        Criteria criteria = session.createCriteria(TipoDAO.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista;
    }

    @Override
    public List listALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
