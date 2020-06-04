package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * AlarmCategory generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`ALARMCATEGORY`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`ALARMCATEGORYNAME`", "`CONFIGURATIONID`"})
)
public class AlarmCategory extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer alarmCategoryId;
     protected Configuration configuration;
     protected String alarmCategoryName;
     protected String description;
     protected String path;
     protected Boolean isDefault;
     private Set<FaultFamily> faultFamilies = new HashSet<FaultFamily>(0);

    public AlarmCategory() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="AlarmC_seq")}
	)

    
    @Column(name="`ALARMCATEGORYID`", unique=true, nullable=false)
    public Integer getAlarmCategoryId() {
        return this.alarmCategoryId;
    }
    
    public void setAlarmCategoryId(Integer alarmCategoryId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarmCategoryId", this.alarmCategoryId, this.alarmCategoryId = alarmCategoryId);
        else
            this.alarmCategoryId = alarmCategoryId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`CONFIGURATIONID`", nullable=false)
    public Configuration getConfiguration() {
        return this.configuration;
    }
    
    public void setConfiguration(Configuration configuration) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("configuration", this.configuration, this.configuration = configuration);
        else
            this.configuration = configuration;
    }


    
    @Column(name="`ALARMCATEGORYNAME`", nullable=false, length=128)
    public String getAlarmCategoryName() {
        return this.alarmCategoryName;
    }
    
    public void setAlarmCategoryName(String alarmCategoryName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("alarmCategoryName", this.alarmCategoryName, this.alarmCategoryName = alarmCategoryName);
        else
            this.alarmCategoryName = alarmCategoryName;
    }


    
    @Column(name="`DESCRIPTION`", nullable=false, length=16777216)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("description", this.description, this.description = description);
        else
            this.description = description;
    }


    
    @Column(name="`PATH`", nullable=false, length=256)
    public String getPath() {
        return this.path;
    }
    
    public void setPath(String path) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("path", this.path, this.path = path);
        else
            this.path = path;
    }


    
    @Column(name="`ISDEFAULT`", nullable=false)
    public Boolean getIsDefault() {
        return this.isDefault;
    }
    
    public void setIsDefault(Boolean isDefault) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("isDefault", this.isDefault, this.isDefault = isDefault);
        else
            this.isDefault = isDefault;
    }


@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="ALARMCATEGORYFAMILY", catalog="PUBLIC", joinColumns = { 
        @JoinColumn(name="ALARMCATEGORYID", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="FAULTFAMILYID", nullable=false, updatable=false) })
    public Set<FaultFamily> getFaultFamilies() {
        return this.faultFamilies;
    }
    
    public void setFaultFamilies(Set<FaultFamily> faultFamilies) {    
    	this.faultFamilies = faultFamilies;
    }

	public void addFaultFamilies(Set<FaultFamily> elements) {
		if( this.faultFamilies != null )
			for(Iterator<FaultFamily> it = elements.iterator(); it.hasNext(); )
				addFaultFamilyToFaultFamilies((FaultFamily)it.next());
	}

	public void addFaultFamilyToFaultFamilies(FaultFamily element) {
		if( !this.faultFamilies.contains(element) ) {
			this.faultFamilies.add(element);
		}
	}



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AlarmCategory) ) return false;
		 AlarmCategory castOther = ( AlarmCategory ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getAlarmCategoryName()==castOther.getAlarmCategoryName()) || ( this.getAlarmCategoryName()!=null && castOther.getAlarmCategoryName()!=null && this.getAlarmCategoryName().equals(castOther.getAlarmCategoryName()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         result = 37 * result + ( getAlarmCategoryName() == null ? 0 : this.getAlarmCategoryName().hashCode() );
         
         
         
         
         return result;
   }


}

