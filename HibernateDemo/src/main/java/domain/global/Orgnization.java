package domain.global;

import domain.BaseDomain;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Cache(usage=CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name="TORGNIZATION")
public class Orgnization
  extends BaseDomain
{
  private static final long serialVersionUID = -7584040271760492649L;
  @Id
  @GeneratedValue(strategy=GenerationType.TABLE, generator="ID_GENERATOR")
  @TableGenerator(name="ID_GENERATOR", table="TSEQUENCE", pkColumnName="NAME", pkColumnValue="TORGNIZATION", valueColumnName="ID", allocationSize=1)
  @Column(name="ID")
  private Integer id;
  
  @Column(name="ORGCODE")
  private String orgCode;
  
  @Column(name="ORGNAME")
  private String orgName;
  
  @ManyToOne(fetch=FetchType.EAGER,optional=true)
  @JoinColumn(name="PARENTID")
  private Orgnization parentID;
  
  @Column(name="STATUS")
  private Integer status;
  
  @Column(name="CREATEDATE")
  private Date createDate;
  
  @Column(name="RANK")
  private BigDecimal rank;
  
  @Column(name="ORGCODE_XB")
  private String orgCodeXb;
  
  @OneToMany(fetch=FetchType.EAGER, mappedBy="parentID")
  @OrderBy("id")
  private List<Orgnization> Orgnizatios = new ArrayList();
  
  @Column(name="ORGTYPE")
  private String orgType;
  
  @Column(name="EX01")
  private String ex01;
  
  @Column(name="EX02")
  private String ex02;
  
  @Column(name="IX01")
  private String ix01;
  
  @Column(name="IX02")
  private String ix02;
  
  @JsonIgnore
  public List<Orgnization> getOrgnizatios()
  {
    return this.Orgnizatios;
  }
  
  public void setOrgnizatios(List<Orgnization> orgnizatios)
  {
    this.Orgnizatios = orgnizatios;
  }
  
  public BigDecimal getRank()
  {
    return this.rank;
  }
  
  public void setRank(BigDecimal rank)
  {
    this.rank = rank;
  }
  
  public Date getCreateDate()
  {
    return this.createDate;
  }
  
  public void setCreateDate(Date createDate)
  {
    this.createDate = createDate;
  }
  
  public Integer getId()
  {
    return this.id;
  }
  
  public void setId(Integer id)
  {
    this.id = id;
  }
  
  public String getOrgCode()
  {
    return this.orgCode;
  }
  
  public void setOrgCode(String orgCode)
  {
    this.orgCode = orgCode;
  }
  
  public String getOrgName()
  {
    return this.orgName;
  }
  
  public void setOrgName(String orgName)
  {
    this.orgName = orgName;
  }
  
  public Integer getStatus()
  {
    return this.status;
  }
  
  public void setStatus(Integer status)
  {
    this.status = status;
  }
  
  public Orgnization getParentID()
  {
    return this.parentID;
  }
  
  public void setParentID(Orgnization parentID)
  {
    this.parentID = parentID;
  }
  
  public String getOrgCodeXb()
  {
    return this.orgCodeXb;
  }
  
  public void setOrgCodeXb(String orgCodeXb)
  {
    this.orgCodeXb = orgCodeXb;
  }

public String getOrgType() {
	return orgType;
}

public void setOrgType(String orgType) {
	this.orgType = orgType;
}

public String getEx01() {
	return ex01;
}

public void setEx01(String ex01) {
	this.ex01 = ex01;
}

public String getEx02() {
	return ex02;
}

public void setEx02(String ex02) {
	this.ex02 = ex02;
}

public String getIx01() {
	return ix01;
}

public void setIx01(String ix01) {
	this.ix01 = ix01;
}

public String getIx02() {
	return ix02;
}

public void setIx02(String ix02) {
	this.ix02 = ix02;
}
}
