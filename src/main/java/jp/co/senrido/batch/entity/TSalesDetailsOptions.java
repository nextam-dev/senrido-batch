package jp.co.senrido.batch.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Entity(listener = TSalesDetailsOptionsListener.class)
@Table(name = "t_sales_details_options")
@Data
public class TSalesDetailsOptions {

    /** ���q�lID */
    @Id
    @Column(name = "id")
    Integer id;

    /** ���X�� */
    @Column(name = "visit_date")
    LocalDateTime visitDate;

    /** �A�� */
    @Column(name = "seq")
    Integer seq;

    /** �I�v�V�����A�� */
    @Column(name = "option_seq")
    Integer optionSeq;

    /** �I�v�V����1 */
    @Column(name = "option1")
    String option1;

    /** �I�v�V��������1 */
    @Column(name = "option_name1")
    String optionName1;

    /** �I�v�V�������z1 */
    @Column(name = "option_price1")
    BigDecimal optionPrice1;

    /** �I�v�V����2 */
    @Column(name = "option2")
    String option2;

    /** �I�v�V��������2 */
    @Column(name = "option_name2")
    String optionName2;

    /** �I�v�V�������z2 */
    @Column(name = "option_price2")
    BigDecimal optionPrice2;

    /** �I�v�V����3 */
    @Column(name = "option3")
    String option3;

    /** �I�v�V��������3 */
    @Column(name = "option_name3")
    String optionName3;

    /** �I�v�V�������z3 */
    @Column(name = "option_price3")
    BigDecimal optionPrice3;

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
