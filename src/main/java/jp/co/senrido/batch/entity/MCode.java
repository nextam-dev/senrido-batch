package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 *
 */
@Entity(listener = MCodeListener.class)
@Table(name = "m_code")
public class MCode {

    /**  */
    @Id
    @Column(name = "div_code")
    String divCode;

    /**  */
    @Column(name = "glasses_flame")
    String glassesFlame;

    /**  */
    @Id
    @Column(name = "code")
    String code;

    /**  */
    @Column(name = "name")
    String name;

    /**  */
    @Column(name = "disp_order")
    Integer dispOrder;

    /**  */
    @Column(name = "create_id")
    String createId;

    /**  */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /**  */
    @Column(name = "update_id")
    String updateId;

    /**  */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /**  */
    @Column(name = "del_flg")
    Boolean delFlg;

    /**
     * Returns the divCode.
     *
     * @return the divCode
     */
    public String getDivCode() {
        return divCode;
    }

    /**
     * Sets the divCode.
     *
     * @param divCode the divCode
     */
    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    /**
     * Returns the divName.
     *
     * @return the divName
     */
    public String getGlassesFlame() {
        return glassesFlame;
    }

    /**
     * Sets the divName.
     *
     * @param divName the divName
     */
    public void setGlassesFlame(String glassesFlame) {
        this.glassesFlame = glassesFlame;
    }

    /**
     * Returns the code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Returns the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the dispOrder.
     *
     * @return the dispOrder
     */
    public Integer getDispOrder() {
        return dispOrder;
    }

    /**
     * Sets the dispOrder.
     *
     * @param name the dispOrder
     */
    public void setDispOrder(Integer dispOrder) {
        this.dispOrder = dispOrder;
    }

    /**
     * Returns the createName.
     *
     * @return the createName
     */
    public String getCreateId() {
        return createId;
    }

    /**
     * Sets the createName.
     *
     * @param createName the createName
     */
    public void setCreateId(String createId) {
        this.createId = createId;
    }

    /**
     * Returns the createDate.
     *
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /**
     * Sets the createDate.
     *
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /**
     * Returns the updateName.
     *
     * @return the updateName
     */
    public String getUpdateId() {
        return updateId;
    }

    /**
     * Sets the updateName.
     *
     * @param updateName the updateName
     */
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    /**
     * Returns the updateDate.
     *
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the updateDate.
     *
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Returns the delFlg.
     *
     * @return the delFlg
     */
    public Boolean getDelFlg() {
        return delFlg;
    }

    /**
     * Sets the delFlg.
     *
     * @param delFlg the delFlg
     */
    public void setDelFlg(Boolean delFlg) {
        this.delFlg = delFlg;
    }
}