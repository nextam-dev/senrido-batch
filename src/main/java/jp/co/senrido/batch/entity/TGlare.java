package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TGlareListener.class)
@Table(name = "t_glare")
@Data
public class TGlare {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** ῂ����������镨�� */
    @Column(name = "glare_sources")
    String glareSources;

    /** ῂ����������镨�����̑� */
    @Column(name = "glare_sources_other")
    String glareSourcesOther;

    /** ῂ����������镨������ */
    @Column(name = "glare_sources_name")
    String glareSourcesName;

    /** ���������������Ƃ��ڂɒɂ� */
    @Column(name = "eye_pain_strong_light")
    Boolean eyePainStrongLight;

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
