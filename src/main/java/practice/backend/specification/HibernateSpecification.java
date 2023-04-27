package practice.backend.specification;

import org.hibernate.criterion.Criterion;

public interface HibernateSpecification {

    Criterion toCriteria();

}
