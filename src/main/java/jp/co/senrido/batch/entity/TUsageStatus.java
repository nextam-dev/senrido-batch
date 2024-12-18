package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TUsageStatusListener.class)
@Table(name = "t_usage_status")
@Data
public class TUsageStatus {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** ���K�l�ECL �̑��p��-���� */
    @Column(name = "current_status_cd")
    String currentStatusCd;

    /** ���K�l�ECL �̑��p��-���󖼏� */
    @Column(name = "glasses_cl_usage_current_name")
    String glassesClUsageCurrentName;

    /** ���K�l�ECL �̑��p��-CL���p */
    @Column(name = "combined_use_cl_cd")
    String combinedUseClCd;

    /** ���K�l�ECL �̑��p��-CL���p���� */
    @Column(name = "glasses_cl_usage_combined_name")
    String glassesClUsageCombinedName;

    /** ���K�l�p�r */
    @Column(name = "glasses_purpose")
    String glassesPurpose;

    /** ���K�l�p�r���� */
    @Column(name = "glasses_purpose_name")
    String glassesPurposeName;

    /** �폜�t���O */
    @Column(name = "del_flg")
    Boolean delFlg;

    /** �o�^���� */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** �o�^�҃R�[�h */
    @Column(name = "create_id")
    String createId;

    /** �X�V���� */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** �X�V�҃R�[�h */
    @Column(name = "update_id")
    String updateId;
}
