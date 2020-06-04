package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import alma.hibernate.util.StringEnumUserType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

/**
 * ContainerStartupOption generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`CONTAINERSTARTUPOPTION`"
)
@TypeDef(name="ContStartOptType", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.ContStartOptType") })
public class ContainerStartupOption extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer contStartOptId;
     protected Container container;
     protected ContStartOptType optionType;
     protected String optionName;
     protected String optionValue;

    public ContainerStartupOption() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="ContaiSO_seq")}
	)

    
    @Column(name="`CONTSTARTOPTID`", unique=true, nullable=false)
    public Integer getContStartOptId() {
        return this.contStartOptId;
    }
    
    public void setContStartOptId(Integer contStartOptId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("contStartOptId", this.contStartOptId, this.contStartOptId = contStartOptId);
        else
            this.contStartOptId = contStartOptId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`CONTAINERID`", nullable=false)
    public Container getContainer() {
        return this.container;
    }
    
    public void setContainer(Container container) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("container", this.container, this.container = container);
        else
            this.container = container;
    }


    
    @Column(name="`OPTIONTYPE`", nullable=false, length=16777216)
	@Type(type="ContStartOptType")
    public ContStartOptType getOptionType() {
        return this.optionType;
    }
    
    public void setOptionType(ContStartOptType optionType) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("optionType", this.optionType, this.optionType = optionType);
        else
            this.optionType = optionType;
    }


    
    @Column(name="`OPTIONNAME`", nullable=false, length=256)
    public String getOptionName() {
        return this.optionName;
    }
    
    public void setOptionName(String optionName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("optionName", this.optionName, this.optionName = optionName);
        else
            this.optionName = optionName;
    }


    
    @Column(name="`OPTIONVALUE`", nullable=false, length=256)
    public String getOptionValue() {
        return this.optionValue;
    }
    
    public void setOptionValue(String optionValue) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("optionValue", this.optionValue, this.optionValue = optionValue);
        else
            this.optionValue = optionValue;
    }





}

