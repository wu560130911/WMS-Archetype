/**
 * 
 */
package ${package}.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.struts2.json.annotations.JSON;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * @author WMS
 * 用户实体，包含对用户的信息
 */
@Entity
public class User {

	@Id
	@Column(length = 20, nullable = false)
	private String id;// 账号

	@Column(length = 20, nullable = false)
	private String name;// 姓名

	@Column(length = 80, nullable = false)
	private String password;// 密码

	@Column(length = 80, nullable = false)
	private String birthplace;// 住址

	@Temporal(TemporalType.DATE)
	private Date birthday;// 出生时间

	@Column(length = 30, nullable = false)
	private String email;// 电子邮件

	@Column(length = 30)
	private String phone;// 电话

	@Column(length = 15, nullable = false)
	private String ip;// 注册ip

	@Temporal(TemporalType.TIMESTAMP)
	private Date regtime;// 注册时间

	private boolean disable;// 是否被锁定

	private String salt;// 加密字符串

	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = { @JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = { @JoinColumn(name = "role_id", referencedColumnName = "id") })
	@Fetch(FetchMode.SUBSELECT)
	private Set<Role> roles;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JSON(serialize = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	@JSON(format = "yyyy-MM-dd")
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@JSON(format = "yyyy-MM-dd HH:mm:ss")
	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	public boolean isDisable() {
		return disable;
	}

	public void setDisable(boolean disable) {
		this.disable = disable;
	}

	@JSON(serialize = false)
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@JSON(serialize = false)
	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
