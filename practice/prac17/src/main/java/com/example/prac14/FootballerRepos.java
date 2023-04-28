package com.example.prac14;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

@Repository
public class FootballerRepos {
//    private final JdbcTemplate jdbcTemplate;

    private Session session;
    private final SessionFactory sessionFactory;

    private CriteriaBuilder builder;
    private CriteriaQuery<Club> criteriaQuery;
    private Root<Club> root;

    public FootballerRepos(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        criteriaQuery = builder.createQuery(Club.class);
        root = criteriaQuery.from(Club.class);
    }

    public List<Club> getFootballerClubs(int id) {
        criteriaQuery.select(root).where(builder.equal(root.get("footballerID"), id));
        Query<Club> query = session.createQuery(criteriaQuery);
        return query.getResultList();
    }

}
