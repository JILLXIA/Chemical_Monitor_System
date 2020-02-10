package cn.nju.edu.chemical_monitor_system.dao;

import cn.nju.edu.chemical_monitor_system.entity.ExpressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public interface ExpressDao extends JpaRepository<ExpressEntity, Serializable> {
    ExpressEntity findFirstByExpressId(int expressId);

    List<ExpressEntity> findByInputStoreId(int inputStoreId);

    List<ExpressEntity> findByOutputStoreId(int outputStoreId);
}
