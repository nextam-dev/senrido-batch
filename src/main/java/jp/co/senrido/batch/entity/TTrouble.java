package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TTroubleListener.class)
@Table(name = "t_trouble")
@Data
public class TTrouble {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** ���K�l�g���u�� */
    @Column(name = "glasses_issues")
    String glassesIssues;

    /** ���K�l�g���u������ */
    @Column(name = "glasses_issues_name")
    String glassesIssuesName;

    /** �t���[���g���u�� */
    @Column(name = "frame_issues")
    String frameIssues;

    /** �t���[���g���u������ */
    @Column(name = "frame_issues_name")
    String frameIssuesName;

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
