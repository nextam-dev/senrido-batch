/**
 * 
 */
package jp.co.senrido.batch.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import jp.co.senrido.batch.entity.TVisionLoss;

/**
 * @author takam
 *
 */
@Dao
@ConfigAutowireable
public interface TVisionLossDao {
	
	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	List<TVisionLoss> selectById(Integer id);
	
	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	TVisionLoss selectByDto(Integer id, LocalDateTime visitDate);

	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	List<TVisionLoss> selectAll();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(TVisionLoss entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(TVisionLoss entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(TVisionLoss entity);
}
