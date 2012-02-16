package project.group16.entity;

import java.util.Date;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import project.group16.domain.Employee;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Loan {

    @ManyToOne
    private Employee information;

    @Enumerated
    private EPosition ePosition;

    @Size(max = 500)
    private String address;

    @NotNull
    private String moneyLoan;

    @NotNull
    private String accountNumber;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dateLoan;

    @NotNull
    private String reason;

    private Boolean approvedByFinance_Department;

    private Boolean approvedByHead_Finance_Departm;

    private Boolean approvedByManager;
}
