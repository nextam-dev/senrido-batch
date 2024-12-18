/**
 * 
 */
package jp.co.senrido.batch.service;

import org.seasar.doma.jdbc.SelectOptions;
import org.springframework.beans.factory.annotation.Autowired;

import jp.co.senrido.batch.dto.PageFactory;
import jp.co.senrido.batch.dto.Pageable;

/**
 * @author t_hirose
 *
 */
public abstract class BaseTransactionalService extends BaseService {

    @Autowired
    protected PageFactory pageFactory;
    
    /**
     * SearchOptionsを作成して返します。
     *
     * @param pageable
     * @return
     */
    protected SelectOptions createSearchOptions(Pageable pageable) {
        int page = pageable.getPage();
        int perpage = pageable.getPerpage();
        return createSearchOptions(page, perpage);
    }

    /**
     * SearchOptionsを作成して返します。
     *
     * @param page
     * @param perpage
     * @return
     */
    protected SelectOptions createSearchOptions(int page, int perpage) {
        int offset = (page - 1) * perpage;
        return SelectOptions.get().offset(offset).limit(perpage);
    }
}
