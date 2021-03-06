package project.group16.entity;

import java.util.Date;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import project.group16.domain.Employee;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class FinanceDepertment {

    @ManyToOne
    private Employee Information;

    @Enumerated
    private EPosition ePosition;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date startJob;

    @Enumerated
    private TimeForJob timeForJob;

    private Float Bonuses;

    @NotNull
    private String accountNumber;

    private Boolean approvedByManager;
}
