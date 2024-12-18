package jp.co.senrido.batch.entity;

import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TFullCorrectionListener.class)
@Table(name = "t_full_correction")
@Data
public class TFullCorrection {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** V */
    @Column(name = "v")
    String v;

    /** R-V */
    @Column(name = "r_v")
    String rV;

    /** CV */
    @Column(name = "cv")
    String cv;

    /** R-CV */
    @Column(name = "r_cv")
    String rCv;

    /** R-S */
    @Column(name = "r_s")
    String rS;

    /** R-C */
    @Column(name = "r_c")
    String rC;

    /** R-AX */
    @Column(name = "r_ax")
    String rAx;

    /** R-P/BASE1-�� */
    @Column(name = "r_p_base1_left")
    String rPBase1Left;

    /** R-P/BASE1-�E */
    @Column(name = "r_p_base1_right")
    String rPBase1Right;

    /** R-P/BASE2-�� */
    @Column(name = "r_p_base2_left")
    String rPBase2Left;

    /** R-P/BASE2-�E */
    @Column(name = "r_p_base2_right")
    String rPBase2Right;

    /** ADD */
    @Column(name = "add")
    String add;

    /** L-V */
    @Column(name = "l_v")
    String lV;

    /** L-CV */
    @Column(name = "l_cv")
    String lCv;

    /** L-S */
    @Column(name = "l_s")
    String lS;

    /** L-C */
    @Column(name = "l_c")
    String lC;

    /** L-AX */
    @Column(name = "l_ax")
    String lAx;

    /** L-P/BASE1-�� */
    @Column(name = "l_p_base1_left")
    String lPBase1Left;

    /** L-P/BASE1-�E */
    @Column(name = "l_p_base1_right")
    String lPBase1Right;

    /** L-P/BASE2-�� */
    @Column(name = "l_p_base2_left")
    String lPBase2Left;

    /** L-P/BASE2-�E */
    @Column(name = "l_p_base2_right")
    String lPBase2Right;

    /** R-CL�x�� */
    @Column(name = "r_cl_power")
    String rClPower;

    /** L-CL�x�� */
    @Column(name = "l_cl_power")
    String lClPower;

    /** ���� */
    @Column(name = "memo")
    String memo;

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
