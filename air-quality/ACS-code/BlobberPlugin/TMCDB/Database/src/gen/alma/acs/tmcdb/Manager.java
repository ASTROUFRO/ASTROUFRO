package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Manager generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`MANAGER`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`CONFIGURATIONID`", "`LOGGINGCONFIGID`", "`STARTUP`", "`SERVICECOMPONENTS`", "`TIMEOUT`", "`CLIENTPINGINTERVAL`", "`ADMINISTRATORPINGINTERVAL`", "`CONTAINERPINGINTERVAL`", "`SERVERTHREADS`"})
)
public class Manager extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer managerId;
     protected Configuration configuration;
     protected LoggingConfig loggingConfig;
     protected String startup;
     protected String serviceComponents;
     protected String serviceDaemons;
     protected Integer timeout;
     protected Integer clientPingInterval;
     protected Integer administratorPingInterval;
     protected Integer containerPingInterval;
     protected Byte serverThreads;

    public Manager() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="Manager_seq")}
	)

    
    @Column(name="`MANAGERID`", unique=true, nullable=false)
    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("managerId", this.managerId, this.managerId = managerId);
        else
            this.managerId = managerId;
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


@ManyToOne(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)@Cascade( {org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK} )
    @JoinColumn(name="`LOGGINGCONFIGID`", nullable=false)
    public LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }
    
    public void setLoggingConfig(LoggingConfig loggingConfig) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("loggingConfig", this.loggingConfig, this.loggingConfig = loggingConfig);
        else
            this.loggingConfig = loggingConfig;
    }


    
    @Column(name="`STARTUP`", length=16777216)
    public String getStartup() {
        return this.startup;
    }
    
    public void setStartup(String startup) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("startup", this.startup, this.startup = startup);
        else
            this.startup = startup;
    }


    
    @Column(name="`SERVICECOMPONENTS`", length=16777216)
    public String getServiceComponents() {
        return this.serviceComponents;
    }
    
    public void setServiceComponents(String serviceComponents) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("serviceComponents", this.serviceComponents, this.serviceComponents = serviceComponents);
        else
            this.serviceComponents = serviceComponents;
    }


    
    @Column(name="`SERVICEDAEMONS`", length=16777216)
    public String getServiceDaemons() {
        return this.serviceDaemons;
    }
    
    public void setServiceDaemons(String serviceDaemons) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("serviceDaemons", this.serviceDaemons, this.serviceDaemons = serviceDaemons);
        else
            this.serviceDaemons = serviceDaemons;
    }


    
    @Column(name="`TIMEOUT`")
    public Integer getTimeout() {
        return this.timeout;
    }
    
    public void setTimeout(Integer timeout) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("timeout", this.timeout, this.timeout = timeout);
        else
            this.timeout = timeout;
    }


    
    @Column(name="`CLIENTPINGINTERVAL`")
    public Integer getClientPingInterval() {
        return this.clientPingInterval;
    }
    
    public void setClientPingInterval(Integer clientPingInterval) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("clientPingInterval", this.clientPingInterval, this.clientPingInterval = clientPingInterval);
        else
            this.clientPingInterval = clientPingInterval;
    }


    
    @Column(name="`ADMINISTRATORPINGINTERVAL`")
    public Integer getAdministratorPingInterval() {
        return this.administratorPingInterval;
    }
    
    public void setAdministratorPingInterval(Integer administratorPingInterval) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("administratorPingInterval", this.administratorPingInterval, this.administratorPingInterval = administratorPingInterval);
        else
            this.administratorPingInterval = administratorPingInterval;
    }


    
    @Column(name="`CONTAINERPINGINTERVAL`")
    public Integer getContainerPingInterval() {
        return this.containerPingInterval;
    }
    
    public void setContainerPingInterval(Integer containerPingInterval) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("containerPingInterval", this.containerPingInterval, this.containerPingInterval = containerPingInterval);
        else
            this.containerPingInterval = containerPingInterval;
    }


    
    @Column(name="`SERVERTHREADS`")
    public Byte getServerThreads() {
        return this.serverThreads;
    }
    
    public void setServerThreads(Byte serverThreads) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("serverThreads", this.serverThreads, this.serverThreads = serverThreads);
        else
            this.serverThreads = serverThreads;
    }



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Manager) ) return false;
		 Manager castOther = ( Manager ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getLoggingConfig()==castOther.getLoggingConfig()) || ( this.getLoggingConfig()!=null && castOther.getLoggingConfig()!=null && this.getLoggingConfig().equals(castOther.getLoggingConfig()) ) )
 && ( (this.getStartup()==castOther.getStartup()) || ( this.getStartup()!=null && castOther.getStartup()!=null && this.getStartup().equals(castOther.getStartup()) ) )
 && ( (this.getServiceComponents()==castOther.getServiceComponents()) || ( this.getServiceComponents()!=null && castOther.getServiceComponents()!=null && this.getServiceComponents().equals(castOther.getServiceComponents()) ) )
 && ( (this.getTimeout()==castOther.getTimeout()) || ( this.getTimeout()!=null && castOther.getTimeout()!=null && this.getTimeout().equals(castOther.getTimeout()) ) )
 && ( (this.getClientPingInterval()==castOther.getClientPingInterval()) || ( this.getClientPingInterval()!=null && castOther.getClientPingInterval()!=null && this.getClientPingInterval().equals(castOther.getClientPingInterval()) ) )
 && ( (this.getAdministratorPingInterval()==castOther.getAdministratorPingInterval()) || ( this.getAdministratorPingInterval()!=null && castOther.getAdministratorPingInterval()!=null && this.getAdministratorPingInterval().equals(castOther.getAdministratorPingInterval()) ) )
 && ( (this.getContainerPingInterval()==castOther.getContainerPingInterval()) || ( this.getContainerPingInterval()!=null && castOther.getContainerPingInterval()!=null && this.getContainerPingInterval().equals(castOther.getContainerPingInterval()) ) )
 && ( (this.getServerThreads()==castOther.getServerThreads()) || ( this.getServerThreads()!=null && castOther.getServerThreads()!=null && this.getServerThreads().equals(castOther.getServerThreads()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         result = 37 * result + ( getLoggingConfig() == null ? 0 : this.getLoggingConfig().hashCode() );
         result = 37 * result + ( getStartup() == null ? 0 : this.getStartup().hashCode() );
         result = 37 * result + ( getServiceComponents() == null ? 0 : this.getServiceComponents().hashCode() );
         
         result = 37 * result + ( getTimeout() == null ? 0 : this.getTimeout().hashCode() );
         result = 37 * result + ( getClientPingInterval() == null ? 0 : this.getClientPingInterval().hashCode() );
         result = 37 * result + ( getAdministratorPingInterval() == null ? 0 : this.getAdministratorPingInterval().hashCode() );
         result = 37 * result + ( getContainerPingInterval() == null ? 0 : this.getContainerPingInterval().hashCode() );
         result = 37 * result + ( getServerThreads() == null ? 0 : this.getServerThreads().hashCode() );
         return result;
   }


}


