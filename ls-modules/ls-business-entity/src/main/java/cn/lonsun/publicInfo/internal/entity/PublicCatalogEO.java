/*
 * PublicCatalogEO.java         2015年12月5日 <br/>
 *
 * Copyright (c) 1994-1999 AnHui LonSun, Inc. <br/>
 * All rights reserved.	<br/>
 *
 * This software is the confidential and proprietary information of AnHui	<br/>
 * LonSun, Inc. ("Confidential Information").  You shall not	<br/>
 * disclose such Confidential Information and shall use it only in	<br/>
 * accordance with the terms of the license agreement you entered into	<br/>
 * with Sun. <br/>
 */

package cn.lonsun.publicInfo.internal.entity;

import cn.lonsun.core.base.entity.AMockEntity;

import javax.persistence.*;

/**
 * 公开目录 <br/>
 *
 * @author fangtinghua <br/>
 * @version v1.0 <br/>
 * @date 2015年12月5日 <br/>
 */
@Entity
@Table(name = "CMS_PUBLIC_CATALOG")
public class PublicCatalogEO extends AMockEntity {

    /**
     * serialVersionUID:TODO.
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;// 主键
    @Column(name = "PARENT_ID")
    private Long parentId;
    @Column(name = "CODE")
    private String code;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SORT_NUM")
    private Integer sortNum;
    @Column(name = "type")
    private Integer type;// 类型，公开、私有 (1是公共的，2是私有的)
    @Column(name = "LINK")
    private String link;// 转向链接
    @Column(name = "DESCRIPTION")
    private String description;// 目录描述
    @Column(name = "IS_PARENT")
    private Boolean isParent = Boolean.FALSE;// 是否是父节点
    @Column(name = "LEADER")
    private String leader;//分管领导
    @Column(name = "PERSON_LIABLE")
    private String personLiable;//责任人
    @Column(name = "PHONE")
    private String phone;//联系电话
    @Column(name = "IS_SHOW")
    private Boolean isShow = Boolean.TRUE;// 是否显示

    @Column(name = "REL_CAT_IDS")
    private String relCatIds;//信息公开关联调用的目录ids
    @Column(name = "REL_CAT_NAMES")
    private String relCatNames;//信息公开关联调用的目录名称s
    //引用到栏目的ID
    @Column(name = "REFER_COLUMN_IDS")
    private String referColumnIds;

    //引用到栏目的名称
    @Column(name = "REFER_COLUMN_NAMES")
    private String referColumnNames;

    //引用到信息公开目录的ID
    @Column(name = "REFER_ORGAN_CAT_IDS")
    private String referOrganCatIds;

    //引用到信息公开目录的名称
    @Column(name = "REFER_ORGAN_CAT_NAMES")
    private String referOrganCatNames;

    @Column(name = "UPDATE_CYCLE")
    private Integer updateCycle = 0;//更新周期
    @Column(name = "YELLOW_CARD_WARNING")
    private Integer yellowCardWarning = 0;//黄牌警示天数
    @Column(name = "RED_CARD_WARNING")
    private Integer redCardWarning = 0;//红牌警示天数
    @Column(name = "ATTRIBUTE")
    private String attribute;// 目录属性，例如文件类型、解读材料类型等
    @Column(name = "COLUMN_TYPE_IDS")
    private String columnTypeIds;// 栏目类别ids
    @Column(name = "KEY_WORDS")
    private String keyWords;// 目录关键字
    @Column(name = "BACKUP1")
    private String backup1;// 备用字段1
    @Column(name = "BACKUP2")
    private String backup2;// 备用字段2

    @Transient
    private String uri;// 生成静态借用
    @Transient
    private int rowIndex;// 导入时的行号
    @Transient
    private Long organId; // 信息公开数据导入时使用
    @Transient
    private Integer isBlankCat;//是否是空白目录
    @Transient
    private String catPath;//目录全路径
    @Transient
    private String sortStr;//排序号组合字符串
    @Transient
    private Integer isReferColumn = 0;//0-否 1-是

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getPersonLiable() {
        return personLiable;
    }

    public void setPersonLiable(String personLiable) {
        this.personLiable = personLiable;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getRelCatIds() {
        return relCatIds;
    }

    public void setRelCatIds(String relCatIds) {
        this.relCatIds = relCatIds;
    }

    public String getRelCatNames() {
        return relCatNames;
    }

    public void setRelCatNames(String relCatNames) {
        this.relCatNames = relCatNames;
    }

    public Integer getUpdateCycle() {
        return updateCycle;
    }

    public void setUpdateCycle(Integer updateCycle) {
        this.updateCycle = updateCycle;
    }

    public Integer getYellowCardWarning() {
        return yellowCardWarning;
    }

    public void setYellowCardWarning(Integer yellowCardWarning) {
        this.yellowCardWarning = yellowCardWarning;
    }

    public Integer getRedCardWarning() {
        return redCardWarning;
    }

    public void setRedCardWarning(Integer redCardWarning) {
        this.redCardWarning = redCardWarning;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getColumnTypeIds() {
        return columnTypeIds;
    }

    public void setColumnTypeIds(String columnTypeIds) {
        this.columnTypeIds = columnTypeIds;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1;
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2;
    }

    public Long getOrganId() {
        return organId;
    }

    public void setOrganId(Long organId) {
        this.organId = organId;
    }

    public Integer getIsBlankCat() {
        return isBlankCat;
    }

    public void setIsBlankCat(Integer isBlankCat) {
        this.isBlankCat = isBlankCat;
    }

    public String getCatPath() {
        return catPath;
    }

    public void setCatPath(String catPath) {
        this.catPath = catPath;
    }

    public String getSortStr() {
        return sortStr;
    }

    public void setSortStr(String sortStr) {
        this.sortStr = sortStr;
    }

    public String getReferColumnIds() {
        return referColumnIds;
    }

    public void setReferColumnIds(String referColumnIds) {
        this.referColumnIds = referColumnIds;
    }

    public String getReferColumnNames() {
        return referColumnNames;
    }

    public void setReferColumnNames(String referColumnNames) {
        this.referColumnNames = referColumnNames;
    }

    public String getReferOrganCatIds() {
        return referOrganCatIds;
    }

    public void setReferOrganCatIds(String referOrganCatIds) {
        this.referOrganCatIds = referOrganCatIds;
    }

    public String getReferOrganCatNames() {
        return referOrganCatNames;
    }

    public void setReferOrganCatNames(String referOrganCatNames) {
        this.referOrganCatNames = referOrganCatNames;
    }

    public Integer getIsReferColumn() {
        return isReferColumn;
    }

    public void setIsReferColumn(Integer isReferColumn) {
        this.isReferColumn = isReferColumn;
    }
}