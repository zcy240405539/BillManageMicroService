package com.framework.jpa;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.framework.jpa.BillsEntity;

public interface BillRepository extends JpaRepository<BillsEntity, String>{
	 @Query("SELECT b FROM BillsEntity b WHERE b.orderid=?1")
	 public List<BillsEntity> findByOrder(String orderid);
	 @Query("SELECT b FROM BillsEntity b WHERE b.userid=?1")
	 public List<BillsEntity> findByUser(String userid);
}
