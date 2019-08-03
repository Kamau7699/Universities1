package com.bbit.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

public class Job {

	@JsonProperty("job_type")
	private String jobType;

	@JsonProperty("country")
	private String country;

	@JsonProperty("description")
	private String description;

	@JsonProperty("employer_name")
	private String employerName;

	@JsonProperty("title")
	private String title;

	@JsonProperty("salary_max_cents")
	private int salaryMaxCents;

	@JsonProperty("number_of_positions")
	private int numberOfPositions;

	@JsonProperty("responsibilities")
	private String responsibilities;

	@JsonProperty("job_start_date")
	private Object jobStartDate;

	@JsonProperty("campaign_end_date")
	private String campaignEndDate;

	@JsonProperty("job_end_date")
	private Object jobEndDate;

	@JsonProperty("job_level")
	private String jobLevel;

	@JsonProperty("required_work_experience_months")
	private int requiredWorkExperienceMonths;

	@JsonProperty("responsibilities_raw")
	private String responsibilitiesRaw;

	@JsonProperty("salary_min_cents")
	private int salaryMinCents;

	@JsonProperty("listing_type")
	private String listingType;

	@JsonProperty("salary_min_currency")
	private String salaryMinCurrency;

	@JsonProperty("employer_logo")
	private String employerLogo;

	@JsonProperty("salary_info")
	private String salaryInfo;

	@JsonProperty("url")
	private String url;

	@JsonProperty("salary_max_currency")
	private String salaryMaxCurrency;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("contract_type")
	private String contractType;

	@JsonProperty("campaign_start_date")
	private String campaignStartDate;

	@JsonProperty("area_of_work")
	private String areaOfWork;

	@JsonProperty("styled_flow_url")
	private String styledFlowUrl;

	@JsonProperty("location")
	private String location;

	public void setJobType(String jobType){
		this.jobType = jobType;
	}

	public String getJobType(){
		return jobType;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setEmployerName(String employerName){
		this.employerName = employerName;
	}

	public String getEmployerName(){
		return employerName;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setSalaryMaxCents(int salaryMaxCents){
		this.salaryMaxCents = salaryMaxCents;
	}

	public int getSalaryMaxCents(){
		return salaryMaxCents;
	}

	public void setNumberOfPositions(int numberOfPositions){
		this.numberOfPositions = numberOfPositions;
	}

	public int getNumberOfPositions(){
		return numberOfPositions;
	}

	public void setResponsibilities(String responsibilities){
		this.responsibilities = responsibilities;
	}

	public String getResponsibilities(){
		return responsibilities;
	}

	public void setJobStartDate(Object jobStartDate){
		this.jobStartDate = jobStartDate;
	}

	public Object getJobStartDate(){
		return jobStartDate;
	}

	public void setCampaignEndDate(String campaignEndDate){
		this.campaignEndDate = campaignEndDate;
	}

	public String getCampaignEndDate(){
		return campaignEndDate;
	}

	public void setJobEndDate(Object jobEndDate){
		this.jobEndDate = jobEndDate;
	}

	public Object getJobEndDate(){
		return jobEndDate;
	}

	public void setJobLevel(String jobLevel){
		this.jobLevel = jobLevel;
	}

	public String getJobLevel(){
		return jobLevel;
	}

	public void setRequiredWorkExperienceMonths(int requiredWorkExperienceMonths){
		this.requiredWorkExperienceMonths = requiredWorkExperienceMonths;
	}

	public int getRequiredWorkExperienceMonths(){
		return requiredWorkExperienceMonths;
	}

	public void setResponsibilitiesRaw(String responsibilitiesRaw){
		this.responsibilitiesRaw = responsibilitiesRaw;
	}

	public String getResponsibilitiesRaw(){
		return responsibilitiesRaw;
	}

	public void setSalaryMinCents(int salaryMinCents){
		this.salaryMinCents = salaryMinCents;
	}

	public int getSalaryMinCents(){
		return salaryMinCents;
	}

	public void setListingType(String listingType){
		this.listingType = listingType;
	}

	public String getListingType(){
		return listingType;
	}

	public void setSalaryMinCurrency(String salaryMinCurrency){
		this.salaryMinCurrency = salaryMinCurrency;
	}

	public String getSalaryMinCurrency(){
		return salaryMinCurrency;
	}

	public void setEmployerLogo(String employerLogo){
		this.employerLogo = employerLogo;
	}

	public String getEmployerLogo(){
		return employerLogo;
	}

	public void setSalaryInfo(String salaryInfo){
		this.salaryInfo = salaryInfo;
	}

	public String getSalaryInfo(){
		return salaryInfo;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setSalaryMaxCurrency(String salaryMaxCurrency){
		this.salaryMaxCurrency = salaryMaxCurrency;
	}

	public String getSalaryMaxCurrency(){
		return salaryMaxCurrency;
	}

	public void setCountryCode(String countryCode){
		this.countryCode = countryCode;
	}

	public String getCountryCode(){
		return countryCode;
	}

	public void setContractType(String contractType){
		this.contractType = contractType;
	}

	public String getContractType(){
		return contractType;
	}

	public void setCampaignStartDate(String campaignStartDate){
		this.campaignStartDate = campaignStartDate;
	}

	public String getCampaignStartDate(){
		return campaignStartDate;
	}

	public void setAreaOfWork(String areaOfWork){
		this.areaOfWork = areaOfWork;
	}

	public String getAreaOfWork(){
		return areaOfWork;
	}

	public void setStyledFlowUrl(String styledFlowUrl){
		this.styledFlowUrl = styledFlowUrl;
	}

	public String getStyledFlowUrl(){
		return styledFlowUrl;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"Job{" +
			"job_type = '" + jobType + '\'' + 
			",country = '" + country + '\'' + 
			",description = '" + description + '\'' + 
			",employer_name = '" + employerName + '\'' + 
			",title = '" + title + '\'' + 
			",salary_max_cents = '" + salaryMaxCents + '\'' + 
			",number_of_positions = '" + numberOfPositions + '\'' + 
			",responsibilities = '" + responsibilities + '\'' + 
			",job_start_date = '" + jobStartDate + '\'' + 
			",campaign_end_date = '" + campaignEndDate + '\'' + 
			",job_end_date = '" + jobEndDate + '\'' + 
			",job_level = '" + jobLevel + '\'' + 
			",required_work_experience_months = '" + requiredWorkExperienceMonths + '\'' + 
			",responsibilities_raw = '" + responsibilitiesRaw + '\'' + 
			",salary_min_cents = '" + salaryMinCents + '\'' + 
			",listing_type = '" + listingType + '\'' + 
			",salary_min_currency = '" + salaryMinCurrency + '\'' + 
			",employer_logo = '" + employerLogo + '\'' + 
			",salary_info = '" + salaryInfo + '\'' + 
			",url = '" + url + '\'' + 
			",salary_max_currency = '" + salaryMaxCurrency + '\'' + 
			",country_code = '" + countryCode + '\'' + 
			",contract_type = '" + contractType + '\'' + 
			",campaign_start_date = '" + campaignStartDate + '\'' + 
			",area_of_work = '" + areaOfWork + '\'' + 
			",styled_flow_url = '" + styledFlowUrl + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}