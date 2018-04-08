package domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/23.
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "PJBZ_TXGL")
public class Pjbztxgl extends BaseDomain {
    private static final long serialVersionUID = 2426977368417962260L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ID_GENERATOR")
    @TableGenerator(name = "ID_GENERATOR", table = "TSEQUENCE", pkColumnName = "NAME", pkColumnValue = "PJBZ_TXGL", valueColumnName = "ID", allocationSize = 1)

    @Column(name = "ID")
    private Integer Id;// ID

    @Column(name = "TXMC")
    private String txmc;// 体系名称

    @Column(name = "PJLX")
    private String pjlx;// 评价类型

    @Column(name = "MXKCLX")
    private String mxkclx;// 面向课程类型

    @Column(name = "MXJS")
    private String mxjs;// 面向角色

    @Column(name = "SFSX")
    private String sfsx;// 是否生效

    @Column(name = "STARTXQ")
    private String startxq;// 开始学期

    @Column(name = "ENDXQ")
    private String endxq;// 结束学期

    @Column(name = "ZBZFZ")
    private String zbzfz;// 指标总分值

    public Pjbztxgl(){

    }

    public Pjbztxgl(String txmc, String pjlx, String mxkclx, String mxjs, String sfsx, String startxq, String endxq, String zbzfz) {
        this.txmc = txmc;
        this.pjlx = pjlx;
        this.mxkclx = mxkclx;
        this.mxjs = mxjs;
        this.sfsx = sfsx;
        this.startxq = startxq;
        this.endxq = endxq;
        this.zbzfz = zbzfz;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getTxmc() {
        return txmc;
    }

    public void setTxmc(String txmc) {
        this.txmc = txmc;
    }

    public String getPjlx() {
        return pjlx;
    }

    public void setPjlx(String pjlx) {
        this.pjlx = pjlx;
    }

    public String getMxkclx() {
        return mxkclx;
    }

    public void setMxkclx(String mxkclx) {
        this.mxkclx = mxkclx;
    }

    public String getMxjs() {
        return mxjs;
    }

    public void setMxjs(String mxjs) {
        this.mxjs = mxjs;
    }

    public String getSfsx() {
        return sfsx;
    }

    public void setSfsx(String sfsx) {
        this.sfsx = sfsx;
    }

    public String getStartxq() {
        return startxq;
    }

    public void setStartxq(String startxq) {
        this.startxq = startxq;
    }

    public String getEndxq() {
        return endxq;
    }

    public void setEndxq(String endxq) {
        this.endxq = endxq;
    }

    public String getZbzfz() {
        return zbzfz;
    }

    public void setZbzfz(String zbzfz) {
        this.zbzfz = zbzfz;
    }
}
