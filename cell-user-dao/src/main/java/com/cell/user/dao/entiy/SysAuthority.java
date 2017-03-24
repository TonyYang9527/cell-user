package com.cell.user.dao.entiy;

public class SysAuthority {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.organization_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Long organizationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.job_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Long jobId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.user_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.group_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Long groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.role_ids
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private String roleIds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_authority.type
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    private Boolean type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.id
     *
     * @return the value of sys_authority.id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.id
     *
     * @param id the value for sys_authority.id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.organization_id
     *
     * @return the value of sys_authority.organization_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.organization_id
     *
     * @param organizationId the value for sys_authority.organization_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.job_id
     *
     * @return the value of sys_authority.job_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Long getJobId() {
        return jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.job_id
     *
     * @param jobId the value for sys_authority.job_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.user_id
     *
     * @return the value of sys_authority.user_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.user_id
     *
     * @param userId the value for sys_authority.user_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.group_id
     *
     * @return the value of sys_authority.group_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.group_id
     *
     * @param groupId the value for sys_authority.group_id
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.role_ids
     *
     * @return the value of sys_authority.role_ids
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.role_ids
     *
     * @param roleIds the value for sys_authority.role_ids
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds == null ? null : roleIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_authority.type
     *
     * @return the value of sys_authority.type
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public Boolean getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_authority.type
     *
     * @param type the value for sys_authority.type
     *
     * @mbggenerated Fri Mar 24 17:07:32 CST 2017
     */
    public void setType(Boolean type) {
        this.type = type;
    }
}