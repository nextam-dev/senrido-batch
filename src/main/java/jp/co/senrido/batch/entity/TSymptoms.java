package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TSymptomsListener.class)
@Table(name = "t_symptoms")
@Data
public class TSymptoms {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** ��̏Ǐ� */
    @Column(name = "eye_symptoms")
    String eyeSymptoms;

    /** ��̏Ǐ󂻂̑� */
    @Column(name = "eye_symptoms_other")
    String eyeSymptomsOther;

    /** ��̏Ǐ󖼏� */
    @Column(name = "eye_symptoms_name")
    String eyeSymptomsName;

    /** �g�̂̏Ǐ� */
    @Column(name = "body_symptoms")
    String bodySymptoms;

    /** �g�̂̏Ǐ󂻂̑� */
    @Column(name = "body_symptoms_other")
    String bodySymptomsOther;

    /** �g�̂̏Ǐ󖼏� */
    @Column(name = "body_symptoms_name")
    String bodySymptomsName;

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
