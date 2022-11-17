package com.rugbyaholic.techshare.auth;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.rugbyaholic.techshare.common.ImageFile;

public class AuthenticatedUser implements UserDetails {

	private static final long serialVersionUID = -3047963961151549314L;

	private static final Collection<? extends GrantedAuthority> authorities = null;
	
	private long id;
	
	private String email;
	
	private Date avf;
	
	private String username;
	
	private String password;
	
	private boolean expired;
	
	private boolean locked;
	
	private List<String> roles;
	
	private String empNo;
	
	private String deptName;
	
	private String posName;
	
	private ImageFile profileImage;

	
	
	/**
	 * @Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles.stream()
					.map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList());
	}
	 */
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return !expired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return !locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return !expired;
	}

	@Override
	public boolean isEnabled() {
		return !locked;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAvf() {
		return avf;
	}

	public void setAvf(Date avf) {
		this.avf = avf;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setExpired(boolean expired) {
		this.expired = expired;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public ImageFile getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(ImageFile profileImage) {
		this.profileImage = profileImage;
	}
}