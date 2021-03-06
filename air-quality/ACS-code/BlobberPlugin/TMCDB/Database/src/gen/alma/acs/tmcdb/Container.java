package alma.acs.tmcdb;
// Generated Dec 3, 2018 9:54:59 PM by Hibernate Tools 4.3.1.Final


import alma.hibernate.util.StringEnumUserType;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

/**
 * Container generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name="`CONTAINER`"
    , uniqueConstraints =  @UniqueConstraint(columnNames={"`CONTAINERNAME`", "`PATH`", "`CONFIGURATIONID`"})
)
@TypeDefs({
@TypeDef(name="ContainerRealTimeType", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.ContainerRealTimeType") }),
@TypeDef(name="ImplLangEnum", typeClass=StringEnumUserType.class,
   parameters={ @Parameter(name="enumClassName", value="alma.acs.tmcdb.ImplLangEnum") })
})
public class Container extends alma.acs.tmcdb.translator.TmcdbObject implements java.io.Serializable {


     protected Integer containerId;
     protected Configuration configuration;
     protected Computer computer;
     protected LoggingConfig loggingConfig;
     protected String containerName;
     protected String path;
     protected ImplLangEnum implLang;
     protected Boolean realTime;
     protected ContainerRealTimeType realTimeType;
     protected String kernelModuleLocation;
     protected String kernelModule;
     protected String typeModifiers;
     protected Boolean startOnDemand;
     protected Integer keepAliveTime;
     protected Integer serverThreads;
     protected Integer managerRetry;
     protected Integer callTimeout;
     protected Integer pingInterval;
     protected Boolean recovery;
     protected String autoloadSharedLibs;
     private Set<ContainerStartupOption> containerStartupOptions = new HashSet<ContainerStartupOption>(0);
     private Set<Component> components = new HashSet<Component>(0);

    public Container() {
    }
   
    @Id @GeneratedValue(generator="generator")
    @GenericGenerator(name="generator", strategy="native",
       parameters = {@Parameter(name="sequence", value="Container_seq")}
	)

    
    @Column(name="`CONTAINERID`", unique=true, nullable=false)
    public Integer getContainerId() {
        return this.containerId;
    }
    
    public void setContainerId(Integer containerId) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("containerId", this.containerId, this.containerId = containerId);
        else
            this.containerId = containerId;
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
    @JoinColumn(name="`COMPUTERID`")
    public Computer getComputer() {
        return this.computer;
    }
    
    public void setComputer(Computer computer) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("computer", this.computer, this.computer = computer);
        else
            this.computer = computer;
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


    
    @Column(name="`CONTAINERNAME`", nullable=false, length=256)
    public String getContainerName() {
        return this.containerName;
    }
    
    public void setContainerName(String containerName) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("containerName", this.containerName, this.containerName = containerName);
        else
            this.containerName = containerName;
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


    
    @Column(name="`IMPLLANG`", nullable=false, length=16777216)
	@Type(type="ImplLangEnum")
    public ImplLangEnum getImplLang() {
        return this.implLang;
    }
    
    public void setImplLang(ImplLangEnum implLang) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("implLang", this.implLang, this.implLang = implLang);
        else
            this.implLang = implLang;
    }


    
    @Column(name="`REALTIME`")
    public Boolean getRealTime() {
        return this.realTime;
    }
    
    public void setRealTime(Boolean realTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("realTime", this.realTime, this.realTime = realTime);
        else
            this.realTime = realTime;
    }


    
    @Column(name="`REALTIMETYPE`", length=16777216)
	@Type(type="ContainerRealTimeType")
    public ContainerRealTimeType getRealTimeType() {
        return this.realTimeType;
    }
    
    public void setRealTimeType(ContainerRealTimeType realTimeType) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("realTimeType", this.realTimeType, this.realTimeType = realTimeType);
        else
            this.realTimeType = realTimeType;
    }


    
    @Column(name="`KERNELMODULELOCATION`", length=16777216)
    public String getKernelModuleLocation() {
        return this.kernelModuleLocation;
    }
    
    public void setKernelModuleLocation(String kernelModuleLocation) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("kernelModuleLocation", this.kernelModuleLocation, this.kernelModuleLocation = kernelModuleLocation);
        else
            this.kernelModuleLocation = kernelModuleLocation;
    }


    
    @Column(name="`KERNELMODULE`", length=16777216)
    public String getKernelModule() {
        return this.kernelModule;
    }
    
    public void setKernelModule(String kernelModule) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("kernelModule", this.kernelModule, this.kernelModule = kernelModule);
        else
            this.kernelModule = kernelModule;
    }


    
    @Column(name="`TYPEMODIFIERS`", length=16777216)
    public String getTypeModifiers() {
        return this.typeModifiers;
    }
    
    public void setTypeModifiers(String typeModifiers) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("typeModifiers", this.typeModifiers, this.typeModifiers = typeModifiers);
        else
            this.typeModifiers = typeModifiers;
    }


    
    @Column(name="`STARTONDEMAND`")
    public Boolean getStartOnDemand() {
        return this.startOnDemand;
    }
    
    public void setStartOnDemand(Boolean startOnDemand) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("startOnDemand", this.startOnDemand, this.startOnDemand = startOnDemand);
        else
            this.startOnDemand = startOnDemand;
    }


    
    @Column(name="`KEEPALIVETIME`")
    public Integer getKeepAliveTime() {
        return this.keepAliveTime;
    }
    
    public void setKeepAliveTime(Integer keepAliveTime) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("keepAliveTime", this.keepAliveTime, this.keepAliveTime = keepAliveTime);
        else
            this.keepAliveTime = keepAliveTime;
    }


    
    @Column(name="`SERVERTHREADS`")
    public Integer getServerThreads() {
        return this.serverThreads;
    }
    
    public void setServerThreads(Integer serverThreads) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("serverThreads", this.serverThreads, this.serverThreads = serverThreads);
        else
            this.serverThreads = serverThreads;
    }


    
    @Column(name="`MANAGERRETRY`")
    public Integer getManagerRetry() {
        return this.managerRetry;
    }
    
    public void setManagerRetry(Integer managerRetry) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("managerRetry", this.managerRetry, this.managerRetry = managerRetry);
        else
            this.managerRetry = managerRetry;
    }


    
    @Column(name="`CALLTIMEOUT`")
    public Integer getCallTimeout() {
        return this.callTimeout;
    }
    
    public void setCallTimeout(Integer callTimeout) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("callTimeout", this.callTimeout, this.callTimeout = callTimeout);
        else
            this.callTimeout = callTimeout;
    }


    
    @Column(name="`PINGINTERVAL`")
    public Integer getPingInterval() {
        return this.pingInterval;
    }
    
    public void setPingInterval(Integer pingInterval) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("pingInterval", this.pingInterval, this.pingInterval = pingInterval);
        else
            this.pingInterval = pingInterval;
    }


    
    @Column(name="`RECOVERY`")
    public Boolean getRecovery() {
        return this.recovery;
    }
    
    public void setRecovery(Boolean recovery) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("recovery", this.recovery, this.recovery = recovery);
        else
            this.recovery = recovery;
    }


    
    @Column(name="`AUTOLOADSHAREDLIBS`", length=16777216)
    public String getAutoloadSharedLibs() {
        return this.autoloadSharedLibs;
    }
    
    public void setAutoloadSharedLibs(String autoloadSharedLibs) {    
        if( propertyChangeSupport != null )
            propertyChangeSupport.firePropertyChange("autoloadSharedLibs", this.autoloadSharedLibs, this.autoloadSharedLibs = autoloadSharedLibs);
        else
            this.autoloadSharedLibs = autoloadSharedLibs;
    }


@OneToMany(fetch=FetchType.LAZY, mappedBy="container")
    @Cascade( {org.hibernate.annotations.CascadeType.ALL, org.hibernate.annotations.CascadeType.DELETE_ORPHAN} )
    public Set<ContainerStartupOption> getContainerStartupOptions() {
        return this.containerStartupOptions;
    }
    
    public void setContainerStartupOptions(Set<ContainerStartupOption> containerStartupOptions) {    
    	this.containerStartupOptions = containerStartupOptions;
    }

	public void addContainerStartupOptions(Set<ContainerStartupOption> elements) {
		if( this.containerStartupOptions != null )
			for(Iterator<ContainerStartupOption> it = elements.iterator(); it.hasNext(); )
				addContainerStartupOptionToContainerStartupOptions((ContainerStartupOption)it.next());
	}

	public void addContainerStartupOptionToContainerStartupOptions(ContainerStartupOption element) {
		if( !this.containerStartupOptions.contains(element) ) {
			this.containerStartupOptions.add(element);
		}
	}


@OneToMany(fetch=FetchType.LAZY, mappedBy="container")
    public Set<Component> getComponents() {
        return this.components;
    }
    
    public void setComponents(Set<Component> components) {    
    	this.components = components;
    }

	public void addComponents(Set<Component> elements) {
		if( this.components != null )
			for(Iterator<Component> it = elements.iterator(); it.hasNext(); )
				addComponentToComponents((Component)it.next());
	}

	public void addComponentToComponents(Component element) {
		if( !this.components.contains(element) ) {
			this.components.add(element);
		}
	}



   public boolean equalsContent(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof Container) ) return false;
		 Container castOther = ( Container ) other;

		 return ( (this.getConfiguration()==castOther.getConfiguration()) || ( this.getConfiguration()!=null && castOther.getConfiguration()!=null && this.getConfiguration().equals(castOther.getConfiguration()) ) )
 && ( (this.getContainerName()==castOther.getContainerName()) || ( this.getContainerName()!=null && castOther.getContainerName()!=null && this.getContainerName().equals(castOther.getContainerName()) ) )
 && ( (this.getPath()==castOther.getPath()) || ( this.getPath()!=null && castOther.getPath()!=null && this.getPath().equals(castOther.getPath()) ) );
   }

   public int hashCodeContent() {
         int result = 17;

         
         result = 37 * result + ( getConfiguration() == null ? 0 : this.getConfiguration().hashCode() );
         
         
         result = 37 * result + ( getContainerName() == null ? 0 : this.getContainerName().hashCode() );
         result = 37 * result + ( getPath() == null ? 0 : this.getPath().hashCode() );
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         return result;
   }


}


