package com.miracle.util;

public class Constants {
	//172.17.16.151
	public static final String JDBC_URL = "jdbc:mysql://192.168.5.10:3306/sample";
	 //public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "ilikerandompasswords";

	// Data base colomns
	public static final String VENDOR_TIER_ID = "vendor_tier_id";
	public static final String STATUS = "status";
	public static final String CUSTOMER_NAME = "CustomerName";
	public static final String CUSTOMER_ID = "customer_id";
	public static final String ACCOUNT_ID = "account_id";
	public static final String VENDOR_ID = "vendor_id";	
	public static final String VENDOR_NAME = "VendorName";
	
	public static final String RELATED_ORG_ID = "related_org_Id";	
	public static final String ORG_NAME = "OrganizationName";
	
	public static final String ACC_ID = "acc_id";
	
	public static final String ACCOUNT_NAME = "account_name";
	public static final String NO_OF_RESOURCE = "no_of_resources";
	public static final String PRO_REQ_SKILLS = "proj_req_skillset";
	public static final String REQ_SKILLS = "req_skills";
	public static final String REQ_NAME = "req_name";
	public static final String REQ_ID = "requirement_id";
	public static final String PROJECT_ID = "project_id";
	
	
	
	

	// Data base queries
	
	public static final String CUSTOMER_LIST = "SELECT customer_id,CustomerName FROM test.customer_ven where vendorId=?;";
	
	public static final String VENDOR_CUSTOMER_LIST = "SELECT distinct cus.customer_id,acc.account_name CustomerName,acc.account_id,acc.status,cus.vendor_tier_id,cus.is_permanent "
			+ "FROM servicebay.customer_ven_rel cus, servicebay.accounts acc "
			+ "where acc.account_id=cus.customer_id and cus.vendor_id=? limit 5;";

	public static final String CUSTOMER_VENDOR_LIST = "SELECT distinct cus.vendor_id,acc.account_id,acc.account_name VendorName,acc.status "
			+ "FROM servicebay.customer_ven_rel cus, servicebay.accounts acc "
			+ "where acc.account_id=cus.vendor_id and cus.customer_id=?;";

	public static final String ORGANIZATION_LIST = "SELECT distinct orgrel.related_org_Id,acc.account_name OrganizationName,acc.status "
			+ "FROM servicebay.accounts acc,servicebay.org_rel orgrel,servicebay.users user "
			+ "where acc.account_id=orgrel.related_org_Id and user.usr_id=1001 and orgrel.org_id=10001 and user.org_id=orgrel.org_id;";

	public static final String SKILLSET_AND_NORESOURCES_LIST = "SELECT distinct acc.account_name,req.no_of_resources,proj.proj_req_skillset,req.req_skills,req.req_name,req.requirement_id,"
			+ "proj.acc_id,proj.proj_name,proj.project_id,proj.proj_status,req.jdid,req.req_type,req.req_status "
			+ "FROM servicebay.acc_projects proj,servicebay.acc_requirements req, servicebay.accounts acc "
			+ "where proj.acc_id=req.acc_id and acc.account_id=req.acc_id and proj.acc_id=req.acc_id and acc.account_id=?;";

}
