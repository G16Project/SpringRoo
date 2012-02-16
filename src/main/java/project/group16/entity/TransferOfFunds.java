package project.group16.entity;

import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import project.group16.domain.Employee;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class TransferOfFunds {

    @ManyToOne
    private Employee idNameSender;

    @Enumerated
    private EPosition PositionSender;

    @ManyToOne
    private Employee IdNameReceiver;

    @Enumerated
    private EPosition PositionReceiver;

    @Enumerated
    private Welfare welfare;

    private Float money;

    @NotNull
    private String AccountId;

    private Boolean Approve;
}
