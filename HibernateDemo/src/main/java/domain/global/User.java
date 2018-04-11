//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package domain.global;

import domain.BaseDomain;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import util.JsonDateSerializer;

import javax.persistence.*;
import java.util.Date;

@Entity
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(
        name = "TUSER"
)
public class User extends BaseDomain {
    private static final long serialVersionUID = -7584040271760492649L;
    public static final int USER_LOCKED = 1;
    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "ID_GENERATOR"
    )
    @TableGenerator(
            name = "ID_GENERATOR",
            table = "TSEQUENCE",
            pkColumnName = "NAME",
            pkColumnValue = "TUSER",
            valueColumnName = "ID",
            allocationSize = 1
    )
    @Column(
            name = "ID"
    )
    private Integer id;
    @Column(
            name = "USERID"
    )
    private String userId;
    @Column(
            name = "USERNAME"
    )
    private String userName;
    @Column(
            name = "PASSWORD"
    )
    private String password;
    @Column(
            name = "USERTYPE"
    )
    private Integer userType;
    @Column(
            name = "LOCKED"
    )
    private Integer locked;
    @ManyToOne(fetch=FetchType.EAGER,optional=true)
    @JoinColumn(name="TORGNIZATION_ID")
    @NotFound(action= NotFoundAction.IGNORE)

//  @JsonView(WithoutChildListView.class)
    private Orgnization orgId;
    @Column(
            name = "CREATEDATE"
    )
    private Date createDate;
    @Column(
            name = "GRADE"
    )
    private Integer grade = Integer.valueOf(0);
    @Column(
            name = "OPENID"
    )
    private String openId;

    @Column(name ="OFFICE")
    private  String office;

    @Column(name="JOB")
    private String job;
    @Column(name="QQ")
    private String qq;
    @Column(name="WXH")
    private  String wxh;
    @Column(name="OFFICEPHONE")
    private String officephone;
    @Column(name="PHONE")
    private String phone;
    @Column(name="EMAIL")
    private String email;
    @Column(name="ex02")
    private String ex02;
    @Column(name="ex03")
    private String ex03;
    @Column(name="ex04")
    private String ex04;
    @Column(name="ex05")
    private String ex05;

    public String getEx01() {
        return ex01;
    }

    public void setEx01(String ex01) {
        this.ex01 = ex01;
    }

    public String getEx05() {
        return ex05;
    }

    public void setEx05(String ex05) {
        this.ex05 = ex05;
    }

    public String getEx04() {
        return ex04;
    }

    public void setEx04(String ex04) {
        this.ex04 = ex04;
    }

    public String getEx03() {
        return ex03;
    }

    public void setEx03(String ex03) {
        this.ex03 = ex03;
    }

    public String getEx02() {
        return ex02;
    }

    public void setEx02(String ex02) {
        this.ex02 = ex02;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWxh() {
        return wxh;
    }

    public void setWxh(String wxh) {
        this.wxh = wxh;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Column(name="ex01")
    private String ex01;

    public String getOfficephone() {
        return officephone;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public User() {
    }

    @Column(
            updatable = false
    )
    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getLocked() {
        return this.locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    @JsonSerialize(
            using = JsonDateSerializer.class
    )
    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }



    public Orgnization getOrgId() {
        return orgId;
    }

    public void setOrgId(Orgnization orgId) {
        this.orgId = orgId;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
