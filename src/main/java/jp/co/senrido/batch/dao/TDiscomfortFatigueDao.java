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

import jp.co.senrido.batch.entity.TDiscomfortFatigue;

/**
 * @author takam
 *
 */
@Dao
@ConfigAutowireable
public interface TDiscomfortFatigueDao {
	
	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	List<TDiscomfortFatigue> selectById(Integer id);

	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	TDiscomfortFatigue selectByDto(Integer id, LocalDateTime visitDate);
	
	/**
	 * @return the TVisitingHospital entity List
	 */
	@Select
	List<TDiscomfortFatigue> selectAll();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(TDiscomfortFatigue entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(TDiscomfortFatigue entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(TDiscomfortFatigue entity);
}
