package com.messi.model;

import java.util.Date;

public class CustomerPolicyRegistration {
  
	private int cust_policy_id;
	private int cust_id;
	private int policy_id;//link to policy
	private String premium_type;
	private int agent_id;//link to agent
	private Date date;
	private String nominee_name;
	private String relationship;
	private float agent_comm_premium_amount;
	private boolean terms_conditions;
	
	public CustomerPolicyRegistration() {}

	public CustomerPolicyRegistration(int cust_policy_id, int cust_id, int policy_id, String premium_type, int agent_id,
			Date date, String nominee_name, String relationship, float agent_comm_premium_amount,
			boolean terms_conditions) {
		super();
		this.cust_policy_id = cust_policy_id;
		this.cust_id = cust_id;
		this.policy_id = policy_id;
		this.premium_type = premium_type;
		this.agent_id = agent_id;
		this.date = date;
		this.nominee_name = nominee_name;
		this.relationship = relationship;
		this.agent_comm_premium_amount = agent_comm_premium_amount;
		this.terms_conditions = terms_conditions;
	}

	public int getCust_policy_id() {
		return cust_policy_id;
	}

	public void setCust_policy_id(int cust_policy_id) {
		this.cust_policy_id = cust_policy_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPremium_type() {
		return premium_type;
	}

	public void setPremium_type(String premium_type) {
		this.premium_type = premium_type;
	}

	public int getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNominee_name() {
		return nominee_name;
	}

	public void setNominee_name(String nominee_name) {
		this.nominee_name = nominee_name;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public float getAgent_comm_premium_amount() {
		return agent_comm_premium_amount;
	}

	public void setAgent_comm_premium_amount(float agent_comm_premium_amount) {
		this.agent_comm_premium_amount = agent_comm_premium_amount;
	}

	public boolean isTerms_conditions() {
		return terms_conditions;
	}

	public void setTerms_conditions(boolean terms_conditions) {
		this.terms_conditions = terms_conditions;
	}
	
	
	
	
	
	
	
	
	
	
}
