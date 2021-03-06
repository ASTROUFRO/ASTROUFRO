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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * ReceiverQuality generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`RECEIVERQUALITY`"
)
public class ReceiverQuality extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer receiverQualityId;
     protected Antenna antenna;
     protected Long observationTime;
     protected String execBlockUID;
     protected Integer scanNumber;
     private Set<ReceiverQualityParameters> receiverQualityParameterses = new HashSet<ReceiverQualityParameters>(0);

    public ReceiverQuality() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="ReceivQ_seq")}
	)

    
    @Column(name="`RECEIVERQUALITYID`", unique=true, nullable=false)
    public Integer getReceiverQualityId() {
        return this.receiverQualityId;
    }
    
    public void setReceiverQualityId(Integer receiverQualityId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("receiverQualityId", this.receiverQualityId, this.receiverQualityId = receiverQualityId);
        else
            this.receiverQualityId = receiverQualityId;
    }


@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="`ANTENNAID`", nullable=false)
    public Antenna getAntenna() {
        return this.antenna;
    }
    
    public void setAntenna(Antenna antenna) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("antenna", this.antenna, this.antenna = antenna);
        else
            this.antenna = antenna;
    }


    
    @Column(name="`OBSERVATIONTIME`", nullable=false)
    public Long getObservationTime() {
        return this.observationTime;
    }
    
    public void setObservationTime(Long observationTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("observationTime", this.observationTime, this.observationTime = observationTime);
        else
            this.observationTime = observationTime;
    }


    
    @Column(name="`EXECBLOCKUID`", nullable=false, length=100)
    public String getExecBlockUID() {
        return this.execBlockUID;
    }
    
    public void setExecBlockUID(String execBlockUID) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("execBlockUID", this.execBlockUID, this.execBlockUID = execBlockUID);
        else
            this.execBlockUID = execBlockUID;
    }


    
    @Column(name="`SCANNUMBER`", nullable=false)
    public Integer getScanNumber() {
        return this.scanNumber;
    }
    
    public void setScanNumber(Integer scanNumber) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("scanNumber", this.scanNumber, this.scanNumber = scanNumber);
        else
            this.scanNumber = scanNumber;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="receiverQuality")
    public Set<ReceiverQualityParameters> getReceiverQualityParameterses() {
        return this.receiverQualityParameterses;
    }
    
    public void setReceiverQualityParameterses(Set<ReceiverQualityParameters> receiverQualityParameterses) {    
    	this.receiverQualityParameterses = receiverQualityParameterses;
    }

	public void addReceiverQualityParameterses(Set<ReceiverQualityParameters> elements) {
		if( this.receiverQualityParameterses != null )
			for(Iterator<ReceiverQualityParameters> it = elements.iterator(); it.hasNext(); )
				addReceiverQualityParametersToReceiverQualityParameterses((ReceiverQualityParameters)it.next());
	}

	public void addReceiverQualityParametersToReceiverQualityParameterses(ReceiverQualityParameters element) {
		if( !this.receiverQualityParameterses.contains(element) ) {
			this.receiverQualityParameterses.add(element);
		}
	}





}


