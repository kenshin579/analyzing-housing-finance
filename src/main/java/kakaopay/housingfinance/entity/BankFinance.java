package kakaopay.housingfinance.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Builder
@AllArgsConstructor()
@Table(name = "bank_finance")
@ToString
public class BankFinance {
    protected BankFinance(){}

    @Id
    @GeneratedValue
    @Column(name = "bank_finance_id")
    private Long id;

    @Column(name = "bank_id")
    private Long bankId;

    @Column
    private Integer year;

    @Column
    private Integer month;

    @Column
    private Integer amount;
}
