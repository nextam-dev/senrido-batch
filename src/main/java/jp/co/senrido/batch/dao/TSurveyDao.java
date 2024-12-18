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

import jp.co.senrido.batch.entity.TSurvey;

/**
 * @author takam
 *
 */
@Dao
@ConfigAutowireable
public interface TSurveyDao {

	/**
	 * @return the TSurvey entity List
	 */
	@Select
	TSurvey selectById(Integer id, LocalDateTime visitDate);

	/**
	 * @return the TSurvey entity List
	 */
	@Select
	List<TSurvey> selectAll();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(TSurvey entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(TSurvey entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(TSurvey entity);
}
