package org.csh.PersonnelManagementSystem.entity;

import java.util.Date;

public class personnelAdjustSalary {
    /*
    员工编号，主键
     */
    static Integer personnelID;
    /*
    培训日期
     */
    static Date AdjustSalaryDate;
    /*
    调前薪资
     */
    static Double beforeAdjustSalary;
    /*
    调后薪资
     */
    static Double afterAdjustSalary;
    /*
    调薪原因
     */
    static String AdjustSalaryReason;
    /*
    备注
     */
    static String remark;
}
