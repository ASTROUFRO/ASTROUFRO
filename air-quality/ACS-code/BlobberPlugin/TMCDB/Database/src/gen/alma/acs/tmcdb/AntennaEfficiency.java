package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


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

/**
 * AntennaEfficiency generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`ANTENNAEFFICIENCY`"
)
public class AntennaEfficiency extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer antennaEfficiencyId;
     protected Antenna antenna;
     protected Long observationTime;
     protected String execBlockUID;
     protected Integer scanNumber;
     protected Double thetaMinorPolX;
     protected Double thetaMinorPolY;
     protected Double thetaMajorPolX;
     protected Double thetaMajorPolY;
     protected Double positionAngleBeamPolX;
     protected Double positionAngleBeamPolY;
     protected String sourceName;
     protected Double sourceSize;
     protected Double frequency;
     protected Double apertureEff;
     protected Double apertureEffError;
     protected Double forwardEff;
     protected Double forwardEffError;

    public AntennaEfficiency() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="AntennE_seq")}
	)

    
    @Column(name="`ANTENNAEFFICIENCYID`", unique=true, nullable=false)
    public Integer getAntennaEfficiencyId() {
        return this.antennaEfficiencyId;
    }
    
    public void setAntennaEfficiencyId(Integer antennaEfficiencyId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("antennaEfficiencyId", this.antennaEfficiencyId, this.antennaEfficiencyId = antennaEfficiencyId);
        else
            this.antennaEfficiencyId = antennaEfficiencyId;
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


    
    @Column(name="`THETAMINORPOLX`", nullable=false, precision=64, scale=0)
    public Double getThetaMinorPolX() {
        return this.thetaMinorPolX;
    }
    
    public void setThetaMinorPolX(Double thetaMinorPolX) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("thetaMinorPolX", this.thetaMinorPolX, this.thetaMinorPolX = thetaMinorPolX);
        else
            this.thetaMinorPolX = thetaMinorPolX;
    }


    
    @Column(name="`THETAMINORPOLY`", nullable=false, precision=64, scale=0)
    public Double getThetaMinorPolY() {
        return this.thetaMinorPolY;
    }
    
    public void setThetaMinorPolY(Double thetaMinorPolY) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("thetaMinorPolY", this.thetaMinorPolY, this.thetaMinorPolY = thetaMinorPolY);
        else
            this.thetaMinorPolY = thetaMinorPolY;
    }


    
    @Column(name="`THETAMAJORPOLX`", nullable=false, precision=64, scale=0)
    public Double getThetaMajorPolX() {
        return this.thetaMajorPolX;
    }
    
    public void setThetaMajorPolX(Double thetaMajorPolX) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("thetaMajorPolX", this.thetaMajorPolX, this.thetaMajorPolX = thetaMajorPolX);
        else
            this.thetaMajorPolX = thetaMajorPolX;
    }


    
    @Column(name="`THETAMAJORPOLY`", nullable=false, precision=64, scale=0)
    public Double getThetaMajorPolY() {
        return this.thetaMajorPolY;
    }
    
    public void setThetaMajorPolY(Double thetaMajorPolY) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("thetaMajorPolY", this.thetaMajorPolY, this.thetaMajorPolY = thetaMajorPolY);
        else
            this.thetaMajorPolY = thetaMajorPolY;
    }


    
    @Column(name="`POSITIONANGLEBEAMPOLX`", nullable=false, precision=64, scale=0)
    public Double getPositionAngleBeamPolX() {
        return this.positionAngleBeamPolX;
    }
    
    public void setPositionAngleBeamPolX(Double positionAngleBeamPolX) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("positionAngleBeamPolX", this.positionAngleBeamPolX, this.positionAngleBeamPolX = positionAngleBeamPolX);
        else
            this.positionAngleBeamPolX = positionAngleBeamPolX;
    }


    
    @Column(name="`POSITIONANGLEBEAMPOLY`", nullable=false, precision=64, scale=0)
    public Double getPositionAngleBeamPolY() {
        return this.positionAngleBeamPolY;
    }
    
    public void setPositionAngleBeamPolY(Double positionAngleBeamPolY) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("positionAngleBeamPolY", this.positionAngleBeamPolY, this.positionAngleBeamPolY = positionAngleBeamPolY);
        else
            this.positionAngleBeamPolY = positionAngleBeamPolY;
    }


    
    @Column(name="`SOURCENAME`", nullable=false, length=100)
    public String getSourceName() {
        return this.sourceName;
    }
    
    public void setSourceName(String sourceName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("sourceName", this.sourceName, this.sourceName = sourceName);
        else
            this.sourceName = sourceName;
    }


    
    @Column(name="`SOURCESIZE`", nullable=false, precision=64, scale=0)
    public Double getSourceSize() {
        return this.sourceSize;
    }
    
    public void setSourceSize(Double sourceSize) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("sourceSize", this.sourceSize, this.sourceSize = sourceSize);
        else
            this.sourceSize = sourceSize;
    }


    
    @Column(name="`FREQUENCY`", nullable=false, precision=64, scale=0)
    public Double getFrequency() {
        return this.frequency;
    }
    
    public void setFrequency(Double frequency) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("frequency", this.frequency, this.frequency = frequency);
        else
            this.frequency = frequency;
    }


    
    @Column(name="`APERTUREEFF`", nullable=false, precision=64, scale=0)
    public Double getApertureEff() {
        return this.apertureEff;
    }
    
    public void setApertureEff(Double apertureEff) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("apertureEff", this.apertureEff, this.apertureEff = apertureEff);
        else
            this.apertureEff = apertureEff;
    }


    
    @Column(name="`APERTUREEFFERROR`", nullable=false, precision=64, scale=0)
    public Double getApertureEffError() {
        return this.apertureEffError;
    }
    
    public void setApertureEffError(Double apertureEffError) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("apertureEffError", this.apertureEffError, this.apertureEffError = apertureEffError);
        else
            this.apertureEffError = apertureEffError;
    }


    
    @Column(name="`FORWARDEFF`", nullable=false, precision=64, scale=0)
    public Double getForwardEff() {
        return this.forwardEff;
    }
    
    public void setForwardEff(Double forwardEff) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("forwardEff", this.forwardEff, this.forwardEff = forwardEff);
        else
            this.forwardEff = forwardEff;
    }


    
    @Column(name="`FORWARDEFFERROR`", nullable=false, precision=64, scale=0)
    public Double getForwardEffError() {
        return this.forwardEffError;
    }
    
    public void setForwardEffError(Double forwardEffError) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("forwardEffError", this.forwardEffError, this.forwardEffError = forwardEffError);
        else
            this.forwardEffError = forwardEffError;
    }





}

